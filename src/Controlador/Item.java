package Controlador;

import java.io.Serializable;

public class Item implements Serializable{
    
    private static final long serialVersionUID = 125L;
    private int num;//O que é num????
    private Produto produto;
    private float quantidade;

    public Item(int num, Produto produto, float quantidade) {
        this.num = num;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public float calcularTotal() {
        return (this.quantidade * this.produto.calcularPreco());
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

}
