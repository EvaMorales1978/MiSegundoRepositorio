package cuentas;
/**
 * 
 * Se crea una cuenta que tiene un nombre a la q se le asigna un saldo y un tipo de interes
 * de dicha cuenta se puede ingresar y retirar dinero
 * 
 * @author entornos
 * @version 1.0
 * @since Marzo 2023
 *
 */
public class CCuenta {

	// Metodos de clase. Nombre, cuenta, saldo y tipo de interes.
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }// Constructor

	/**
	 * Constructor que inicializa los parametros de clase ccuenta 
	 * @param nom nobmre de la cuenta
	 * @param cue cuenta
	 * @param sal saldo
	 */    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }// Constructor

	/**
	 * @return devuelve el saldo se la cuenta
	 */    
    public double estado()
    {
        return getSaldo();
    }

    /**
     * 
     * ingresa cantidad en la cuenta
     * @param cantidad, inporte a ingresar
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira cantidad de la cuenta
     * @param cantidad, cantidad a retirar de la cuenta
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
/**
 * Devuelve el nombre
 * @return nombre
 */
	private String getNombre() {
		return nombre;
	}
/**
 * Acatualiza el nombre
 * @param nombre, nombre a actualizar
 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve la cuenta
	 * @return cue
	 */
	private String getCuenta() {
		return cuenta;
	}
	
	/**
	 * Actualiza la cuenta
	 * @param cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * Devuelve el saldo
	 * @return saldo
	 */
	private double getSaldo() {
		return saldo;
	}
	
	/**
	 * Actualiza el saldo
	 * @param saldo
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Devuelve el tipo de interes
	 * @return tipoInterés
	 */
	private double getTipoInterés() {
		return tipoInterés;
	}
	/**
	 * Actualiza el tipo de interés
	 * @param tipoInterés
	 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
