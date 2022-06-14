package funcionario;

import acessos.Acesso;

import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private Long rg;
    private LocalDate dataNascimento;
    private Long cpf;
    protected Double salario;
    private String cargo;
    protected Acesso acessoFuncionario;
    protected Double plr;
    private Double ferias;

    public Funcionario (String nome, Long rg, LocalDate dataNascimento, Long cpf, Double salario, String cargo){
        this.setNome(nome);
        this.setRg(rg);
        this.setDataNascimento(dataNascimento);
        this.setCpf(cpf);
        this.setSalario(salario);
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
    public Long getCpf() {
        return cpf;
    }
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Double calcularPLR () {
        this.plr = this.salario*3.0;
        return this.plr;
    }
    public Double calculoFerias () {
        this.ferias = this.salario*1.3;
        return this.ferias;
    }

    public Acesso getAcessoFuncionario() {
        return acessoFuncionario;
    }

    public void setAcessoFuncionario(Acesso acessoFuncionario) {
        this.acessoFuncionario = acessoFuncionario;
    }
    public void criarAcesso (Long usuario, Long senha){
        this.acessoFuncionario.setUsuario(usuario);
        this.acessoFuncionario.setSenha(senha);
    }
}
