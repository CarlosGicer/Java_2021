/**
 * 
 */
package poo_t4;

/**
 * @author sjgui
 *
 */
public class Coche {
	private String marca="";
    private String modelo="";
    private String color="";
    private int largo=0;
    private int ancho=0;
    private int alto=0;

    //Añadir caballos, precio y consumo a los 100km
    
    public Coche(){
        // Empty constructor
    }
    
    public Coche(String marca, String modelo,String color, int largo, int ancho, int alto){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.largo=largo;
        this.ancho=ancho;
        this.alto=alto;
    }
    
    // Setters
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
    public void setLargo(int largo){
        this.largo=largo;
    }
    
    public void setAncho(int ancho){
        this.ancho=ancho;
    }
    
    public void setAlto(int alto){
        this.alto=alto;
    }
    
    // Getters
    
    public String getMarca(){
        return this.marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public int getLargo(){
        return this.largo;
    }
    
    public int getAncho(){
        return this.ancho;
    }
    
    public int getAlto(){
        return this.alto;
    }
    
    @Override
    public String toString(){
        return (this.marca+" "+
                this.modelo+" "+
                this.color+" "+
                "Dimensiones (LxWxH in mm): "+
                this.largo+"x"+
                this.ancho+"x"+
                this.alto
                );
    }
    
}