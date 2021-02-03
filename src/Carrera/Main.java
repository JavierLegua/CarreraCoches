package Carrera;
/*
 * 
 * @author Javier Legua
 * 
 */
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int opc = 0;
		boolean salir = false;

		Carrera carrera = null;
		Coche c = null;

		do {
			opc = Menu.menuCarrera();
			switch (opc) {
			case 1:
				// Empezamos carrera
				carrera.empezarCarrera();
				do {

					for (int i = 0; i < carrera.getvCoches().length; i++) {
						if (carrera.getvCoches()[i] != null) {
							c = carrera.getvCoches()[i];
							if (c.isHumano()) {
								opc = Menu.pintaMenu();
								System.out.println(c.toString());
								//Juega humano
								switch (opc) {
								case 1: {
									c.acelerar();
									break;
								}
								case 2: {
									c.frenar();
									break;
								}
								case 3: {
									c.rearrancar();
									break;
								}
								}
							} else {
								//Juega la maquina
								Random r = new Random();
								switch (r.nextInt(2)) {
								case 0: {
									c.acelerar();
									break;
								}
								case 1: {
									c.frenar();
									break;
								}
								}
								
							}
						}
					}

				} while (!carrera.comprobarCarreraTerminada());
				break;
			case 2:
				carrera.añadirCoche();
				break;
			case 3:
				String nombre = "";
				int distancia = 0;
				Scanner leer = new Scanner(System.in);
				
				System.out.println("Dime el nombre de la carrera.");
				nombre = leer.nextLine();
				System.out.println("Dime la distancia de la carrera.");
				distancia = leer.nextInt();
				
				carrera = new Carrera(nombre, distancia);
				break;
			case 4:
				salir = true;
				break;
			}

		} while (!salir);

	}

}
