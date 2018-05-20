package Controlador;

public class ProdutoNacional extends Produto {

    private static final long serialVersionUID = 1231L;

    ProdutoNacional(String codigo, int tipo, String descricao, float valor, float taxaImposto) {
        super(tipo, codigo, descricao, valor, taxaImposto);
    }

    @Override
    public String relatorioDetalhado() {
        return "Código: " + this.getCodigo()
                + "\nDescrição: " + this.getDescricao()
                + "\nPreço: R$" + String.format("%.02f", calcularPreco())
                + "\nTaxa: " + String.format("%.02f", getTaxaImposto())
                + "\nTipo: " + this.getTipoDescricao();
    }

    @Override
    float calcularPreco() {
        return getValor() + (getTaxaImposto() * getValor());
    }
}
