package Controlador;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Empresa {

    String nome;
    final int nc = 500;
    final int np = 500;
    final int nv = 500;
    int contc;
    int contp;
    int contv;
    Cliente clientes[];
    Produto produtos[];
    Venda vendas[];

    public Empresa() {
        this.clientes = new Cliente[nc];
        this.produtos = new Produto[np];
        this.vendas = new Venda[nv];
    }

    public boolean addCliente(Cliente cli) {
        if (contc < nc) {
            this.clientes[contc] = cli;
            contc++;
            return true;
        }
        return false;
    }

    public boolean addProduto(Produto pro) {
        if (contp < np) {
            this.produtos[contp] = pro;
            contp++;
            return true;
        }
        return false;
    }

    public boolean addVenda(Venda ven) {
        if (contv < nv) {
            this.vendas[contv] = ven;
            contv++;
            return true;
        }
        return false;
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
        Cliente[] clis;
        clis = new Cliente[this.contc];
        System.arraycopy(this.clientes, 0, clis, 0, this.contc);
        return clis;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public Produto[] getProdutos() {
        Produto[] prods;
        prods = new Produto[this.contp];
        System.arraycopy(this.produtos, 0, prods, 0, this.contp);
        return prods;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public Venda[] getVendas() {
        Venda[] vends;
        vends = new Venda[this.contv];
        System.arraycopy(this.vendas, 0, vends, 0, this.contv);
        return vends;
    }

    public void setVendas(Venda[] vendas) {
        this.vendas = vendas;
    }

    public int getContc() {
        return contc;
    }

    public int getContp() {
        return contp;
    }

    public int getContv() {
        return contv;
    }

    public static void salvar(Empresa emp) throws IOException {
        //Salvando clientes
        File fclientes;
        fclientes = new File("clientes.dat");
        fclientes.write(emp.getClientes());

        //Salvando produtos
        File fprodutos;
        fprodutos = new File("produtos.dat");
        fprodutos.write(emp.getProdutos());
        
        //Salvando compras
        File fvendas;
        fvendas = new File("vendas.dat");
        fvendas.write(emp.getVendas());
    }

    public static void carregar(Empresa emp) throws IOException, FileNotFoundException, ClassNotFoundException {
        //Carregando produtos
        File fprodutos = new File("produtos.dat");
        Object oprodutos[];
        oprodutos = fprodutos.read();
        if (oprodutos != null) {
            for (Object oproduto : oprodutos) {
                //Verifica qual o tipo do produto e faz a devida conversão
                Produto p = (Produto) oproduto;
                if (p.getTipo() == 1) {
                    emp.addProduto((ProdutoNacional) p);
                } else if (p.getTipo() == 2) {
                    emp.addProduto((ProdutoImportado) p);
                }
            }
        }

        //Carregando clientes
        File fclientes = new File("clientes.dat");
        Object oclientes[];
        oclientes = fclientes.read();

        if (oclientes != null) {
            for (Object ocliente : oclientes) {
                emp.addCliente((Cliente) ocliente);
            }
        }
        
        //Carregando vendas
        File fvendas = new File("vendas.dat");
        Object ovendas[];
        ovendas = fvendas.read();

        if (ovendas != null) {
            for (Object ovenda : ovendas) {
                emp.addVenda((Venda) ovenda);
            }
        }
    }

}
