package segundaevaluacion.ip;

import java.util.Arrays;
import java.util.StringTokenizer;

public class DireccionIPv4 implements Validable {

	//Atributo con cuatro octetos, de valor int
	private int[] octetos;
	
	public DireccionIPv4() {
		octetos = new int[4]; //Ya inicializa a 0
		
		/*
		for(int i=0; i<4; i++) 
			octetos[i] = 0;
		*/
	}

	/**
	 * @param octetos
	 */
	public DireccionIPv4(int[] octetos) {
		super();
		this.octetos = octetos;
	}
	
	public DireccionIPv4(String direccion) throws Exception {
		        
		StringTokenizer tokens;        
		tokens = new StringTokenizer(direccion, ".");   
		int cont=0;
		int dir[] = new int[4];
		while (tokens.hasMoreTokens()) {
			if (cont == 4) { //Tiene más de 4 octetos
				throw new Exception("Exception: Dirección IP no válida, más de 4 octetos");
			}
			
			dir[cont] = Integer.parseInt(tokens.nextToken().trim());
			cont++;
		}
		
		//Tiene menos de 4 octetos
		if (cont < 4) {
			throw new Exception("Exception: Dirección IP no válida, menos de 4 octetos");
		}
		
		//Validamos cada octeto
		if (!valida()) {
			throw new Exception("Exception: Dirección IP no válida, algún octeto fuera de rango (0-255)");
		} else {
			this.octetos = dir;
		}

	}

	/**
	 * Valida cada octeto de la dirección
	 * @param octeto
	 * @return
	 */
	public boolean valida() {
		for(int i=0; i<4; i++) {
			if ((octetos[i] < 0) || (octetos[i] > 255))
				return false;	
		}
		
		return true;
	}
	
	/**
	 * @return the octetos
	 */
	public int[] getOctetos() {
		return octetos;
	}

	/**
	 * @param octetos the octetos to set
	 */
	public void setOctetos(int[] octetos) {
		this.octetos = octetos;
	}
	
	/**
	 * Pasar a binario cada octeto
	 */
	public String toBinario() {
		//System.out.println(Integer.toBinaryString(this.octetos[0])+"."+Integer.toBinaryString(this.octetos[1])+"."
		//			      +Integer.toBinaryString(this.octetos[2])+"."+Integer.toBinaryString(this.octetos[3]));
		
		String str1 = String.format("%8s", Integer.toBinaryString(this.octetos[0])).replace(' ', '0');
		String str2 = String.format("%8s", Integer.toBinaryString(this.octetos[1])).replace(' ', '0');
		String str3 = String.format("%8s", Integer.toBinaryString(this.octetos[2])).replace(' ', '0');
		String str4 = String.format("%8s", Integer.toBinaryString(this.octetos[3])).replace(' ', '0');
		
		return (str1+str2+str3+str4);
	}
	
	
	/**
	 * Indica la clase de una IP
	 */
	public char clase() {
		if ((octetos[0] > 0) && (octetos[0] < 128))
			return 'A';
		
		if ((octetos[0] > 127) && (octetos[0] < 192))
			return 'B';
		
		if ((octetos[0] > 191) && (octetos[0] < 223))
			return 'C';
		
		return '-';
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(octetos[0] + "." + octetos[1] + "." + octetos[2] + "." + octetos[3]);
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(octetos);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof DireccionIPv4))
			return false;
		DireccionIPv4 other = (DireccionIPv4) obj;
		if (!Arrays.equals(octetos, other.octetos))
			return false;
		return true;
	}
	
	
	
	
}
