/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author parafuso828
 */
public class Empresa {

    String nome;
    int nc;
    int np;
    int nv;
    int contc;
    int contp;
    int contv;
    Cliente clientes[];
    Produto produtos[];
    Venda vendas[];

    public Empresa() {
    }

    public Empresa(String nome, Cliente[] clientes, Produto[] produtos, Venda[] vendas) {
        this.nome = nome;
        this.contc = clientes.length;
        this.contp = produtos.length;
        this.contv = vendas.length;
        
        this.clientes = new Cliente[nc];
        this.produtos = new Produto[np];
        this.vendas = new Venda[nv];
        
        for (int i = 0; i < this.contc; i++) {
            this.clientes[i] = clientes[i];
        }
        for (int i = 0; i < this.contp; i++) {
            this.produtos[i] = produtos[i];
        }
        for (int i = 0; i < this.contv; i++) {
            this.vendas[i] = vendas[i];
        }
    }

    public void addCliente(Cliente cli, int nc) {
        if (contc < nc) {
            this.clientes[contc] = cli;
            contc++;
        }
    }

    public void addProdutos(Produto pro, int np) {
        if (contp < np) {
            this.produtos[contp] = pro;
            contp++;
        }
    }

    public void addProdutos(Venda ven, int nv) {
        if (contv < nv) {
            this.vendas[contv] = ven;
            contv++;
        }
    }

    public Cliente getCliente(int pos) {
        if (pos < contc) {
            return clientes[pos];
        }
        return null;
    }

    public Produto getProduto(int pos) {
        if (pos < contp) {
            return produtos[pos];
        }
        return null;
    }

    public Venda getVenda(int pos) {
        if (pos < contv) {
            return vendas[pos];
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public Venda[] getVendas() {
        return vendas;
    }

    public void setVendas(Venda[] vendas) {
        this.vendas = vendas;
    }
}
