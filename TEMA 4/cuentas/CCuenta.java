package cuentas;

/**
 * Clase que realiza operaciones de una cuenta bancaria.
 * 
 * @author Francisco Carrizo
 * @version 2.0
 * @since 1s.0
 */

public class CCuenta {
	
	//Atributos
    private String nombre;
    private String cuenta;
	private double saldo;
    private double tipoInterés;
       
    /**
     * Metodo get de Nombre
     * @return El nombre del titular de la cuenta
     */
	public String getNombre() {
		return nombre;
	}

    /**
     * Metodo set de Nombre
     * @param nombre Nombre del titular de la cuenta.
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    /**
     * Metodo get de Cuenta
     * @return El codigo de la cuenta
     */
	public String getCuenta() {
		return cuenta;
	}

    /**
     * Metodo set de Cuenta
     * 
     * @param cuenta El codigo de la cuenta
     */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

    /**
     * Metodo get de Saldo
     * 
     * @return El saldo actual de la cuenta
     */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

    /**
     * Metodo get de tipoInteres
     * @return El tipo de interés de la cuenta.
     */
	public double getTipoInterés() {
		return tipoInterés;
	}

    /**
     * Metodo set de tipoInteres
     * @param tipoInteres El tipo de interés de la cuenta.
     */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}



    public CCuenta()
    {
    }

	/**
	 * Constructor que inicializa los parametros de clase main 
	 * @param nombre Nombre del titular de la cuenta
	 * @param cuenta Número de cuenta
	 * @param saldo Saldo de la cuenta
	 */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Consulta el saldo de la cuenta.
     * @return Saldo de la cuenta.
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Suma al saldo de la cuenta la cantidad introducida.
     * 
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Muestra un error si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Resta al saldo de la cuenta la cantidad introducida.
     * @param cantidad Cantidad a retirar.
     * @throws Exception Muestra un error en caso si la cantidad es negativa o no haya suficiente saldo en la cuenta.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
