package cliente;

import contas.Conta;
import acessos.Acesso;
import contas.TipoConta;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente  {

    protected String nome;
    protected Long rg;
    protected LocalDate dataNascimento;
    protected Long cpf;
    protected ArrayList<Conta> contas;
    protected Acesso acessoCliente;
    public Cliente(String nome, Long rg, LocalDate dataNascimento, Long cpf) {
        this.nome = nome;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.contas = new ArrayList();
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

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(Conta conta) {
        this.contas.add(conta);
    }
    public Acesso getAcessoCliente() {
        return acessoCliente;
    }

    public void setAcessoCliente(Acesso acessoCliente) {
        this.acessoCliente = acessoCliente;
    }
}
