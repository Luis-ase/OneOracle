package Poo;

public class check {
    //atributos
    double saldo;
    int agencia;
    int numero;
    Cliente titular;
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
