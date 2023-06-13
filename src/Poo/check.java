package Poo;

public class check {
    //atributos
    double saldo;
    int agencia;
    int numero;
    Cliente titular;
    private static int totalDeCuentas =0;

    public check(int agencia,int numero){
        this.agencia = agencia;
        this.numero = numero;
       
        check.totalDeCuentas++;
    }

    public static void getTotalDeCuentas(){
        System.out.println(check.totalDeCuentas);
    }
    
    
    public void depositar(double valor){
        this.saldo = this.saldo +valor;
    }
    public boolean retirar(double valor){
        if(this.saldo >= valor){
            System.out.println("se retiro :"+valor);
            this.saldo = this.saldo -valor;
            return true;
        }
        return false;
    }
    
}
