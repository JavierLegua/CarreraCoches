package Carrera;
/*
 * 
 * @author Javier Legua
 * 
 */
import java.util.Scanner;

public class Main {

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

	public static void main(String[] args) {

		int opc = 0;

		Coche c = new Coche("Dominic Toretto", 1327);

		do {
			opc = pintaMenu();

			switch (opc) {
			case 1: {
				c.arrancar();
				break;
			}
			case 2: {
				c.acelerar();
				break;
			}
			case 3: {
				c.frenar();
				break;
			}
			case 4: {
				c.rearrancar();
				break;
			}
			}
		} while (c.getDistanciaRecorrida() <= c.getDISTANCIACARRERA());

	}

}
