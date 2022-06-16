package acessos;

public class Acesso {
    private Long usuario;
    private Long senha;
    protected Boolean statusAcesso = false;


    public Acesso(Long usuario, Long senha) {
        this.setUsuario(usuario);
        this.setSenha(senha);
    }

    public Long getUsuario() {
        return usuario;
    }

    public void setUsuario(Long usuario) {
        this.usuario = usuario;
    }

    public Long getSenha() {
        return senha;
    }

    public void setSenha(Long senha) {
        this.senha = senha;
    }

    public Boolean getStatusAcesso() {
        return statusAcesso;
    }
    public void setStatusAcesso(Boolean statusAcesso) {
        this.statusAcesso = statusAcesso;
    }
    public Boolean login(Long usuario, Long senha) {
        if (getUsuario().equals(usuario)) {
            if (getSenha().equals(senha)) {
                this.setStatusAcesso(true);
                System.out.println(getUsuario()+" login efetuado com sucesso");
            }
            } else { this.setStatusAcesso(false);
        }
            return this.statusAcesso;
    }
    public Boolean logout(){
        if(getStatusAcesso().equals(false)){
            System.out.println("Não há usuario logado");
        }else {
            this.setStatusAcesso(false);
        }
        return this.statusAcesso;
    }
}