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
    public void setDocumento(String valor){
         this.documento= valor;
    }

    public void setSalario(double valor){
        this.salario = valor;
    }

    public double getSalario(){
        return this.salario;
    }

    public double getBonificacion(double valorDeLaBonificacion){
        double bonificacion = this.salario * valorDeLaBonificacion;
        System.out.println("tu bonificacion total es del " + bonificacion);
        this.salario += bonificacion;
        return this.salario;
    }
}
