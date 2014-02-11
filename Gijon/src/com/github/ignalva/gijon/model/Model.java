package com.github.ignalva.gijon.model;

public abstract class Model {
	
	private String title;
	private double latitud;
	private double longitud;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public abstract int getSmallIcon();
	public abstract int getBigIcon(); 
	public abstract int getString();
}
