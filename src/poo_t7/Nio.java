/**
 * 
 */
package poo_t7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Iterator;

/**
 * @author sjgui
 *
 */
public class Nio {

	/**
	 * 
	 */
	public Nio() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Información del sistema de ficheros
		FileSystem sistemaFicheros = FileSystems.getDefault(); 
		System.out.println(sistemaFicheros.toString());        
		System.out.println(sistemaFicheros.getSeparator()); 
		
		//Muestra la carpeta padre de una ruta
		Path path = Paths.get("c:", "Users/sjgui/eclipse-workspace", "EjemplosJava/poo_t7", "Nio.java");
		System.out.println(path.getParent());
		Path relativePath = FileSystems.getDefault().getPath("../../..");
		System.out.println(relativePath.getParent());
		
		//Muestra cada una de las carpetas de la ruta
		path = Paths.get("c:", "Users/sjgui/eclipse-workspace", "EjemplosJava/poo_t7");
		Iterator<Path> it=path.iterator();
		while(it.hasNext()) {
		  System.out.println(it.next().getFileName());
		}
		
		//Operaciones con Files
		Path ruta = Paths.get("C:/Users/sjgui/eclipse-workspace/EjemplosJava/prueba.txt");
		System.out.println(ruta.getFileName() + " Existe = " + Files.exists(ruta));
		System.out.println(ruta.getFileName() + " Escritura = " + Files.isWritable(ruta));
		
		try {
			Path rutaCopy = Paths.get("C:/Users/sjgui/eclipse-workspace/EjemplosJava/prueba_copy.txt");
			Files.copy(ruta, rutaCopy, StandardCopyOption.REPLACE_EXISTING); //Copia al nombre anterior
			
			//Path dir = Files.createTempDirectory("mydir"); //Lo crea en  <carpetausuario>/AppData/Local/Temp
			Path dir = Files.createDirectory(Paths.get("C:/Users/sjgui/eclipse-workspace/EjemplosJava/mydir")); //Lo crea aquí
			Path fileToCreatePath = dir.resolve("testfile.txt");
	        Path newFilePath = Files.createFile(fileToCreatePath);
	        System.out.println("New File (" + newFilePath +") exits: " + Files.exists(newFilePath));   
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Lectura y escritura de un fichero con Files, línea a línea
		Path fichero = Paths.get("C:/Users/sjgui/eclipse-workspace/EjemplosJava/prueba.txt");    
		Path ficheroCopiar = Paths.get("C:/Users/sjgui/eclipse-workspace/EjemplosJava/pruebaCopiado.txt");     
		try  {
			BufferedReader reader = Files.newBufferedReader(fichero, Charset.defaultCharset());
			BufferedWriter writer = Files.newBufferedWriter(ficheroCopiar, Charset.forName("UTF-8"));
			String line;            
			while ((line = reader.readLine()) != null) {                
				System.out.println(line);  
				writer.write(line);
				writer.newLine();
			}      
			reader.close();
			writer.close();
		} catch (IOException e) {            
			System.err.println(" ERROR : " + e);            
			System.exit(1);        
		}    

		
		//Lectura y escritura de un fichero con Files, por bytes
		Path ficheroBytes = Paths.get("C:/Users/sjgui/eclipse-workspace/EjemplosJava/prueba.docx");
		Path ficheroBytesOutput = Paths.get("C:/Users/sjgui/eclipse-workspace/EjemplosJava/pruebaCopiadoBytes.docx");
        try {
            byte[] content = Files.readAllBytes(ficheroBytes);
            for (int i = 0; i < content.length; i++) {
                System.out.print((char) content[i]);
            }
            //Copiamos todos los bytes de golpe
            Files.write(ficheroBytesOutput, content,
                    StandardOpenOption.WRITE,         // Podría usarse APPEND, para añadir al final
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            System.err.println(" ERROR : " + e);
            System.exit(1);
        }

		
		




	}

}
