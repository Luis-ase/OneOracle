package Polimorfismo;

public class Polimorfismo {
    public static void main(String[] args) {
        Funcionario capo = new Funcionario();
        capo.setNombre("capito");
        
        System.out.println(capo.getNombre().toString());
    }
}
