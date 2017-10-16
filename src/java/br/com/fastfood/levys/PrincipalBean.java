package br.com.fastfood.levys;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "principalBean")
@ViewScoped
public class PrincipalBean implements Serializable{
    
    private Pedido pedidoSelected = new Pedido();    
    private List<Pedido> pedidos = new ArrayList<Pedido>();
    
    
    public void add(){
        
        pedidos.add(pedidoSelected);    
        pedidoSelected = new Pedido();
    
    }
    
       public void drop(){
     System.out.println("Pedidos: "+pedidos.size());
        
        pedidos.remove(pedidoSelected);
        System.out.println(pedidos.size());
    
    }
   
       public void limpaTabela(){
           pedidos=new ArrayList<Pedido>();
       }
       
    public Pedido getPedidoSelected() {
        return pedidoSelected;
    }

    public void setPedidoSelected(Pedido pedidoSelected) {
        this.pedidoSelected = pedidoSelected;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    
    
    
    
    
    
    
    
    
}
