package cuentas;

/**
 * Clase CCuenta
 * Contiene las diferentes operaciones a realizar con una cuenta.
 * @author Olga
 * @version 2.0
 */
public class CCuenta {
	
	//Atributos
	
	/**
	 * Nombre del titular de la cuenta.
	 */

	public String nombre;
	
	/**
	 * Cuenta con la que operar.
	 */
	public String cuenta;
	/**
	 * Saldo de la cuenta.
	 */
	public double saldo;
	/**
	 * Tipo de interés que tiene la cuenta.
	 */
	public double tipoInteres;
	
	//Metodos publicos
	
	public CCuenta(String string, String string2, int i, int j) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo estado que devuelve el saldo de la cuenta.	
	 * @return
	 */
	public double estado() {
		return getSaldo();
	}
	
/**
 * Metodo ingresar que añade una cantidad de dinero al saldo actual.
 * @param cantidad
 * @throws Exception <ul>
 * 						<li> Lanza una excepcion si la cantidad a ingresar es negativa</li>
 * 					 </ul>
 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setSaldo(getSaldo() + cantidad);
	}
/**
 * Metodo retirar que retira una cantidad del dinero del saldo actual.
 * @param cantidad
 * @throws Exception <ul>
 * 						<li> Lanza una excepcion si la cantidad a retirar es negativa</li>
 * 						<li> Lanza una excepcion si la cantidad a retirar el superior al saldo</li>
 * 					 </ul>
 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		setSaldo(getSaldo() - cantidad);
	}
/**
 * Devuelve el nombre del titular.
 * @return
 */
	private String getNombre() {
		return nombre;
	}
/**
 * Nombre del titular.
 * @param nombre 
 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * Devuelve la cuenta con la que operará el programa.
 * @return
 */
	private String getCuenta() {
		return cuenta;
	}
/**
 * Cuenta a utilizar.
 * @param cuenta
 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * Devuelve el saldo actual de la cuenta.
 * @return
 */
	private double getSaldo() {
		return saldo;
	}
/**
 * Parametro saldo.
 * @param saldo
 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * Devolverá el tipo de interés de la cuenta.
 * @return
 */
	private double getTipoInteres() {
		return tipoInteres;
	}
/**
 * Parametro que controla el tipo de interes.
 * @param tipoInteres
 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
