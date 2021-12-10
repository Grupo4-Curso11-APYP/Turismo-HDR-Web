package model;

import java.sql.SQLException;
import java.util.Objects;

import persistence.impl.AtraccionDAOImpl;

public class Atraccion implements Ofertable, Comparable<Ofertable> {
	protected int id;
	protected double costo;
	protected double tiempo;
	protected int cupoDisponible;
	protected TipoAtraccion tipoAtraccion;
	protected String nombre;

	/*
	 * @Param nombre , costo, tiempo , cupoDisponible y tipo se inicializan todos
	 * los atributos de la atraccion
	 */
	public Atraccion(String nombre, double costo, double tiempo, int cupoDisponible, TipoAtraccion tipoDeAtraccion)
			throws Exception {
		super();
		this.nombre = nombre;
		validandoCosto(costo);
		validandoTiempo(tiempo);
		validandoCupo(cupoDisponible);
		this.tipoAtraccion = tipoDeAtraccion;
	}
	
	public Atraccion(Integer id, String nombre, double costo, double tiempo, int cupoDisponible) throws Exception {
		//public Atraccion(Integer id, String nombre, double costo, double tiempo, int cupoDisponible, TipoAtraccion tipoDeAtraccion) throws Exception {
		//this(nombre, costo, tiempo, cupoDisponible);
		this.id = id;
	}
	public Atraccion(Integer id) {
		this.id = id;
	}
	
	/*
	 * public Atraccion(String nombre, double costo, double tiempo, int cupoDisponible, TipoAtraccion tipoDeAtraccion)
			throws Exception {
		this.nombre = nombre;
		validandoCosto(costo);
		validandoTiempo(tiempo);
		validandoCupo(cupoDisponible);
		this.tipoAtraccion = tipoDeAtraccion;
	}

	 */

	public boolean esValido(String nombre, double costo, double tiempo, int cupo, String tipo) {
		return ((nombre != null) && (costo > 0) && (tiempo > 0) && (cupo > 0)
				&& (tipo == TipoAtraccion.DEGUSTACION.name() || tipo == TipoAtraccion.PAISAJE.name()
						|| tipo == TipoAtraccion.AVENTURA.name()));
	}

	/*
	 * validaciï¿½n para evitar costo negativo, si lo es, lanza una excepciï¿½n
	 */
	private void validandoCosto(double costo) throws Exception {
		if (costo < 0.0)
			throw new CostoNegativoExcepcion();
		this.costo = costo;
	}

	/*
	 * validaciï¿½n para evitar tiempo negativo, si lo es, lanza una excepciï¿½n
	 */
	private void validandoTiempo(double tiempo) throws Exception {
		if (tiempo < 0.0)
			throw new SinTiempoDisponible();
		this.tiempo = tiempo;
	}

	/*
	 * validaciï¿½n para evitar cupo negativo, si lo es, lanza una excepciï¿½n
	 */
	private void validandoCupo(int cupoDisponible) throws Exception {
		if (cupoDisponible < 0)
			throw new CupoNegativoException();
		this.cupoDisponible = cupoDisponible;
	}

	/*
	 * @param nombre permite pasar un nombre para inicializar el atributo nombre
	 * Constructor auxiliar usado para comparar con el nombre de la lista de
	 * ofertables.
	 */
	

	

	
	/*
	 * se espera que devuelva el cupo disponible
	 */
	public int getCupoDisponible() {
		return cupoDisponible;
	}

	/*
	 * se espera que devuelva el nombre
	 */
	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(costo, nombre, tiempo, tipoAtraccion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atraccion other = (Atraccion) obj;
		return costo == other.costo && Objects.equals(nombre, other.nombre) && tiempo == other.tiempo
				&& tipoAtraccion == other.tipoAtraccion;
	}

	/*
	 * Metodo reservar cupo : si todavia hay cupo de atraccion se restara un cupo
	 * para decir que esta reservado
	 */
	public void reservarCupo() throws SQLException {
		AtraccionDAOImpl aDAO = new AtraccionDAOImpl();
		if (this.hayCupo()) {
			this.cupoDisponible -= 1;
			aDAO.update(this);
		}

	}

	/*
	 * se espera que devuelva el costo
	 */
	@Override
	public Double getMonto() {

		return this.costo;
	}

	/*
	 * se espera que devuelva el tipo
	 */
	@Override
	public TipoAtraccion getTipo() {

		return this.tipoAtraccion;
	}

	/*
	 * Metodo hayCupo : pregunta si todavia hay cupo disponible
	 */
	@Override
	public boolean hayCupo() {
		return this.cupoDisponible > 0;
	}

	/*
	 * se espera que devuelva el tiempo
	 */
	@Override
	public Double getTiempo() {

		return this.tiempo;
	}

	/*
	 * aplica toString a las atracciones para que se muestren en el formato
	 * requerido. Aplica un salto de lï¿½nea con \n para mayor legibilidad.
	 */
	@Override
	public String toString() {
		return getNombre() + ": " + "precio: " + getMonto() + ", duracion: " + getTiempo() + ", tipo: " + getTipo()
				+ '\n';
	}

	@Override
	public int compareTo(Ofertable otro) {
		return -this.getMonto().compareTo(otro.getMonto());
	}
	
	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public TipoAtraccion getTipoAtraccion() {
		return tipoAtraccion;
	}

	public void setTipoAtraccion(TipoAtraccion tipoAtraccion) {
		this.tipoAtraccion = tipoAtraccion;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	public void setCupoDisponible(int cupoDisponible) {
		this.cupoDisponible = cupoDisponible;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
