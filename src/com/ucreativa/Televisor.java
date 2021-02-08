/**
 * 
 */
package com.ucreativa;

/**
 * @author HeinzGR
 *
 */
public class Televisor {
	private String tipo; //Led, Cristal Liquido, Plasma
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

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isEsInteligente() {
		return esInteligente;
	}

	public void setEsInteligente(boolean esInteligente) {
		this.esInteligente = esInteligente;
	}

	private String marca;
	private String resolucion;
	private boolean esInteligente = false;

	/**
	 * 
	 */
	public Televisor(String tipoTV, String marcaTV, String resolucionTV, boolean inteligenteTV) {
		// TODO Auto-generated constructor stub
		this.tipo = tipoTV;
		this.marca = marcaTV;
		this.resolucion = resolucionTV;
		this.esInteligente = inteligenteTV;
	}
	@Override
	public String toString() {
		return "Mi Televisor => Tipo:" + this.tipo + ", Marca:" + this.marca + ", Resolucion:" + this.resolucion + ", Es Inteligente?:" + this.esInteligente;
	}
	
	public boolean prender(boolean prenderTV) {
		return prenderTV;
	}
	
	public String cambiarCanal(String cualCanal) {
		return cualCanal;
	}
	
	public String cambiarModo(String cualModo) {
		return cualModo;
	}
	/**
	 * @param args
	 */
	/**public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisor myTV = new Televisor("Plasma","Samsung","4k",true);
	}*/

}
