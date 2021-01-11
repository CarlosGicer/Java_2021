package ejerciciost4;

public class TestCuentaCorriente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CuentaCorriente cc1 = new CuentaCorriente();
		System.out.println(cc1);
		CuentaCorriente cc2 = new CuentaCorriente("1234567899");
		System.out.println(cc2);
		
		cc1.ingreso(600);
		cc1.cargo(250);
		System.out.println(cc1);
		
		cc2.cargo(100);
		cc2.ingreso(200);
		cc2.cargo(250);
		System.out.println(cc2);

	}

}
