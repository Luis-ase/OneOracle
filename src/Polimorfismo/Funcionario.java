package Polimorfismo;

public class Funcionario {
    private String nombre;
    private String documento;
    private double salario;

    public Funcionario(){
        
    }
    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @return
     */

    public String getDocumento(){
        return this.documento;
    }


}
