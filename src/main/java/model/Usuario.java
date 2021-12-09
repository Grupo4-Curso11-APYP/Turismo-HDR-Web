package model;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import utils.Crypt;

public class Usuario {
	private String nombre;
	private double presupuesto;
	private double tiempoDisponible;
	//private TipoAtraccion tipoFavorito;
	private String tipoFavorito;//tuve que cambiar esto para poder pasarselo a la BD
	private Set<Ofertable> ofertables; // Las sugerencias que va aceptando.
	private String password;
	private Boolean admin;
	//datos necesarios para insertar usuarios en la bd
	private Integer id;


	/*public Usuario(String nombre, double presupuesto, double tiempoDisponible, TipoAtraccion tipoFavorito,
			String password, Boolean admin) throws Exception {
		this.nombre = nombre;
		validandoPresupuesto(presupuesto);
		validandoTiempoDisponible(tiempoDisponible);
		this.tipoFavorito = tipoFavorito;
		this.ofertables = new LinkedHashSet<>();
		this.password = password;
		this.admin = admin;

	}*/
	
	public Usuario(int id, String nombre, double presupuesto, double tiempoDisponible, String tipoFavorito,
			String password, Boolean admin) throws Exception {
		//public Usuario(int id, String nombre, double presupuesto, double tiempoDisponible, TipoAtraccion tipoFavorito, String password, Boolean admin) throws Exception {
		this.id = id;
		this.nombre = nombre;
		validandoPresupuesto(presupuesto);
		validandoTiempoDisponible(tiempoDisponible);
		this.tipoFavorito = tipoFavorito;
		this.ofertables = new LinkedHashSet<>();
		this.password = password;
		this.admin = admin;

	}

	public Usuario(String string, double i, double j, String tipo, Set<Ofertable> object) throws Exception {
	//public Usuario(String string, double i, double j, TipoAtraccion tipo, Set<Ofertable> object) throws Exception {
		this.nombre = string;
		validandoPresupuesto(i);
		validandoTiempoDisponible(j);
		this.tipoFavorito = tipo;
		this.ofertables = new LinkedHashSet<>();
	}

	/*
	 * validación para evitar presupuesto negativo, si lo es, lanza una excepción
	 */
	private void validandoPresupuesto(double presupuesto) throws Exception {
		if (presupuesto < 0.0)
			throw new SinMontoDisponible();
		this.presupuesto = presupuesto;
	}

	/*
	 * validación para evitar tiempo negativo, si lo es, lanza una excepción
	 */
	private void validandoTiempoDisponible(double tiempo) throws Exception {
		if (tiempo < 0.0)
			throw new SinTiempoDisponible();
		this.tiempoDisponible = tiempo;
	}
	
	/*
	 * se espera que devuelva el tiempo disponible
	 */
	public double getTiempoDisponible() {
		return this.tiempoDisponible;
	}

	/*
	 * se espera que devuelva el presupuesto
	 */
	public double getPresupuesto() {
		return this.presupuesto;
	}

	/*
	 * se espera que devuelva el tipo favorito de atraccion
	 */
	/*public TipoAtraccion getTipoFavorito() { <<=============================================== esto lo comente porque dado que lo pase a string no tiene uso, y rompe todo si se lo dejo
		return this.tipoFavorito;
	}*/
	
	public String getTipoFavorito() {//<<=============================================== esto lo agregue porque dado que lo pase a string no tiene uso, y rompe todo si se lo saco
		return this.tipoFavorito;
	}

	/*
	 * se espera que devuelva el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/*
	 * se espera que devuelva una lista de ofertables
	 */
	public Set<Ofertable> getOfertables() {
		return this.ofertables;
	}

	public boolean esValido(String nombre, String password, double presupuesto, Double tiempoDisponible,String tipoFavorito) {
		//public boolean esValido(String nombre, String password, double presupuesto, Double tiempoDisponible,TipoAtraccion tipoFavorito) {
		return ((nombre != null) && (password != null) && (presupuesto > 0) && (tiempoDisponible > 0)&&((tipoFavorito == "AVENTURA")||(tipoFavorito == "DEGUSTACION")||(tipoFavorito == "PAISAJE")));
		//return ((nombre != null) && (password != null) && (presupuesto > 0) && (tiempoDisponible > 0)&&((tipoFavorito == tipoFavorito.AVENTURA)||(tipoFavorito == tipoFavorito.DEGUSTACION)||(tipoFavorito == tipoFavorito.PAISAJE)));
	}

	/*
	 * Muestra todos los datos del usuario mas sus ofertables aceptados en formato
	 * itinerario, calculando el tiempo y costo total para completar su agenda.
	 */
	@Override
	public String toString() {

		double horas = 0;
		double costoFinal = 0;
		for (Ofertable ofertable : ofertables) {
			horas += ofertable.getTiempo();
			costoFinal += ofertable.getMonto();
		}

		String aux = '\n' + "Usuario: " + nombre + ", presupuesto: " + presupuesto + ", tiempo disponible: "
				+ tiempoDisponible + ", tipo favorito: " + tipoFavorito + '\n'
				+ "Su itinerario final le tomara un total " + "de: " + horas + " horas; con un costo final de: "
				+ (int) costoFinal + " monedas." + '\n' + "Sugerencias incluidas:\n";

		for (Ofertable ofertable : ofertables) {
			aux += ofertable.toString();
		}
		return aux;
	}

	/*
	 * @Param tiempo metodo privado para restar un tiempo al atributo
	 * tiempoDisponible
	 */
	double restarTiempo(double tiempo) {
		return this.tiempoDisponible -= tiempo;
	}

	/*
	 * @Param monto metodo privado para restar un presupuesto al atributo
	 * presupuesto
	 */
	double restarPresupuesto(double monto) {
		return this.presupuesto -= monto;
	}

	/*
	 * @Param o pasa el ofertable que el usuario va a comprar al aceptar sugerencia
	 * una vez que el usuario compra un ofertable sugerido se le restara el
	 * presupuesto y el tiempo del ofertable comprado finalmente guarda el ofertable
	 * en su lista de ofertables
	 */
	public void comprarOfertable(Ofertable o) {
		double tiempoO = o.getTiempo();
		double presupuesto = o.getMonto();

		restarTiempo(tiempoO);
		restarPresupuesto(presupuesto);
		ofertables.add(o);

	}

	public boolean puedeComprar(Ofertable ofertable) {
		return this.getPresupuesto() >= ofertable.getMonto() && this.getTiempoDisponible() >= ofertable.getTiempo();
	}

	public boolean checkPassword(String password) {
		// this.password en realidad es el hash del password
		return Crypt.match(password, this.password);
	}

	public Boolean getAdmin() {
		return admin;
	}

	public String getPassword() {
		return password;
	}

	public Boolean isAdmin() {
		return admin;
	}

	public boolean isNull() {
		return false;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	public void setPassword(String password) {
		this.password = Crypt.hash(password);
	}

	public void setTiempoDisponible(Double tiempo) {
		this.tiempoDisponible = tiempo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
