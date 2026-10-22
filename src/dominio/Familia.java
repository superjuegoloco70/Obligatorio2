package dominio;

public class Familia {
    private int cedula;
    private String apellido;
    private int celular;
    
    public Familia(int ced, String ape, int cel){
        this.cedula = ced;
        this.apellido = ape;
        this.celular = cel;
    }
    
    //Getters
    public int getCedula(){
        return this.cedula;
    } 
    
    public String getApellido(){
        return this.apellido;
    } 
    
    public int getCelular(){
        return this.celular;
    } 
    
    //Setters
    public void setCedula(int ced){
        this.cedula = ced;
    }
    
    public void setApellido(String ape){
        this.apellido = ape;
    }
    
    public void setCelular(int cel){
        this.celular = cel;
    }
}
