package cliente;

import java.time.LocalDate;

public class Cliente {

    private String nome;
    private Long rg;
    private LocalDate dataNascimento;
    protected Long cpf;

    public Long getCpf() {
        return cpf;
    }
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
}
