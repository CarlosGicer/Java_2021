/**
 * 
 */
package ejerciciost5;

/**
 * @author sjgui
 *
 */
public class Password {

		private int longitud=8;
		private String contraseña;
		
		/**
		 * 
		 */
		public Password() {
			super();
			this.contraseña = this.generarPassword();
		}

		/**
		 * @param longitud
		 * @param contraseña
		 */
		public Password(int longitud) {
			super();
			this.longitud = longitud;
			this.contraseña = this.generarPassword();
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Password [longitud=");
			builder.append(longitud);
			builder.append(", contraseña=");
			builder.append(contraseña);
			builder.append("]");
			return builder.toString();
		}
		
		public String generarPassword() {
			StringBuffer sb = new StringBuffer(this.longitud);
			
			//char[] palabra = new char[this.longitud];
			//String letras = "abcdefghijklmnñopqrstuvwxyz01234567890!·$%&/()=?¿";
			
			for(int i=0; i<this.longitud;i++) {
				//palabra[i] = letras.charAt((int) (Math.random()*letras.length()));
				//sb.append(letras.charAt((int) (Math.random()*letras.length())));
				
				sb.append(  (char) (Math.random()*(123-33) + 33)  );
			}
			
			//return new String(palabra);
			return sb.toString();
		}
		
		public static void main(String[] args) {
			Password ps = new Password(12);
			System.out.println(ps);
			
			System.out.println(  ( (char) ( Math.random()*(123-33) + 33 ) )   );
			
			
			
		}
		
		
	
	
	
	
}
