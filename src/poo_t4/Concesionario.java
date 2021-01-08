/**
 * 
 */
package poo_t4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Concesionario {
    
    private Coche[] coches;
    private int numero;

    public Concesionario(int cantidad) {
        this.coches = new Coche[cantidad];
        this.numero = 0;
    }

    
    public void addCoche() throws IOException{
        // This method adds an element to the list
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        //Hacerlo también con el constructor completo como ejercicio
        Coche newAuto=new Coche();
        
        System.out.print("Brand: ");
        newAuto.setMarca(input.readLine());
        System.out.print("Model: ");
        newAuto.setModelo(input.readLine());
        System.out.print("Color: ");
        newAuto.setColor(input.readLine());
        System.out.print("Length (in mm): ");
        newAuto.setLargo(Integer.parseInt(input.readLine()));
        System.out.print("Width (in mm): ");
        newAuto.setAncho(Integer.parseInt(input.readLine()));
        System.out.print("Height (in mm): ");
        newAuto.setAlto(Integer.parseInt(input.readLine()));
        
        //Habría que comprobar que no sea más de cantidad
        coches[this.numero] = newAuto;
        this.numero++;
    }
    
    public void getAutos(){
        for (int i=0; i<coches.length;i++){
            System.out.println(coches[i]);
        }
    }
    
}
