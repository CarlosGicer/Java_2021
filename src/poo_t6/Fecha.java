package poo_t6;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date hoy = new Date();
		Date otra = new Date(hoy.getTime() + 1000000);
		System.out.println(hoy);
		System.out.println(otra);
		

		System.out.println( hoy.before(otra) );
		System.out.println( hoy.after(otra) );
		System.out.println( otra.after(hoy) );
		
		
		GregorianCalendar f = new GregorianCalendar(); 
		f.setTime(new Date()); //Le decimos al calendario que su fecha es hoy = new Date()
		
		System.out.println(f.get(Calendar.YEAR)); 
		System.out.println(f.get(Calendar.MONTH)); 	//0 a 11 
		System.out.println(f.get(Calendar.DAY_OF_MONTH));
		System.out.println(f.get(Calendar.DAY_OF_YEAR));  
		System.out.println(f.get(Calendar.HOUR)); 	
		System.out.println(f.get(Calendar.MINUTE)); 	
		System.out.println(f.get(Calendar.SECOND)); 
		
	}

}
