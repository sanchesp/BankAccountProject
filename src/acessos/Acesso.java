package acessos;

public class Acesso {
    protected Long usuario;
    protected Long senha;
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

    public Boolean login(Long usuario, Long senha) {
        if (getUsuario().equals(usuario)) {
            if (getSenha().equals(senha)) {
                this.statusAcesso = true;
            }
            } else { this.statusAcesso = false;
        }
            return this.statusAcesso;
    }
    public Boolean logout(){
        if(getStatusAcesso()==false){
            System.out.println("Não há usuario logado");
        }
        return this.statusAcesso = false;
    }
}