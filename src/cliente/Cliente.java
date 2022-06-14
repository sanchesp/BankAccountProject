package cliente;

import contas.Conta;
import acessos.Acesso;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente  {

    protected String nome;
    protected Long rg;
    protected LocalDate dataNascimento;
    protected Long cpf;
    protected Conta conta;
    protected ArrayList<Conta> minhasContas;
    protected Acesso acessoCliente;
    public Cliente(String nome, Long rg, LocalDate dataNascimento, Long cpf) {
        this.setNome(nome);
        this.setRg(rg);
        this.setDataNascimento(dataNascimento);
        this.setCpf(cpf);
        this.setMinhasContas(new ArrayList());
    }
    public Long getCpf() {
        return cpf;
    }
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getRg() {
        return rg;
    }

    public void setRg(Long rg) {
        this.rg = rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ArrayList<Conta> getMinhasContas() {
        return minhasContas;
    }

    public void setMinhasContas(ArrayList<Conta> minhasContas) {
        this.minhasContas = minhasContas;
    }
    public Acesso getAcessoCliente() {
        return acessoCliente;
    }

    public void setAcessoCliente(Acesso acessoCliente) {
        this.acessoCliente = acessoCliente;
    }
    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    public void criarAcesso (Long usuario, Long senha){
        this.acessoCliente.setUsuario(usuario);
        this.acessoCliente.setSenha(senha);
    }
    public void criarConta (Long numeroConta, Integer agencia) {
        this.conta.setNumeroConta(numeroConta);
        this.conta.setAgencia(agencia);
        }


}
