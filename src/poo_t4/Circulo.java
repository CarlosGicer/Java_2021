/**
 * 
 */
package poo_t4;

/**
 * @author sjgui
 *
 */
public class Circulo {

	private double xCentro;
	private double yCentro;
	private double radio;
	private static int numCirculos; //Después. Para saber cuántos objetos se están creando

	public Circulo() {
		xCentro=0;
		yCentro=0;
		radio=0;
		numCirculos=1;
	}

	public Circulo(Circulo c) {
		 this(c.xCentro, c.yCentro,c.radio);
		 numCirculos++;
	}

	public Circulo (double radio) {
		 this (0.0, 0.0, radio);
		 numCirculos++;
	}
	
	public Circulo(double xCentro, double yCentro) {
		super();
		 this.xCentro=xCentro;
		 this.yCentro=yCentro;
		 numCirculos++;
	}
	
	//Generarlo con Eclipse desde el menú Source
	public Circulo(double xCentro, double yCentro, double radio) {
		this.xCentro=xCentro;
		this.yCentro=yCentro;
		this.radio=radio;
		numCirculos++;
	}


	//Generarlos en Eclipse desde el menú Source
	public double getXCentro() {
		 return xCentro;
	}

	public void setXCentro(double xCentro) {
		 this.xCentro=xCentro;
	}

	public double getYCentro() {
		 return yCentro;
	}

	public void setYCentro(double yCentro) {
		 this.yCentro=yCentro;
	}

	public double getRadio() {
		 return radio;
	}

	public void setRadio(double radio) {
		 this.radio=radio;
	}

	public static int getNumCirculos() {
		 return numCirculos;
	}

	@Override
	public String toString() {
		 return "Circulo={(xCentro="+xCentro+", yCentro="+ yCentro+")";

	}


	public double calcularArea() {
		 return Math.PI*(radio*radio);
	}


	public double calcularLongitud() {
		 return Math.PI*2*radio;

	}


	public double calcularDiametro() {
		 return 2*radio;

	}

	///////// MÁS ADELANTE
	
	@Override
	public boolean equals(Object obj) {
		 if (this == obj)
			 return true;
		 if (obj == null)
			 return false;
		 if (getClass() != obj.getClass())
			 return false;
		 Circulo other=(Circulo) obj;
		 if (Double.doubleToLongBits(radio) !=
				 Double.doubleToLongBits(other.radio))
			 return false;
		 if (Double.doubleToLongBits(xCentro) !=
				 Double.doubleToLongBits(other.xCentro))
			 return false;
		 if (Double.doubleToLongBits(yCentro) !=
				 Double.doubleToLongBits(other.yCentro))
			 return false;
		 return true;
	}

	public int compareTo(Object obj) {
			Circulo otroCirculo=(Circulo) obj;
			if (calcularArea()==otroCirculo.calcularArea()) {
				return 0;
			}
			else if (calcularArea()<otroCirculo.calcularArea()) {
				return -1;
			}
			else {
				return 1;
			}
	}
	
	
}