package com.ucreativa;

public class Lavadora {
	private String tipo; //Automatica, Semi-Automatica, Manual
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

	public int getKilos() {
		return kilos;
	}

	public void setKilos(int kilos) {
		this.kilos = kilos;
	}

	private String marca;
	private String modelo;
	private int kilos;
	
	public Lavadora(String tipoLavadora,String marcaLavadora, String modeloLavadora, int kilosLavadora) {
		// TODO Auto-generated constructor stub
		this.tipo = tipoLavadora;
		this.marca = marcaLavadora;
		this.modelo = modeloLavadora;
		this.kilos = kilosLavadora;
	}
	@Override
	public String toString() {
		return "Mi Lavadora => "
				
				+ "Tipo:"+ this.tipo
				+ ", Marca:" + this.marca
				+ ", Modelo:" +	this.modelo
				+ ", Kilos a Lavar:" + this.kilos;
	}
	
	public boolean prender(boolean prenderLavadora) {
		return prenderLavadora;
	}
	
	public boolean iniciarCicloCompleto(boolean cicloCompleto) {
		return cicloCompleto;
	}
	
	public String cualFaseIniciar(String Fase) {
		return Fase;
	}
}
