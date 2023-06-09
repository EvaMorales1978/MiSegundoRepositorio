package cuentas;

/**
 * 
 * Implementa un programa en el q podemos operar con una cuenta bancaria
 * sacando e ingresando dinero.
 * @author entornos
 * @version 1.0
 * @since Marzo 2023 
 *
 */
public class Main {

    public static void main(String[] args) {
        opertiva_cuenta(2300);
    }
    
    /**
     * Se define una cuenta, en la que se retira una cantidad pasada como parametro
     * y se ingresa una cantidad fija.
     * @param cantidad, cantidad a retirar
     */
	private static void opertiva_cuenta(float cantidad) {
		CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
