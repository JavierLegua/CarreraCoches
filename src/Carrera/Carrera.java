package Carrera;

import java.util.Scanner;

public class Carrera {
	private String nombre;
	private int distanciaCarrera;
	public static Coche vCoches[];
	
	public Carrera(String nombre, int distanciaCarrera, Coche[] vCoches) {
		this.nombre = nombre;
		this.distanciaCarrera = distanciaCarrera;
		this.vCoches = vCoches;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDistanciaCarrera() {
		return distanciaCarrera;
	}

	public void setDistanciaCarrera(int distanciaCarrera) {
		this.distanciaCarrera = distanciaCarrera;
	}

	public Coche[] getvCoches() {
		return vCoches;
	}

	public void setvCoches(Coche[] vCoches) {
		this.vCoches = vCoches;
	}
	
	
	
	
	
	
}
