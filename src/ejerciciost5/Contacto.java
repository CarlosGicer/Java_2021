package ejerciciost5;

public class Contacto {
	//-------------------------Parametros-------------------------------
	
		private String nombre;
		private String telefono;
		
		//-------------------------Constructores----------------------------
		
		public Contacto(String nombre, String telefono) {
			this.nombre = nombre;
			this.telefono = telefono;
		}
		//-------------------------Metodos----------------------------------
		

		//-------------------------getters y setters--------------------------

		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/**
		 * @return the telefono
		 */
		public String getTelefono() {
			return telefono;
		}

		/**
		 * @param telefono the telefono to set
		 */
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		//-------------------------ToString y demas-------------------------
		



		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Nombre=");
			builder.append(nombre);
			builder.append(", telefono=");
			builder.append(telefono);
			return builder.toString();
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Contacto other = (Contacto) obj;
			if (nombre == null) {
				if (other.nombre != null)
					return false;
			} else if (!nombre.equals(other.nombre))
				return false;
			return true;
		}
		
		

	}
