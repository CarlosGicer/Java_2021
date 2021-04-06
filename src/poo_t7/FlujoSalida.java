package poo_t7;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlujoSalida {
		
		public static void main(String[] args) throws IOException {
		
			Scanner sc = new Scanner(System.in);
		    try {
		    	DataOutputStream salida = new DataOutputStream(
		    			new FileOutputStream("binario.dat"));
		    	
		        System.out.print("Introduce número entero: ");
		        int n;
		        while ((n = sc.nextInt()) != -1) {
		            salida.writeInt(n); //se escribe  en el fichero
		            System.out.print("Introduce número entero: ");
		        }
		    } catch (FileNotFoundException e) {
		        System.out.println(e.getMessage());
		    } catch (IOException e) {
		        System.out.println(e.getMessage());
		    }
		    
		    //////////////////////////////////////////////////////////////
		    OutputStream fOut = null;
			try {
				fOut = new FileOutputStream("primero.dat");
				for(int i = 0; i < 1000; i++) {
					fOut.write(i);
				}			
			} catch (FileNotFoundException e) {			
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (fOut != null)
					try {
						fOut.close();
					} catch (IOException e) {					
						e.printStackTrace();
					}
			}
			
			////////////////////////////////////////////////////////////////
			String nombreArchivo = "prueba.txt";
	        FileWriter escribir;
	        try {
	            escribir = new FileWriter(nombreArchivo);
	            for (char c = 'a'; c <= 'z'; c++) {
	                escribir.write(c);
	            }
	            escribir.close();
	        } catch (IOException e) {
	            System.out.println("Imposible abrir el archivo para escribir.");
	        }
	        
	        //////////////////////////////////////////////////////////////////
	        String datos = "Hola Mundo";
	        try (BufferedWriter bw = new BufferedWriter(
	        		new FileWriter(nombreArchivo))) {
	            bw.write(datos);
	        } catch (FileNotFoundException e) {
	            System.out.println(e.getMessage());            
	        } catch (IOException e) {
	            System.out.println("Error E/S: " + e);
	        }

	        //////////////////////////////////////////////////////////////////
	        List<Alumno> alumnos = new ArrayList<>();
	        alumnos.add(new Alumno("Javier",7));
	        alumnos.add(new Alumno("Luis",8));
	        try (PrintWriter out = new PrintWriter(new FileWriter("alumnos.txt"))){   
	            // escribe el listado alumno por alumno    
	            for (Alumno alumno : alumnos) {   
	                out.printf("%-25s  Nota:%4.1f%n", alumno.getNombre(), 
	                		alumno.getMediaExp());
	            }
	        } 

			
		    
		}


}
