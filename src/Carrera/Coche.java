package Carrera;
/*
 * 
 * @author Javier Legua
 * 
 */
public class Coche {
	
	private String nomPiloto;
	private int dorsal;
	private int distanciaCarrera = 1000;
	private String estado;
	private final int POTENCIA = 50;
	private int velocidad;
	private int distanciaRecorrida;
	private boolean humano;
	
	public Coche(String nomPiloto, int dorsal, int distanciaCarrera, boolean humano) {
		this.nomPiloto = nomPiloto;
		this.dorsal = dorsal;
		this.estado = "Parado";
		this.velocidad = 0;
		this.distanciaRecorrida = 0;
		this.distanciaCarrera = distanciaCarrera;
		this.humano = humano;
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
		return distanciaCarrera;
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
	}
	
	public void rearrancar() {
		
		if (this.getEstado().equalsIgnoreCase("Accidentado")) {
			this.setEstado("Marcha");
			System.out.println("Has re-arrancado el coche.");
		}
	}
	
	public void acelerar() {
		
		if ((this.getEstado().equalsIgnoreCase("Parado"))||(this.getEstado().equals("Accidentado"))) {
			System.out.println("Para acelerar primero tienes que arrancar el coche.");
		}else {
			if (this.getEstado().equalsIgnoreCase("Marcha")) {
				double r = Math.random()*this.POTENCIA+1;
				int aceleracion = (int)Math.floor(r);
				int velocidad = this.getVelocidad();
				int kms = this.getDistanciaRecorrida();
				
				velocidad += aceleracion;
				
				if (velocidad > 200) {
					this.setVelocidad(0);
					this.setEstado("Accidentado");
				}else {
					this.setVelocidad(velocidad);
					this.setDistanciaRecorrida(kms+aceleracion);
				}
				if (this.distanciaRecorrida >= this.distanciaCarrera) {
					this.setEstado("Terminado");
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
				}else {
					this.setVelocidad(velocidad);
					this.setDistanciaRecorrida(kms+frenada);
				}
				if (this.distanciaRecorrida >= this.distanciaCarrera) {
					this.setEstado("Terminado");
				}
			}
		}
	}

	@Override
	public String toString() {
		return "nombre=" + nomPiloto + ", dorsal=" + dorsal + ", estado=" + estado + ", velocidad="
				+ velocidad + ", distanciaRecorrida=" + distanciaRecorrida;
	}

	

	
	
	
}
