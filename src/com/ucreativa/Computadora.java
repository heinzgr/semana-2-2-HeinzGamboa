/**
 * 
 */
package com.ucreativa;

/**
 * @author hp corei5
 *
 */
public class Computadora {
	private String sistemaOperativo;
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}
	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}
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
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getTamanoEnPulgadas() {
		return tamanoEnPulgadas;
	}
	public void setTamanoEnPulgadas(int tamanoEnPulgadas) {
		this.tamanoEnPulgadas = tamanoEnPulgadas;
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public int getCuantoRam() {
		return cuantoRam;
	}
	public void setCuantoRam(int cuantoRam) {
		this.cuantoRam = cuantoRam;
	}
	private String tipo; //Desktop, Laptop
	private String marca;
	private String modelo;
	private int tamanoEnPulgadas;
	private String procesador;
	private int cuantoRam;
	/**
	 * 
	 */
	public Computadora(String compSistemaOperativo,String compTipo,String compMarca,String compModelo,int compTamanoEnPulgadas,String compProcesador,int compCuantoRam) {
		// TODO Auto-generated constructor stub
		this.sistemaOperativo = compSistemaOperativo;
		this.tipo = compTipo;
		this.marca = compMarca;
		this.modelo = compModelo;
		this.tamanoEnPulgadas = compTamanoEnPulgadas;
		this.procesador = compProcesador;
		this.cuantoRam = compCuantoRam;
	}
	@Override
	public String toString() {
		return "Mi Computadora => "
				+ "Sistema Operativo:" + this.sistemaOperativo
				+ ", Tipo:"+ this.tipo
				+ ", Marca:" + this.marca
				+ ", Modelo:" +	this.modelo
				+ ", Tamano en Pulgadas:" + this.tamanoEnPulgadas
				+ ", Procesador:" +	this.procesador
				+ ", Cantidad de Ram:" +	this.cuantoRam; 
	}
	
	public boolean solicitaCredenciales(String Usuario, String Password) {
		return true;
	}
	
	public String iniciaPrograma(String cualPrograma) {
		return cualPrograma;
	}
	
	public boolean bloquearOS(boolean bloquear) {
		return bloquear;
	}
	
	/**
	 * @param args
	 */
	/**public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computadora mycomputer = new Computadora("SmartPhone", "Samsung", 14, "Negro", false);
	}*/

}
