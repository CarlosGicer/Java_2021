package Corregir;

public class e3Password {

	//-------------------------Parametros-----------------------------
	private StringBuffer contraseña = new StringBuffer();
	private int longitud;
	
	
	//-------------------------Constructores-----------------------------
	/**
	 * 
	 */
	public e3Password() {
		this.longitud = 8;
		this.contraseña = this.generarPassword();
	}
	
	/**
	 * @param longitud
	 */
	public e3Password(int longitud) {
		this.longitud = longitud;;
		//this.contraseña = this.generarPassword();
		//Para probar el contraseñaFuerte
	}

	/**
	 */
	public Object clone() {
        Object clone = null;
         try {
             clone = super.clone();
         } catch(CloneNotSupportedException e) {
         }
         ((e3Password)clone).setLongitud(this.longitud);
         return clone;
    }
	
	//-------------------------Metodos-----------------------------
	
	//La version que pedia el ejercicio
	public StringBuffer generarPassword() {
		StringBuffer random = new StringBuffer();
		for (int i=0; i<this.longitud; i++) {
			random.append((char)((Math.random()*93)+33));
		}
		return random;
	}
	
	//Version para generar contraseñas fuertes, minimo 6 caracteres, lo he añadido por que me ha parecido buena idea
	//Lo he dejado en void, pero solo habria que hacer lo mismo que con el basico
	public void generarPasswordFuerte() {
		int contadorMay = 0;
		int contadorSim = 0;
		int contadorMin = 0;
		for (int i=0; i<this.longitud; i++) {
			this.contraseña.append(' ');
		}
			
		for (int i=0; i<this.longitud; i++) {	

			int j;
			boolean flag = false;
			do {
				//Elige una letra al azar de la contraseña para que no sean correlativos
				j = (int)(Math.random()*this.contraseña.length());
				if (this.contraseña.charAt(j) == ' ') {
					if (contadorMay < 2) {
						this.contraseña.setCharAt(j, ((char)((Math.random()*26)+65))); //Rango de las mayusculas
						contadorMay++;
					}else {
						if (contadorSim < 2) {
							this.contraseña.setCharAt(j, ((char)((Math.random()*32)+33))); //Rango de los simbolos "aceptados"
							contadorSim++;
						} else {
							if (contadorMin < 2) {
								this.contraseña.setCharAt(j, ((char)((Math.random()*26)+97))); //Rango de las minusculas
								contadorMin++;
							} else {	
								this.contraseña.setCharAt(j, ((char)((Math.random()*93)+33)));
							}	
						}
					}
				flag = true;
				}
			} while (flag == false); //lo intenta tantas veces como sea necesario para cambiar todas las letras
		}
	}
	public boolean esFuerte() {
		int contadorMay = 0;
		int contadorSim = 0;
		int contadorMin = 0;
		if (this.longitud >= 8) {
			for (int i =0; i<this.longitud; i++) {
				if(( (int)this.contraseña.charAt(i) >=  33) && ((int)this.contraseña.charAt(i) <=  64) ) {
					contadorSim++;
				}
				if(( (int)this.contraseña.charAt(i) >=  65) && ((int)this.contraseña.charAt(i) <=  90) ) {
					contadorMay++;
				}
				if(( (int)this.contraseña.charAt(i) >= 97) && ((int)this.contraseña.charAt(i) <=  122) ) {
					contadorMin++;
				}
			}
			if (contadorMay >= 2 && contadorSim >= 2 && contadorMin >= 2) {
				return true;
			}	
			else {
				return false;
			}
		} else {
			return false;
		}
		
	

	}
	
	//-------------------------geters y seters-----------------------------
	/**
	 * @return the longitud
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return the contraseña
	 */
	public StringBuffer getContraseña() {
		return contraseña;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		e3Password p1 = new e3Password();
		e3Password p2 = new e3Password(8);
		
	
		System.out.println(p1.getContraseña());
		System.out.println(p1.esFuerte());
		
		
		p2.generarPasswordFuerte();
		System.out.println(p2.getContraseña());
		System.out.println(p2.esFuerte());

	}
	
	
}
