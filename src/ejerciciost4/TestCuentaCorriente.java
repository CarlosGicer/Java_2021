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
		
		if (cc1.transferencia(cc2, 300)) {  //Quitar 100 de cc2 y se los pasa a cc1
			System.out.println("Transferencia realizada correctamente");
		} else {
			System.out.println("Error en la transferencia. La cuenta de origen no tiene saldo suficiente");
		}
		System.out.println(cc1);
		System.out.println(cc2);

	}

}
