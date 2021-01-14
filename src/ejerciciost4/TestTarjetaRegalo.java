package ejerciciost4;

public class TestTarjetaRegalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TarjetaRegalo tr1 = new TarjetaRegalo(100);
		TarjetaRegalo tr2 = new TarjetaRegalo(250);
		
		System.out.println(tr1);
		System.out.println(tr2);
		
		tr1.fusionarTarjeta(tr2);
		
		System.out.println(tr1);
		System.out.println(tr2);

	}

}
