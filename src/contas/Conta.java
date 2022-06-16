package contas;

import acessos.Acesso;
import cliente.Cliente;

import java.math.BigDecimal;

public class Conta {

    protected Enum<TipoConta> tipoConta;
    protected Long numeroConta;
    protected Integer agencia;
    protected BigDecimal saldo;



    public Conta(Enum<TipoConta> tipoConta, Long numeroConta, Integer agencia) {
        this.setTipoConta(tipoConta);
        this.setNumeroConta(numeroConta);
        this.setAgencia(agencia);
        this.setSaldo(BigDecimal.ZERO);
    }

    public Enum<TipoConta> getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(Enum<TipoConta> tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal deposita(BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
        return this.saldo;
    }

    public BigDecimal saque(BigDecimal valor) {
        this.saldo = this.saldo.subtract(valor);
        return this.saldo;
    }
    public BigDecimal transferencia(BigDecimal valor, Conta destino) {
        BigDecimal saldoAtualizadoDaContaOrigem = saque(valor);
        destino.deposita(valor);
        return saldoAtualizadoDaContaOrigem;
    }
}
