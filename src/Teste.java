import cliente.Cliente;
import contas.TipoConta;
import java.time.LocalDate;

public class Teste {

    public static void main(String[] args) {
       Cliente cliente1 = new Cliente("marcos", 123456789l,LocalDate.of(1989,9,23), 12345678910l);
       cliente1.criarAcesso(123456l, 123456l);

    }
}
