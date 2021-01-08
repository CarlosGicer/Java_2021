package poo_t4;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona yo = new Persona();
		yo.setNombre("Javier");
		yo.setEdad(21);
		yo.setColorPiel("mestizo");
		System.out.println(yo);
		
		Persona el = new Persona(5);
		el.setColorPiel("Negro");
		System.out.println(el);
		
		Persona fulano = new Persona("Antonio",35,"blanco");
		System.out.println(fulano);
		
		System.out.println(yo.calificacionEdad());
		System.out.println(el.calificacionEdad());
		System.out.println(fulano.calificacionEdad());
		
		for(int i=0; i<10000000; i++) {
			Persona persona = new Persona("Javier",20,"blanco");
		}
		
	}

}
