package segundaevaluacion.primevideo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Serie serie = new Serie("Breaking Bad", true, 10, Genero.THRILLER);
		for(int i=0; i<10; i++) {
			Temporada t = new Temporada(i);
			for(int j=0; j<10; j++) {
				t.addEpisodio(new Episodio("Episodio "+j, 50));
			}	
			serie.addTemporada(t);
		}
		
		PrimeVideo pv = new PrimeVideo();
		for(long i=0; i<2500000;i++) {
			ClientePrimePro cpp = new ClientePrimePro();
			pv.addSuscriptor(cpp);
		}
		for(long i=0; i<7500000;i++) {
			ClientePrime cp = new ClientePrime();
			pv.addSuscriptor(cp);
		}
		
		for(int i=0; i<50; i++) {
			Pelicula p = new Pelicula("Greenland "+i, true, 15, Genero.ACCION, 120);
			pv.addMultimedia(p);
		}
		for(int i=0; i<770; i++) {
			Pelicula p = new Pelicula("Greenland "+i, false, 12, Genero.AVENTURAS, 110);
			pv.addMultimedia(p);
		}
		
		//Simular ver las películas
		for(int i=0; i<pv.getSuscriptores().size();i++) {
			for(int j=0; j<100; j++) {
				pv.ver(pv.getCatalogo().get(j), pv.getSuscriptores().get(i));	
			}
		}
		
		System.out.println(pv.getGanancias());
	}

}
