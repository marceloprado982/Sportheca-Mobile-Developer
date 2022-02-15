public class ContaSalario extends Conta  implements Tributavel {
    public double getValorImposto() {
        return this.getSaldo() * 0.01;}


    private int quantidadeSaques;


    public ContaSalario(int numero, int agencia, String banco, double saldo, int quantidadeSaques) {
        super(numero, agencia, banco, saldo);

    }

    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return "ContaSalario{" +
                "saldo=" + saldo +
                ", quantidadeSaques=" + quantidadeSaques +
                '}';
    }

    @Override
    public boolean sacar(double quantia) {
        if (quantia>saldo) {
            return false;
        }else {
            if(this.quantidadeSaques >0){
                this.quantidadeSaques--;
                this.saldo -=quantia;
                return true;
            }
            else{
                System.out.println("Limite de saque excedido.");
                return false;
            }

        }

    }
}

