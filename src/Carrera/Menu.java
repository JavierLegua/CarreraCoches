package Carrera;

import java.util.Scanner;

public class Menu {

	public static int pintaMenu() {

		int opc = 0;

		Scanner leer = new Scanner(System.in);

		do {
			System.out.println("--Gestión Carrera--");
			System.out.println("Pulsa 1 para acelerar to fast and furious");
			System.out.println("Pulsa 2 para hacer un derrape to guapo");
			System.out.println("Pulsa 3 para re-arrancar porque te has flipado acelerando");
			opc = leer.nextInt();

		} while (opc < 1 || opc > 3);

		return opc;
	}

	public void menuCarrera() {

		System.out.println("--MENU CARRERA--");
		int opc = 0;
		boolean comiezo = false;
		Scanner leer = new Scanner(System.in);

		do {

			boolean posVector = false;

			for (Coche coche : Carrera.vCoches) {
				if (coche == null) {
					posVector = true;
					break;
				}
			}

			if (posVector == false) {
				System.out.println("La carrera está llena de pilotos.");
				opc = 2;
			} else {
				System.out.println("Si quieres añadir un bolido pulsa 1 y si quieres empezar la carrera pulsa 2.");
				opc = leer.nextInt();
			}
			if (opc < 1 || opc > 2) {
				System.out.println("No es valida la opción elegida.");
			}

			switch (opc) {
			case 1:
				// Carrera.añadirCoche();
				break;
			case 2:
				comiezo = false;
				for (Coche coche : Carrera.vCoches) {
					if (coche != null) {
						comiezo = true;
						break;
					}
				}
				if (comiezo) {
					// Carrera.comiezoCarrera();
				}
				break;
			}
		} while (opc < 1 || opc > 2);
	}
}
