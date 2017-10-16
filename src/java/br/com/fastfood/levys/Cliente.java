package br.com.fastfood.levys;

import java.util.Date;

public class Cliente {

    private int id_cliente;
    private Usuario tb_login_idt_login;
    private String nome;
    private char cpf;
    private Date dt_nasc;
    private char sexo;
    private String email;
    private String telefone;
    private String senha;
    private String n_cartao;
    private Date dt_venc;
    private char csv;

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Usuario getTb_login_idt_login() {
        return tb_login_idt_login;
    }

    public void setTb_login_idt_login(Usuario tb_login_idt_login) {
        this.tb_login_idt_login = tb_login_idt_login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getCpf() {
        return cpf;
    }

    public void setCpf(char cpf) {
        this.cpf = cpf;
    }

    public Date getDt_nasc() {
        return dt_nasc;
    }

    public void setDt_nasc(Date dt_nasc) {
        this.dt_nasc = dt_nasc;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getN_cartao() {
        return n_cartao;
    }

    public void setN_cartao(String n_cartao) {
        this.n_cartao = n_cartao;
    }

    public Date getDt_venc() {
        return dt_venc;
    }

    public void setDt_venc(Date dt_venc) {
        this.dt_venc = dt_venc;
    }

    public char getCsv() {
        return csv;
    }

    public void setCsv(char csv) {
        this.csv = csv;
    }
    
    
}
