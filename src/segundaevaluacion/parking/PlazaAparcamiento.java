package segundaevaluacion.parking;

public class PlazaAparcamiento {

	private int plaza;
	private boolean libre;
	
	/**
	 * 
	 */
	public PlazaAparcamiento() {
		super();
	}

	/**
	 * @param plaza
	 * @param libre
	 */
	public PlazaAparcamiento(int plaza, boolean libre) {
		super();
		this.plaza = plaza;
		this.libre = libre;
	}

	/**
	 * @return the plaza
	 */
	public int getPlaza() {
		return plaza;
	}

	/**
	 * @param plaza the plaza to set
	 */
	public void setPlaza(int plaza) {
		this.plaza = plaza;
	}

	/**
	 * @return the libre
	 */
	public boolean isLibre() {
		return libre;
	}

	/**
	 * @param libre the libre to set
	 */
	public void setLibre(boolean libre) {
		this.libre = libre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + plaza;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof PlazaAparcamiento))
			return false;
		PlazaAparcamiento other = (PlazaAparcamiento) obj;
		if (plaza != other.plaza)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PlazaAparcamiento [plaza=");
		builder.append(plaza);
		builder.append(", libre=");
		builder.append(libre);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
