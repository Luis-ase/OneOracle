package Polimorfismo;

public class Polimorfismo {
    public static void main(String[] args) {
        Funcionario capo = new Funcionario();
        capo.setNombre("capito");
        capo.setSalario(2000);
        System.out.println(capo.getBonificacion(0.1));
        
        System.out.println(capo.getNombre().toString());
    }
}
