package Controlador;

import java.io.Serializable;

public abstract class Produto implements Serializable {

    private static final long serialVersionUID = 123L;
    private int tipo;
    private String codigo;
    private String descricao;
    private float valor;
    private float taxaImposto;

    public Produto() {
    }

    public Produto(int tipo, String codigo, String descricao, float valor, float taxaImposto) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.taxaImposto = taxaImposto;
    }

    abstract float calcularPreco();

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTipoDescricao() {
        if (this.getTipo() == 1) {
            return "Produto Nacional";
        } else {
            return "Produto Importado";
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getTaxaImposto() {
        return taxaImposto;
    }

    public void setTaxaImposto(float taxaImposto) {
        this.taxaImposto = taxaImposto;
    }

    public void relatorio() {
        String space = "";
        for (int i = 0; i < (18 - this.getDescricao().length()); i++) {
            space = space.concat(" ");
        }
        System.out.println(this.getCodigo() + "\t   " + this.getDescricao() + space + "\t  R$ " + calcularPreco());
    }

    abstract public String relatorioDetalhado() ;

    public static Produto buscarCodigo(Produto[] produtos, String codigo) {
        for (Produto produto : produtos) {
            if (codigo.equals(produto.getCodigo())) {
                return produto;
            }
        }
        return null;
    }

    public static Produto cadProduto(int contProdutos, int tipo, String descricao, float valor, float taxa, float taxaimportacao) {
        if (tipo == 1) {
            ProdutoNacional p = new ProdutoNacional(contProdutos + "PN", tipo, descricao, valor, taxa);
            return p;
        }
        if (tipo == 2) {
            ProdutoImportado p = new ProdutoImportado(contProdutos + "PI", tipo, descricao, valor, taxa, taxaimportacao);
            return p;
        }
        return null;
    }
}
