package model;

public class CupoNegativoException extends Exception {
public CupoNegativoException() {
	super("El cupo debe ser mayor que 0");
}
}
