import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Menu {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(1,5,"Brasil",150,1500);
        ContaPoupanca cp1 = new ContaPoupanca(1,5,"Brasil",250,15,0.05);
        ContaSalario cs1 = new ContaSalario(1,5,"Brasil",1200,2);

        List<Conta> contas = Arrays.asList(cc1, cp1, cs1);

        contas.forEach(conta -> System.out.println(conta));


    }


}

