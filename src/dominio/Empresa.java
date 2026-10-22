package dominio;

public class Empresa {
    private String nombre;
    private int rut; //12 digitos
    private String direccion;
    
    public Empresa(String nom, int rut, String dir){
        this.nombre = nom;
        this.rut = rut;
        this.direccion = dir;
    }
    
    //Getters
    public String getNombre(){
        return this.nombre;
    } 
    
    public int getRut(){
        return this.rut;
    } 
    
    public String getDireccion(){
        return this.direccion;
    } 
    
    //Setters
    public void setNombre(String nom){
        this.nombre = nom;
    }
    
    public void setRut(int rut){
        this.rut = rut;
    }
    
    public void setDireccion(String dir){
        this.direccion = dir;
    }
}
