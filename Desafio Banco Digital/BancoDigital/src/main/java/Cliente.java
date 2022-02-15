public class Cliente implements Autenticador {
    private String nome;
    private boolean status;
    private String senha;
    private int compras;

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public int getCompras(){
        return this.compras;
    }

    public Cliente(String nome, boolean status, String senha, int compras) {
        this.nome = nome;
        this.status = status;
        this.senha = senha;
        this.compras = compras;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", status=" + status +
                ", senha='" + senha + '\'' +
                '}';
    }

    public boolean autentica(String senha) {
        if (this.senha != senha) {
            System.out.println("Não autenticado!");
            return false;
        } else {
            System.out.println("Autenticado!");
            return true;
        }
    }
}