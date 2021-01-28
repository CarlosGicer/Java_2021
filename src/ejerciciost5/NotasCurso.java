/**
 * 
 */
package ejerciciost5;

/**
 * @author sjgui
 *
 */
public class NotasCurso {
	private String materia;
	private int curso;
	private double nota1EV, nota2EV, nota3EV;
	private double notaFinal;
	
	/**
	 * @param materia
	 * @param curso
	 */
	public NotasCurso(String materia, int curso) {
		super();
		this.materia = materia;
		this.curso = curso;
	}

	/**
	 * @param materia
	 * @param curso
	 * @param nota1ev
	 * @param nota2ev
	 * @param nota3ev
	 */
	public NotasCurso(String materia, int curso, double nota1ev, double nota2ev, double nota3ev) {
		super();
		this.materia = materia;
		this.curso = curso;
		this.nota1EV = nota1ev;
		this.nota2EV = nota2ev;
		this.nota3EV = nota3ev;
		this.calcularNotaFinal();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NotasCurso [materia=");
		builder.append(materia);
		builder.append(", curso=");
		builder.append(curso);
		builder.append(", nota1EV=");
		builder.append(nota1EV);
		builder.append(", nota2EV=");
		builder.append(nota2EV);
		builder.append(", nota3EV=");
		builder.append(nota3EV);
		builder.append(", notaFinal=");
		builder.append(notaFinal);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + curso;
		result = prime * result + ((materia == null) ? 0 : materia.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota1EV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota2EV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota3EV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof NotasCurso))
			return false;
		NotasCurso other = (NotasCurso) obj;
		if (curso != other.curso)
			return false;
		if (materia == null) {
			if (other.materia != null)
				return false;
		} else if (!materia.equals(other.materia))
			return false;
		if (Double.doubleToLongBits(nota1EV) != Double.doubleToLongBits(other.nota1EV))
			return false;
		if (Double.doubleToLongBits(nota2EV) != Double.doubleToLongBits(other.nota2EV))
			return false;
		if (Double.doubleToLongBits(nota3EV) != Double.doubleToLongBits(other.nota3EV))
			return false;
		return true;
	}

	/**
	 * @return the materia
	 */
	public String getMateria() {
		return materia;
	}

	/**
	 * @param materia the materia to set
	 */
	public void setMateria(String materia) {
		this.materia = materia;
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
	 * @return the nota1EV
	 */
	public double getNota1EV() {
		return nota1EV;
	}

	/**
	 * @param nota1ev the nota1EV to set
	 */
	public void setNota1EV(double nota1ev) {
		nota1EV = nota1ev;
		this.calcularNotaFinal();
	}

	/**
	 * @return the nota2EV
	 */
	public double getNota2EV() {
		return nota2EV;
	}

	/**
	 * @param nota2ev the nota2EV to set
	 */
	public void setNota2EV(double nota2ev) {
		nota2EV = nota2ev;
		this.calcularNotaFinal();
	}

	/**
	 * @return the nota3EV
	 */
	public double getNota3EV() {
		return nota3EV;
	}

	/**
	 * @param nota3ev the nota3EV to set
	 */
	public void setNota3EV(double nota3ev) {
		nota3EV = nota3ev;
		this.calcularNotaFinal();
	}
	
	
	/**
	 * @return the notaFinal
	 */
	public double getNotaFinal() {
		return notaFinal;
	}

	/**
	 * @return true si la notaFinal es mayor o igual que 5. En caso contrario false
	 */
	public boolean aprobado() {
		if (this.notaFinal >= 5)
			return true;
		else
			return false;
	}
	
	/**
	 * @return double - media aritmética de las notas de las tres evaluaciones
	 */
	public double calcularNotaFinal() {
		this.notaFinal = (this.nota1EV + this.nota2EV + this.nota3EV) / 3;
		return notaFinal;
	}
	
	
	

}
