/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fastfood.levys;

import java.io.Serializable;

/**
 *
 * @author LevydeSouza
 */
public class ItemPedido implements Serializable{
    
    
    private int id;
    
    private Pedido pedido;
    
    private Cardapio produto;
    
    private int Qtd;
    
    private Double sub_total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Cardapio getProduto() {
        return produto;
    }

    public void setProduto(Cardapio produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return Qtd;
    }

    public void setQtd(int Qtd) {
        this.Qtd = Qtd;
    }

    public Double getSub_total() {
        return sub_total;
    }

    public void setSub_total(Double sub_total) {
        this.sub_total = sub_total;
    }
    
    
        
    
}
