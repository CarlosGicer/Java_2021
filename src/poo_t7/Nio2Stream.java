/**
 * 
 */
package poo_t7;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author sjgui
 *
 */
public class Nio2Stream {

	/**
	 * 
	 */
	public Nio2Stream() {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Muestra todos los ficheros regulares
		Path start = Paths.get("C:/Users/sjgui/eclipse-workspace");
		int maxDepth = 5;
		List<Path> result;
        
		try (Stream<Path> walk = Files.walk(start, maxDepth)) {
            result = walk.filter(Files::isRegularFile) //Files::isDirectory
                    .collect(Collectors.toList());
            for(Path p : result)
            	System.out.println(p);            
        } catch (IOException e) {
			e.printStackTrace();
		}
        
		//Muestra todos los ficheros de más de 10M	
        // walk file tree, no more recursive loop
		long size = 1024 * 1024 * 10;
        try (Stream<Path> walk = Files.walk(start)) {
            result = walk
                    .filter(Files::isReadable)              // read permission
                    .filter(p -> !Files.isDirectory(p))     // is a file
                    .filter(p -> checkFileSize(p, size))
                    .collect(Collectors.toList());
            		
            result.forEach(x -> System.out.println(x));
        } catch (IOException e) {
			e.printStackTrace();
		}
        
        //Leer un fichero por líneas
        Path fichero = Paths.get("C:/Users/sjgui/eclipse-workspace/EjemplosJava/prueba.txt");  
        List<String> result2;
        try (Stream<String> stream = Files.lines(fichero, Charset.forName("UTF-8"))) {
        	result2 = stream
                    .filter(line -> line.length() > 10)
                    .collect(Collectors.toList());
            		
            result2.forEach(x -> System.out.println(x));
        } catch (IOException e) {
			e.printStackTrace();
		}
        
        //Busca todos los ficheros .class a partir de una ruta
        Path ruta = Paths.get("C:/Users/sjgui/eclipse-workspace/");  
        try (Stream<Path> stream = Files.find(start, 5, (path, attr) ->
        								String.valueOf(path).endsWith(".class"))) {
        	stream
        		.sorted()
        		.map(String::valueOf)
        		.forEach(System.out::println);
        }catch (IOException e) {
			e.printStackTrace();
		}
        
        

	}
	
	private static boolean checkFileSize(Path path, long fileSize) {
        boolean result = false;
        try {
            if (Files.size(path) >= fileSize) {
                result = true;
            }
        } catch (IOException e) {
            System.err.println("Unable to get the file size of this file: " + path);
        }
        return result;
    }

}
