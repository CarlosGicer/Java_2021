/**
 * 
 */
package ejerciciost5;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

/**
 * @author sjgui
 *
 */
public class Expediente {
	
	enum Modalidad { FPB, GRADOMEDIO, GRADOSUPERIOR }  //Tipo Enumerado para la modalidad del expediente
	
	private Modalidad modalidad;
	private static int numAlumnos = 0; //Se incrementará cada vez que genere un Expediente nuevo
	private final int id = Expediente.numAlumnos + 10000; 
	private String nombre;
	private String apellidos;
	private char sexo;
	private LocalDate fechaNacimiento;
	private int curso;
	private ArrayList<NotasCurso> calificaciones; //ArrayList de NotasCurso
	
	/**
	 * @param modalidad
	 * @param nombre
	 * @param apellidos
	 * @param sexo
	 * @param fechaNacimiento
	 * @param curso
	 */
	public Expediente(Modalidad modalidad, String nombre, String apellidos, char sexo, LocalDate fechaNacimiento,
			int curso, String[] materias) {
		super();
		this.modalidad = modalidad;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.curso = curso;
		Expediente.numAlumnos++; //Cada vez que hago un new tengo un Expediente nuevo, un alumno nuevo
		this.calificaciones = new ArrayList<NotasCurso>(); //Inicializar el ArrayList de NotasCurso
		
		//Añado las notas del curso a 0
		for(int i=0; i<5; i++)
			this.addNota(new NotasCurso(materias[i], curso, 0, 0, 0));
		
	}

	/**
	 * @return the modalidad
	 */
	public Modalidad getModalidad() {
		return modalidad;
	}

	/**
	 * @param modalidad the modalidad to set
	 */
	public void setModalidad(Modalidad modalidad) {
		this.modalidad = modalidad;
	}

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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the curso
	 */
	public int getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}

	/**
	 * @return the numAlumnos
	 */
	public static int getNumAlumnos() {
		return Expediente.numAlumnos;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Expediente [id=");
		builder.append(id);
		builder.append(", modalidad=");
		builder.append(modalidad);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append(", curso=");
		builder.append(curso);
		builder.append("]");
		
		//Pintar las calificaciones
		builder.append("\nCalificaciones: \n");
		for(NotasCurso nota : this.calificaciones) {
			builder.append(nota + "\n");
		}
		
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Expediente))
			return false;
		Expediente other = (Expediente) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	/**
	 * Calcula los años que han pasado desde la fecha de nacimiento hasta la fecha de hoy
	 * @return Años transcurridos desde la fecha de nacimiento
	 */
	private int getEdad() {
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(this.fechaNacimiento, ahora);
		
		return periodo.getYears(); 
	}
	
	/**
	 * Calcula si un alumno/expediente es mayor de edad o no
	 * @return true si edad>=18, sino false
	 */
	public boolean getMayorEdad() {
		if (this.getEdad() >= 18)
			return true;
		else
			return false;
	}
	
	/**
	 * Añade una nueva nota a las calificaciones del expediente. No puede haber más de 5. No puede repetirse la materia
	 * @return boolean - si se ha podido añadir o no la calificación al expediente
	 */
	public boolean addNota(NotasCurso nc) {
		//Comprobar que no haya más de 5 notas
		if (this.calificaciones.size() >= 5) {
			return false;
		}
		
		//Comprobar que la nota de esa materia no esté ya en las calificaciones del alumno
		for(NotasCurso nota : this.calificaciones) {
			//Comprobar que la materia de la nota parámetro(nc) no coincida con la materia de alguna de las notas introducidas
			if (nota.getMateria().equals(nc.getMateria())) {
				return false;
			}
		}
		
		//Añadimos la nota
		this.calificaciones.add(nc);
		
		return true;
	}
	
	/**
	 * Modificamos las notas de las tres evaluaciones de una materia del expediente si coincide materia y curso. 
	 * @return true - si ha podido realizarse (ha encontrado), false en caso contrario
	 */
	public boolean updateNota(NotasCurso nc) {
		 //Buscar en el expediente una calificación con la misma materia y curso
		for(NotasCurso nota : this.calificaciones) {
			if ( ( nota.getMateria().equals(nc.getMateria()) ) && ( nota.getCurso() == nc.getCurso() ) ) {
				//Modifico las notas
				nota.setNota1EV(nc.getNota1EV()); 
				nota.setNota2EV(nc.getNota2EV());
				nota.setNota3EV(nc.getNota3EV());
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Modificamos las notas de las tres evaluaciones de una materia del expediente si coincide materia y curso. 
	 * @param materia
	 * @param curso
	 * @param ne1
	 * @param ne2
	 * @param ne3
	 * @return true - si ha podido realizarse (ha encontrado), false en caso contrario
	 */
	public boolean updateNota(String materia, int curso, double ne1, double ne2, double ne3) {
		 //Buscar en el expediente una calificación con la misma materia y curso
		for(NotasCurso nota : this.calificaciones) {
			if ( ( nota.getMateria().equals(materia) ) && ( nota.getCurso() == curso ) ) {
				//Modifico las notas
				nota.setNota1EV(ne1);
				nota.setNota2EV(ne2);
				nota.setNota3EV(ne3);
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * Método que devuelve el número de asignaturas suspensas de un expediente
	 * @return - número de materias pendientes
	 */
	public int getNumPendientes() {
		int pendientes=0;
		for(NotasCurso nota : this.calificaciones) {
			if (nota.getNotaFinal() <= 5)
				pendientes++;
		}
		
		return pendientes;
	}
	
	/**
	 * Indica si un alumno titula en función de las materias suspensas
	 * @return true - Si la modalidad es FPB y le quedan 2 o menos materias. 
	 * En otra modalidad tiene que aprobarlo todo. En otro caso devuelve false
	 */
	
	public boolean titula() {
		//Si la modalidad es FPB titula con hasta 2 materias pendientes
		if (this.modalidad == Modalidad.FPB) {
			if (this.getNumPendientes() >= 2) {
				return false;
			} else {
				return true;
			}
		} else { //Si la modalidad es otra, tiene que aprobarlo todo
			if (this.getNumPendientes() == 0) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	/**
	 * 
	 */
	public double mediaExpediente() {
		double media=0;
		for(NotasCurso nota : this.calificaciones) {
			media += nota.getNotaFinal();
		}
		
		return (media/5);
	}
	
	
	

}
