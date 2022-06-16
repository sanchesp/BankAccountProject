import acessos.Acesso;
import cliente.Cliente;
import contas.Conta;
import contas.TipoConta;
import funcionario.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
       //Cliente 1
       Cliente cliente1 = new Cliente("marcos", 123456789l,LocalDate.of(1989,9,23), 12345678910l);

       cliente1.setContas(new Conta(TipoConta.CONTA_CORRENTE, 1010l,150));

       cliente1.setContas(new Conta(TipoConta.CONTA_POUPANCA, 2020l,150));

       cliente1.setAcessoCliente(new Acesso(123456l,123456l));

       //Cliente 2
       Cliente cliente2 = new Cliente("Marcio", 987654321l,LocalDate.of(2000,9,23), 12345678911l);

       cliente2.setContas(new Conta(TipoConta.CONTA_CORRENTE, 1011l,150));

       cliente2.setContas(new Conta(TipoConta.CONTA_POUPANCA, 2021l,150));

       cliente2.setAcessoCliente(new Acesso(654321l,123456l));

       //Teste Ações Cliente1

       System.out.println(cliente1.getAcessoCliente().getStatusAcesso());

       cliente1.getAcessoCliente().login(123456l, 123456l);

       cliente1.getContas().get(0).deposita(BigDecimal.valueOf(1000));

       System.out.println("Saldo da conta é R$" +cliente1.getContas().get(0).getSaldo());

       cliente1.getContas().get(0).saque(BigDecimal.valueOf(500));

       System.out.println("Saldo da conta é R$" +cliente1.getContas().get(0).getSaldo());
       cliente1.getContas().get(0).transferencia(BigDecimal.valueOf(250),cliente2.getContas().get(0));
       System.out.println("Saldo da conta é R$" + cliente1.getContas().get(0).getSaldo());
       System.out.println("Saldo da conta é R$" +cliente2.getContas().get(0).getSaldo());

       cliente1.getAcessoCliente().logout();

       //Funcionario 1
       Funcionario funcionario1 = new Funcionario("Maria",123456789l, LocalDate.of(1990,10,21),12345678999l, 2300.00, "Caixa");
       funcionario1.setAcessoFuncionario(new Acesso(4545l, 123456l));

       //Funcionario 2
       Funcionario funcionario2 = new Funcionario("Marcela",123556789l, LocalDate.of(1999,01,30),12335678999l, 5000.00, "Gerente");
       funcionario1.setAcessoFuncionario(new Acesso(4546l, 123456l));

       //Teste Ações Funcionario1

       System.out.println(funcionario1.getAcessoFuncionario().getStatusAcesso());

       funcionario1.getAcessoFuncionario().login(4545l, 123456l);
       System.out.println(funcionario1.getAcessoFuncionario().getStatusAcesso());

       System.out.println(funcionario1.calcularPLR());
       System.out.println(funcionario1.calculoFerias());
    }
}
