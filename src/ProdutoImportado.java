
public class ProdutoImportado extends Produto {

    private float taxaImportacao;

    ProdutoImportado(String codigo, int tipo, String descricao, float valor, float taxaImposto, float taxaImportacao) {
        super(tipo, codigo, descricao, valor, taxaImposto);
        setTaxaImportacao(taxaImportacao);
    }

    @Override
    float calcularPreco() {
        return super.getValor() + (super.getTaxaImposto() * super.getValor()) + (super.getValor() * getTaxaImportacao());
    }

    public float getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(float taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

}
