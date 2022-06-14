package contas;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Enum<TipoConta> tipoConta, Long numeroConta, Integer agencia) {
        super(tipoConta, numeroConta, agencia);
    }

    public void renderJuros(double taxa){
        super.saldo = super.saldo.multiply(BigDecimal.valueOf(taxa));
    }
}
