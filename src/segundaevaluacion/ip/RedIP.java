package segundaevaluacion.ip;

import java.util.ArrayList;

public class RedIP {

	private int mascara;
	private DireccionIPv4 red;
	private ArrayList<DireccionIPv4> direcciones;
	
	public RedIP() {
		super();
		direcciones = new ArrayList<>();
	}

	/**
	 * @param mascara
	 * @param red
	 */
	public RedIP(int mascara, DireccionIPv4 red) {
		super();
		this.mascara = mascara;
		this.red = red;
		direcciones = new ArrayList<>();
	}
	
	/**
	 * Añade IP a la red si la IP pertenece a esa red en función de la máscara
	 * @param unaIP
	 */
	public void addIP(DireccionIPv4 unaIP) {
		if(validarDireccion(unaIP))
			direcciones.add(unaIP);
	}
	
	/**
	 * Elimina IP de la red
	 * @param unaIP
	 */
	public void removIP(DireccionIPv4 unaIP) {
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
		StringBuilder strIP = new StringBuilder(unaIP.toBinario());
		StringBuilder strRed = new StringBuilder(this.red.toBinario());
		
		for(int i=0; i<mascara-1; i++) {
			if (strIP.charAt(i) != strRed.charAt(i))
				return false;
		}
		
		return true;
	}
	
	
	
}
