package com.bootcamp.MYBOOTCAPPROJECT.persistence;

public class Equipo {
	
	private String name;
	private int puntos;
	
	public Equipo(String name, int puntos) {
		super();
		this.name = name;
		this.puntos = puntos;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Equipo [name=" + name + ", puntos=" + puntos + "]";
	}
	
	

}
