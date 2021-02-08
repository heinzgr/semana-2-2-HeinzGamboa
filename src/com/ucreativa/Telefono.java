/**
 * 
 */
package com.ucreativa;

/**
 * @author HeinzGR
 *
 */
public class Telefono {
	private String tipo; //Fijo, Mobile, Smartphone, tablet
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getTamanoPulgadas() {
		return tamanoPulgadas;
	}
	public void setTamanoPulgadas(double tamanoPulgadas) {
		this.tamanoPulgadas = tamanoPulgadas;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isAceptaDobleChip() {
		return aceptaDobleChip;
	}
	public void setAceptaDobleChip(boolean aceptaDobleChip) {
		this.aceptaDobleChip = aceptaDobleChip;
	}
	private String marca;
	private double tamanoPulgadas;
	private String color;
	private boolean aceptaDobleChip = false;
	/**
	 * 
	 */
	public Telefono(String tipoTel, String marcaTel, double tamanoPulTel, String colorTel, boolean dobleChip) {
		// TODO Auto-generated constructor stub
		this.tipo = tipoTel;
		this.marca = marcaTel;
		this.tamanoPulgadas = tamanoPulTel;
		this.color = colorTel;
		this.aceptaDobleChip = dobleChip;
	}
	@Override
	public String toString() {
		return "Mi Telefono => Tipo:" + this.tipo + ", Marca:" + this.marca + ", Tamano en pulgadas:" + this.tamanoPulgadas + ", Color:" + this.color + ", Acepta doble chip:" + this.aceptaDobleChip;
	}
	
	public boolean prender(boolean prenderTel) {
		return prenderTel;
	}
	
	public String iniciarAplicacion(String cualApliacion) {
		return cualApliacion;
	}
	
	public String llamarNumero(String cualNumero) {
		return cualNumero;
	}
	
	/**
	 * @param args
	 */
	/**public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono myphone = new Telefono("SmartPhone", "Samsung", 14, "Negro", false);
	}*/

}
