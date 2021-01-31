package Carrera;
/*
 * 
 * @author Javier Legua
 * 
 */
public class Coche {
	
	private String nomPiloto;
	private int dorsal;
	private final int DISTANCIACARRERA = 1000;
	private String estado;
	private final int POTENCIA = 50;
	private int velocidad;
	private int distanciaRecorrida;
	
	public Coche(String nomPiloto, int dorsal) {
		this.nomPiloto = nomPiloto;
		this.dorsal = dorsal;
		this.estado = "Parado";
		this.velocidad = 0;
		this.distanciaRecorrida = 0;
	}

	public String getNomPiloto() {
		return nomPiloto;
	}

	public void setNomPiloto(String nomPiloto) {
		this.nomPiloto = nomPiloto;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getDistanciaRecorrida() {
		return distanciaRecorrida;
	}

	public void setDistanciaRecorrida(int distanciaRecorrida) {
		this.distanciaRecorrida = distanciaRecorrida;
	}

	public int getDISTANCIACARRERA() {
		return DISTANCIACARRERA;
	}

	public int getPOTENCIA() {
		return POTENCIA;
	}
	
	public void arrancar() {
		
		if ((this.getEstado().equalsIgnoreCase("Parado"))) {
			this.setEstado("Marcha");
			System.out.println("Has arrancado tú coche.");
		}else {
			if (this.getEstado().equalsIgnoreCase("Marcha")) {
				System.out.println("Tú coche ya esta arrancado.");
			}else {
				System.out.println("No puedo arrancar en este estado.");
			}
		}
		return;
	}
	
	public void rearrancar() {
		
		if (this.getEstado().equalsIgnoreCase("Accidentado")) {
			this.setEstado("Marcha");
			System.out.println("Has re-arrancado el coche.");
			return;
		}
	}
	
	public void acelerar() {
		
		if ((this.getEstado().equalsIgnoreCase("Parado"))||(this.getEstado().equals("Accidentado"))) {
			System.out.println("Para acelerar primero tienes que arrancar el coche.");
		}else {
			if (this.getEstado().equalsIgnoreCase("Marcha")) {
				//Idea de este metodo cogida del metodo de Oscar Merino
				double r = Math.random()*this.POTENCIA+1;
				int aceleracion = (int)Math.floor(r);
				int velocidad = this.getVelocidad();
				int kms = this.getDistanciaRecorrida();
				
				velocidad += aceleracion;
				
				if (velocidad > 200) {
					this.setVelocidad(0);
					this.setEstado("Accidentado");
					System.out.println("Te has pasado de velocidad y te la has pegado.");
				}else {
					this.setVelocidad(velocidad);
					this.setDistanciaRecorrida(kms+velocidad);
					System.out.println("Vas a " + this.getVelocidad() + " km/h");
				}
				if (this.distanciaRecorrida >= this.DISTANCIACARRERA) {
					System.out.println("Has terminado la carrera.");
				}else {
					System.out.println("Te faltan " + (this.getDISTANCIACARRERA() - this.getDistanciaRecorrida()) + " kms para terminar la carrera.");
					return;
				}
			}
		}
	}
	
public void frenar() {
		
		if ((this.getEstado().equalsIgnoreCase("Parado"))||(this.getEstado().equals("Accidentado"))) {
			System.out.println("Para frenar primero tienes que arrancar el coche.");
		}else {
			if (this.getEstado().equalsIgnoreCase("Marcha")) {
				double r = Math.random()*this.POTENCIA+1;
				int frenada = (int)Math.floor(r);
				int velocidad = this.getVelocidad();
				int kms = this.getDistanciaRecorrida();
				
				velocidad -= frenada;
				
				if (velocidad < 0) {
					this.setVelocidad(0);
					this.setEstado("Estas parado.");
					System.out.println("Tu velocidad es de " + this.getVelocidad());
				}else {
					this.setVelocidad(velocidad);
					this.setDistanciaRecorrida(kms+velocidad);
					System.out.println("Vas a " + this.getVelocidad() + " km/h");
				}
				if (this.distanciaRecorrida >= this.DISTANCIACARRERA) {
					System.out.println("Has terminado la carrera.");
				}else {
					System.out.println("Te faltan " + (this.getDISTANCIACARRERA() - this.getDistanciaRecorrida()) + " kms para terminar la carrera.");
					return;
				}
			}
		}
	}
	
	
}
