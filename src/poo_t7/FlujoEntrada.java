package poo_t7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FlujoEntrada {

	public FlujoEntrada() {
		
	}

	public static void main(String[] args) {
		
		FileInputStream fIn = null;
		try {
			fIn = new FileInputStream("primero.dat");
			int c;
			while ((c = fIn.read()) != -1) 
				System.out.println(c);
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fIn != null)
				try {
					fIn.close();
				} catch (IOException e) {					
					e.printStackTrace();
				}
		}

		
		/////////////////////////////////////////
		BufferedInputStream bin = null;
		BufferedOutputStream bout = null;
		final int TAM = 1024 * 16;

		try {
			bin = new BufferedInputStream(new FileInputStream("openwebinars.jpg"));
			bout = new BufferedOutputStream(new FileOutputStream("image_copy.jpg"));

			int cantidadBytes = 0;
			byte[] buffer = new byte[TAM];

			while ((cantidadBytes = bin.read(buffer, 0, TAM)) != -1) {
				bout.write(buffer, 0, cantidadBytes);
			}		
			System.out.println("El fichero se ha copiado correctamente");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bin != null)
				try {
					bin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			if (bout != null)
				try {
					bout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		/////////////////////////////////////////////////////////////////
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader("mensaje.txt"));
			bw = new BufferedWriter(new FileWriter("mensaje_mayus.txt"));

			String linea = null;
			while ((linea = br.readLine()) != null) {
				StringBuilder sb = new StringBuilder(linea.length());
				sb.append(linea.toUpperCase());
				bw.write(sb.toString());
				bw.newLine();
			}
			System.out.println("El mensaje ha sido cambiado.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			if (bw != null)
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

		//////////////////////////////////////////////////////////////////
		 	char[] chars = new char[100];
		 	
		 	InputStreamReader inputStreamReader = null; 
	        try  {
	        	inputStreamReader = new InputStreamReader(System.in,"UTF-8");
	            // read 100 characters from the file
	            while (inputStreamReader.read(chars) != -1)
	                System.out.println(new String(chars));
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
				if (inputStreamReader != null)
					try {
						inputStreamReader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			}
	        
	        ////////////////////////////////////////////////////////////////////
	        try {
				Path p = Paths.get("files", "quijote.txt");
				Path p2 = Paths.get("files", "quijote2.txt");
				if (Files.exists(p)) {
					BufferedWriter buw = Files.newBufferedWriter(p2, Charset.forName("UTF-8"));
					
					//El Charset del fichero debe ser UTF-8
					List<String> lineas = Files.readAllLines(p);
					lineas.forEach((s) ->{
						try {
							buw.write(s);
							buw.newLine();
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println(s);
					});
					buw.close();
				}
			} catch (IOException e) {			
				e.printStackTrace();
			} 
		
	}

}
