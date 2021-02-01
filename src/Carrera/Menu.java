package Carrera;

import java.util.Scanner;

public class Menu {

	public static int pintaMenu() {

		int opc = 0;

		Scanner leer = new Scanner(System.in);

		do {
			System.out.println("--Gestión Carrera--");
			System.out.println("Pulsa 1 para arrancar el coche.");
			System.out.println("Pulsa 2 para acelerar to fast and furious");
			System.out.println("Pulsa 3 para hacer un derrape to guapo");
			System.out.println("Pulsa 4 para re-arrancar porque te has flipado acelerando");
			opc = leer.nextInt();
			
		} while (opc < 1 || opc > 4);

		return opc;
	}
}
