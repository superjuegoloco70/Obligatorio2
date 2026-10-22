package dominio;

public class Animal {
    private String codigo;
    private String nombre;
    private String temperamento;
    private float peso; //Kilogramos
    private int estado; //0: No disponible, 1:Disponible, 2:Entregado
    
    public Animal(String cod, String nom, String temp, float peso, int est){
        this.codigo = cod;
        this.nombre = nom;
        this.temperamento = temp;
        this.peso = peso;
        this.estado = est;
    }
    
    //Getters
    public String getCodigo(){
        return this.codigo;
    } 
    
    public String getNombre(){
        return this.nombre;
    } 
    
    public String getTemperamento(){
        return this.temperamento;
    } 
    
    public float getPeso(){
        return this.peso;
    } 
    
    public int getEstado(){
        return this.estado;
    }
    
    //Setters
    public void setCodigo(String cod){
        this.codigo = cod;
    }
    
    public void setNombre(String nom){
        this.nombre = nom;
    }
    
    public void setTemperamento(String temp){
        this.temperamento = temp;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public void setEstado(int est){
        this.estado = est;
    }
    
}
