package br.com.fastfood.levys;

import java.util.Objects;

public class Pedido {
    
    private int id_pedido;
    private Cliente id_cliente;
    private Cardapio id_cardapio;
    private int codigo;
    private String nome;
    private int quantidade;
    private String tipo;
    private float valor;
    private float soma_parc;
    private String forma_pagamento;
    private int status;// 0 - aguardando; 1 - recebido 2 - pronto
    

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Cliente getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Cliente id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Cardapio getId_cardapio() {
        return id_cardapio;
    }

    public void setId_cardapio(Cardapio id_cardapio) {
        this.id_cardapio = id_cardapio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getSoma_parc() {
        return soma_parc;
    }

    public void setSoma_parc(float soma_parc) {
        this.soma_parc = soma_parc;
    }

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }
    


}
