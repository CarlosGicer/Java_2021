package ejerciciost4;

public class TestIncidencia {

	public static void main(String[] args) {

		Incidencia i1 = new Incidencia("Pintada en el ayuntamiento");
		Incidencia i2 = new Incidencia("Roto el columpio del parque de niños");
		Incidencia i3 = new Incidencia("Roto cristal parada buses");
		System.out.println(Incidencia.getPendientes());
		
		System.out.println(i1);
		System.out.println(i2);
		
		i1.resolver("Se ha pintado la fachada de nuevo");
		i3.resolver("Reparado cristal");
		System.out.println(i1);
		System.out.println(Incidencia.getPendientes());
		
		System.out.println(i3.getEstado());
	}
	
	
}