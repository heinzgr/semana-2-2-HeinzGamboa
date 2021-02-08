package com.ucreativa;

public class Impresora {
	
	private String tipo;//Inyeccion, Laser, Matriz de Puntos, Termica
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


	public int getNumeroImpresionesMaximo() {
		return numeroImpresionesMaximo;
	}


	public void setNumeroImpresionesMaximo(int numeroImpresionesMaximo) {
		this.numeroImpresionesMaximo = numeroImpresionesMaximo;
	}


	private String marca;
	private String modelo;
	private int numeroImpresionesMaximo;
	
	
	public Impresora(String tipoImp, String marcaImp, String modeloImp, int maximoImpresiones) {
		// TODO Auto-generated constructor stub
		this.tipo = tipoImp;
		this.marca = marcaImp;
		this.modelo = modeloImp;
		this.numeroImpresionesMaximo = maximoImpresiones;
	}

	@Override
	public String toString() {
		return "Mi Impresora => "	
				+ "Tipo:"+ this.tipo
				+ ", Marca:" + this.marca
				+ ", Modelo:" +	this.modelo
				+ ", Maximo de hojas a imprimir: " + this.numeroImpresionesMaximo;
	}
	
	public String cambiarModo(String modo) {
		return modo;
	}
	
	public String imprimirDocumento(String documento) {
		return documento;
	}	
	
	public String estado() {
		String estadoActual = "Lista";
		return estadoActual;
	}
}
