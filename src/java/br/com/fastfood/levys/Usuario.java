package br.com.fastfood.levys;

public class Usuario {

    private int id_Login;
    private String login;
    private String senha;
    private String email;

    public int getId_Login() {
        return id_Login;
    }

    public void setId_Login(int id_Login) {
        this.id_Login = id_Login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
