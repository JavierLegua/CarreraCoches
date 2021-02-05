package Carrera;
/*
 * 
 * @author Javier Legua
 * 
 */
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
	public static int menuCarrera() {
		
		int opc = 0;
		
		Scanner leer = new Scanner(System.in);
		
		do {
			System.out.println("--MENÚ CARRERA--");
			System.out.println("Pulsa 1 para comenzar carrera");
			System.out.println("Pulsa 2 para añadir pilotos");
			System.out.println("Pulsa 3 para añadir el nombre de la carrera.");
			System.out.println("Pulsa 4 para salir.");
			opc = leer.nextInt();

		} while (opc < 1 || opc > 4);

		return opc;
	}
	
}
