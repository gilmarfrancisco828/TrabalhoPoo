package Controlador;

public class ProdutoNacional extends Produto {

    ProdutoNacional(String codigo, int tipo, String descricao, float valor, float taxaImposto) {
        super(tipo, codigo, descricao, valor, taxaImposto);
    }

    @Override
    float calcularPreco() {
        return getValor() + (getTaxaImposto() * getValor());
    }
}
