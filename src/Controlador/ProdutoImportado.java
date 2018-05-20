package Controlador;

public class ProdutoImportado extends Produto {
    private static final long serialVersionUID = 1232L;

    private float taxaImportacao;

    ProdutoImportado(String codigo, int tipo, String descricao, float valor, float taxaImposto, float taxaImportacao) {
        super(tipo, codigo, descricao, valor, taxaImposto);
        setTaxaImportacao(taxaImportacao);
    }
    
    @Override
    public String relatorioDetalhado() {
        return "Código: "             + this.getCodigo() + 
                    "\nDescrição: "     + this.getDescricao() + 
                    "\nPreço: "            + String.format("%.02f", calcularPreco()) + 
                    "\nTaxa:  R$"              + String.format("%.02f", getTaxaImposto()) + 
                    "\nTaxa Import.: "+ String.format("%.02f", getTaxaImportacao()) + 
                    "\nTipo: "               + this.getTipoDescricao();
    }
    @Override
    float calcularPreco() {
        return getValor() + (getTaxaImposto() * getValor()) + (getValor() * getTaxaImportacao());
    }

    public float getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(float taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

}
