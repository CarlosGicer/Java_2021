package segundaevaluacion.ip;

import java.util.ArrayList;

public class RedIP {

	private int mascara;
	private DireccionIPv4 red;
	private ArrayList<DireccionIPv4> direcciones;
	
	public RedIP() {
		super();
		this.direcciones = new ArrayList<>();
	}

	/**
	 * @param mascara
	 * @param red
	 */
	public RedIP(int mascara, DireccionIPv4 red) {
		super();
		this.mascara = mascara;
		this.red = red;
		this.direcciones = new ArrayList<>();
	}
	
	/**
	 * Añade IP a la red si la IP pertenece a esa red en función de la máscara
	 * @param unaIP
	 */
	public void addIP(DireccionIPv4 unaIP) {
		if(validarDireccion(unaIP)) //Comprueba que la dirección IP a añadir está en esa red
			direcciones.add(unaIP);
	}
	
	/**
	 * Elimina IP de la red
	 * @param unaIP
	 */
	public void removeIP(DireccionIPv4 unaIP) {
		for(DireccionIPv4 ip : direcciones) {
			if (ip.equals(unaIP)) {
				direcciones.remove(ip);
				break;
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RedIP [mascara=");
		builder.append(mascara);
		builder.append(" red=");
		builder.append(red);
		builder.append(" direcciones=\n");
		for(DireccionIPv4 ip : direcciones) {
			builder.append(ip + " - "+ ip.toBinario() + "\n");
		} 
		builder.append("]");
		return builder.toString();
	}
	
	/**
	 * Valida que una IPv4 pertenece a la red de la clase con la máscara de la red
	 * @param unaIP
	 * @return
	 */
	private boolean validarDireccion(DireccionIPv4 unaIP) {
		String strIP = new String(unaIP.toBinario());
		String strRed = new String(this.red.toBinario());
		
		for(int i=0; i<mascara-1; i++) { //Comparo tantos bits en las dos direcciones como indica la máscara
			if (strIP.charAt(i) != strRed.charAt(i))
				return false;
		}
		
		return true;
	}
	
	
	
}
