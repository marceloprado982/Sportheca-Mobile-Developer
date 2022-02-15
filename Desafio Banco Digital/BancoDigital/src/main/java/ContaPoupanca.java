import java.util.Calendar;

public class ContaPoupanca extends Conta {
    private int diaAniversario;
    private double taxaJuros;



    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaJuros) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaJuros = taxaJuros;
    }



    public double getSaldo(int dia) {
        if(dia>= this.diaAniversario){
            return this.saldo + this.taxaJuros*this.saldo;
        } else{
            return this.saldo;
        }

    }
    public boolean sacar(double quantia) {
        this.saldo -= quantia;
        return true;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "saldo=" + saldo +
                ", diaAniversario=" + diaAniversario +
                ", taxaJuros=" + taxaJuros +
                '}';
    }
}