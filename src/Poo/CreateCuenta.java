package Poo;

public class CreateCuenta {
    public static void main(String[] args) {
        // instanciar una cuenta
        check primeraCuenta = new check(2,3);
        // forma de ingresar valor a la cuenta 
        primeraCuenta.saldo = 100;
        check segunda = new check(2,3);
        segunda.saldo = 100;
        /*
         * new check= {
         *  
         *  double saldo;
            int agencia;
            int numero;
            String titular;
                    key
         * }
         * instancia: 
         * primeraCuenta es 
         * check = {
         *  saldo   =   100
         *  agencia =   2
         *  numero  =   3
         *  titular =   Survi
         *  key         value
         * }
         * 
         */
        Cliente nostradamus = new Cliente();
        check cuentaNostra = new check(2,3);
        cuentaNostra.titular= nostradamus;
        System.out.println(nostradamus);
        System.out.println(cuentaNostra.titular);
        check.getTotalDeCuentas();
    }
}
