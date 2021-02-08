/**
 * 
 */
package com.ucreativa;

/**
 * @author HeinzGR
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisor myTV = new Televisor("Plasma","Samsung","4k",true);
		System.out.println("Instancia 1");
		System.out.println(myTV.toString());
		
		Telefono myPhone = new Telefono("SmartPhone", "Samsung", 14, "Negro", false);
		System.out.println("Instancia 2");
		System.out.println(myPhone.toString());
		
		Computadora myComputer = new Computadora("Win10", "Laptop", "HP", "ProBook", 15, "intel core i5", 8);
		System.out.println("Instancia 3");
		System.out.println(myComputer.toString());
		
		Lavadora miLavadora = new Lavadora("Automatico", "Samsung", "X1170",15);
		System.out.println("Instancia 4");
		System.out.println(miLavadora.toString());
		
		Impresora myPrinter = new Impresora("Inyeccion de Tinta", "HP", "Deskjet 2135",150);
		System.out.println("Instancia 5");
		System.out.println(myPrinter.toString());
	}

}
