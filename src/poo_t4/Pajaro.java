/**
 * 
 */
package poo_t4;

/**
 * @author alumno
 *
 */
public class Pajaro {

	//PROPIEDADES DE LA CLASE
	
	private int edad; //Edad del pájaro
	private String color; 	//Color del pájaro
	
	
	//MÉTODOS DE LA CLASE
	
	/**
	 * Constructor sin parámetros. Lo inicializa a 1 año y color azul
	 */
	public Pajaro() {
		edad = 1;
		color = new String("azul");
	}
	
	/**
	 * Constructor para inicializar un objeto pájaro
	 * @param years - la edad del pájaro
	 * @param micolor - el color del pájaro
	 */
	public Pajaro(int years, String micolor) {
		edad = years;
		color = micolor;
	}
	
	/**
	 * Establecer edad del pájaro
	 * @param e - int edad que queremos establecer al pájaro
	 */
	public void setEdad(int e) {
		edad = e;
	}
	
	/**
	 * Establecer color del pájaro
	 * @param str - color que le daremos al pájaro
	 */
	public void setColor(String str) {
		color = str;
	}
	
	/**
	 * Devuelve la edad del pájaro
	 * @return int con la edad
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * Devuelve el color del pájaro
	 * @return String con el color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Devuelve un mensaje en String con las propiedades del pájaro, su color y su edad
	 * * @return String con la edad y el color del pájaro
	 */
	public String infoPajaro() {
		return new String("El pájaro es de color " + color + " y tiene " + edad + " años.");
	}
	
	/*
	public boolean compareTo(Pajaro pajaro) {
		if (pajaro.getEdad() == edad && pajaro.getColor().equals(color))
			return true;
		else
			return false;
	}
	*/
	
		
	
}
