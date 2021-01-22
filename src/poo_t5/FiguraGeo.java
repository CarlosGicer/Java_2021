/**
 * 
 */
package poo_t5;

/**
 * @author sjgui
 *
 */
public class FiguraGeo {
	
	protected String color;
	protected String nombre;


	/**
	 * @param color
	 */
	public FiguraGeo(String color, String nombre) {
		super();
		this.color = color;
		this.nombre = nombre;
	}
	
	public FiguraGeo(String color) {
		super();
		this.color = color;
		this.nombre = "sinombre";
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FiguraGeo [color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof FiguraGeo))
			return false;
		FiguraGeo other = (FiguraGeo) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}
	

}
