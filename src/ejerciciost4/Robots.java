/**
 * 
 */
package ejerciciost4;

/**
 * @author sjgui
 *
 */
public class Robots {

	private int posicionX;
	private int posicionY;
	private int numeroPasos;
	private boolean haLlegado;
	private static int contadorRobots = 0;

	private final static int FILASTABLERO = 100;
	private final static int COLUMNASTABLERO = 100;
	
	
	/**
	 * 
	 */
	public Robots() {
		super();
		this.posicionX = 0;
		this.posicionY = 0;
		this.numeroPasos = 0;
		this.haLlegado = false;
		Robots.contadorRobots++;
	}


	/**
	 * @param posicionX
	 * @param posicionY
	 */
	public Robots(int posicionX, int posicionY) {
		super();
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.numeroPasos = 0;
		this.haLlegado = false;
		Robots.contadorRobots++;
	}


	/**
	 * @return the posicionX
	 */
	public int getPosicionX() {
		return posicionX;
	}


	/**
	 * @return the posicionY
	 */
	public int getPosicionY() {
		return posicionY;
	}


	/**
	 * @return the numeroPasos
	 */
	public int getNumeroPasos() {
		return numeroPasos;
	}


	/**
	 * @return the haLlegado
	 */
	public boolean isHaLlegado() {
		return haLlegado;
	}


	/**
	 * @return the contadorRobots
	 */
	public static int getContadorRobots() {
		return contadorRobots;
	}


	/**
	 * @param posicionX the posicionX to set
	 */
	public void setPosicionX(int posicionX) {
		//Recalcular el número de pasos
		this.numeroPasos += Math.abs(this.posicionX - posicionX);
		// TODO Habría que comprobar que no te sales del tablero
		this.posicionX = posicionX;
	}


	/**
	 * @param posicionY the posicionY to set
	 */
	public void setPosicionY(int posicionY) {
		//Recalcular el número de pasos
		this.numeroPasos += Math.abs(this.posicionY - posicionY);
		// TODO Habría que comprobar que no te sales del tablero
		this.posicionY = posicionY;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Robots [posicionX=");
		builder.append(posicionX);
		builder.append(", posicionY=");
		builder.append(posicionY);
		builder.append(", numeroPasos=");
		builder.append(numeroPasos);
		builder.append(", haLlegado=");
		builder.append(haLlegado);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (haLlegado ? 1231 : 1237);
		result = prime * result + numeroPasos;
		result = prime * result + posicionX;
		result = prime * result + posicionY;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Robots))
			return false;
		Robots other = (Robots) obj;
		if (haLlegado != other.haLlegado)
			return false;
		if (numeroPasos != other.numeroPasos)
			return false;
		if (posicionX != other.posicionX)
			return false;
		if (posicionY != other.posicionY)
			return false;
		return true;
	}
	
	
	public void irArriba() {
		//Ir arriba supone sumarle a Y
		if ((this.posicionY + 1) <= Robots.FILASTABLERO) {
			this.posicionY++;
			this.numeroPasos++;
		}
	}
	
	public void irAbajo() {
		//Ir abajo supone restarle a Y
		if ((this.posicionY - 1) >= 0) {
			this.posicionY--;
			this.numeroPasos++;
		}
	}
	
	public void irDerecha() {
		//Ir derecha es sumarle a X
		if ( (this.posicionX + 1) <= Robots.COLUMNASTABLERO ) {
			this.posicionX++;
			this.numeroPasos++;
		}
	}
	
	public void irIzquierda() {
		//Ir izquierda es restarle a X
		if ( (this.posicionX - 1) >= 0 ) {
			this.posicionX--;
			this.numeroPasos++;
		}
	}
	
	
	
	
	
}
