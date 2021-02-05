package Carrera;
/*
 * 
 * @author Javier Legua
 * 
 */
import java.util.Scanner;

public class Carrera {
	private String nombre;
	private int distanciaCarrera;
	private Coche vCoches[];

	public Carrera(String nombre, int distanciaCarrera) {
		this.nombre = nombre;
		this.distanciaCarrera = distanciaCarrera;
		this.vCoches = new Coche[10];
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

	//Si hay algun coche que haya terminado devuelve false y no puede re-arrancar.
	public boolean reArrancar() {

		for (Coche coche : vCoches) {
			if (coche != null && coche.getEstado().equalsIgnoreCase("Terminado")) {
				return false;
			}
		}
		return true;
	}
	//Si hay algun coche en marcha devuelve false.
	public boolean comprobarCarreraTerminada() {

		for (Coche coche : vCoches) {
			if (coche != null && coche.getEstado().equalsIgnoreCase("Marcha")) {
				return false;
			}
		}
		return true;
	}

	//True si no esta repetido
	public boolean comprobarDorsal(int dorsal) {

		for (Coche coche : vCoches) {
			if (coche != null && dorsal == coche.getDorsal()) {
				return false;
			}
		}
		return true;
	}
	
	public void añadirCoche() {
		
		Scanner leer = new Scanner(System.in);
		boolean humano = false;
		String esHumano;
		int dorsal;
		//Comprueba que haya una posicion vacia y lo guardara ahi.
		for (int i = 0; i < vCoches.length; i++) {
			if (vCoches[i] == null) {
				System.out.println("Dime el nombre del piloto.");
				nombre = leer.nextLine();
				do {
					System.out.println("Dime el dorsal del piloto.");
					dorsal = leer.nextInt();
					//Si comprobarDorsal = false repite porque el dorsal ya esta guardado.
				} while (!comprobarDorsal(dorsal));
				
				System.out.println("Es jugador(SI) o maquina(NO)");
				esHumano = leer.next();
				
				if (esHumano.equalsIgnoreCase("SI")) {
					humano = true;
				}else {
					humano = false;
				}
				
				vCoches[i] = new Coche(nombre, dorsal, this.distanciaCarrera, humano);
				break;
			}
		}
	}
	
	public void empezarCarrera() {
		
		for (Coche coche : vCoches) {
			if(coche != null) {
			coche.setEstado("Marcha");
			}
		}
	}
	
	public void ganador() {
		for (Coche coche : vCoches) {
			if (coche != null && coche.getEstado().equalsIgnoreCase("Terminado")) {
				System.out.println("El ganador es:");
				System.out.println(coche);
				break;
			}
		}
	}

}
