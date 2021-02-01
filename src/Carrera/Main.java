package Carrera;
/*
 * 
 * @author Javier Legua
 * 
 */
import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {

		int opc = 0;

		Coche c = new Coche("Dominic Toretto", 1327, 300,true);

		do {
			opc = Menu.pintaMenu();
			System.out.println(c.toString());
			
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
		} while (!c.getEstado().equalsIgnoreCase("Terminado"));

	}

}
