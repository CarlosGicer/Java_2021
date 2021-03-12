package segundaevaluacion.ip;

public class TestIP {

	public static void main(String[] args) {
		DireccionIPv4 ip = new DireccionIPv4();

        int dir[] = {192, 168, 2, 0};
		DireccionIPv4 ip2 = new DireccionIPv4(dir);
		System.out.println(ip + " " + ip2);
		
		DireccionIPv4 ip3 = null;
		try {
			ip3 = new DireccionIPv4("129.168.1.22");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(ip3 + " " + ip3.clase() + " " + ip3.toBinario());
		
				
		DireccionIPv4 ipr1 = null;
		DireccionIPv4 ipr2 = null;
		DireccionIPv4 ipr3 = null;
		DireccionIPv4 ipr4 = null;
		try {
			ipr1 = new DireccionIPv4("192.168.2.25");
			ipr2 = new DireccionIPv4("192.168.2.26");
			ipr3 = new DireccionIPv4("192.168.15.125");
			ipr4 = new DireccionIPv4("192.168.2.225");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		RedIP rp = new RedIP(24, ip2); //Máscara = 24, Dirección de red = 192.168.2.0
		rp.addIP(ipr1);
		rp.addIP(ipr2);
		rp.addIP(ipr3);
		rp.addIP(ipr4);
		
		System.out.println(rp);
		
		
	}

}
