/**
 * 
 */
package poo_t4;

/**
 * @author alumno
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pajaro p,j; //Definición de una variable p de tipo Pajaro
		
		p = new Pajaro(); //A partir de aquí p es un objeto
		p.setEdad(3); //La propiedad edad del Pajaro p, va a ser 3 años
		p.setColor(new String("verde")); //La propiedad color del pájaro P va a ser un String con "verde"
		//Equivale a 	p.color = new String("verde");  si color fuera public
		
		j = new Pajaro();		
		
		System.out.println(p.infoPajaro());
		System.out.println(j.infoPajaro());
		
		if (p == j) {
			System.out.println("Son el mismo pájaro");
		}
		
		if (p.equals(j)) {
			System.out.println("Son el mismo pájaro");
		}
		
		p.setColor(new String("azul"));
		p.setEdad(6);
		System.out.println(p.infoPajaro());
			
		Pajaro r = new Pajaro(4, new String("rojo"));
		System.out.println(r.infoPajaro());

		
		
		
		
		
		
		


	}

}
