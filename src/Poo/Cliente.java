package Poo;

public class Cliente {
    private String nombre;
    private String documento;
    private String telefono;
    
    public String getTelefono(){
        return this.telefono;
    }
    public void setTelefono(String valor){
        this.telefono = valor;
    }

    public String getDocumento(){
        return this.documento;
    }
    public void setDocumento(String valor){
        this.documento = valor;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String valor){
        this.nombre = valor;
    }


}
