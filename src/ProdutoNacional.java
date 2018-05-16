/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luciano_simeao
 */
public class ProdutoNacional extends Produto {

    ProdutoNacional(String codigo, int tipo, String descricao, float valor, float taxaImposto) {
        super(tipo, codigo, descricao, valor, taxaImposto);
    }

    @Override
    float calcularPreco() {
        return getValor() + (getTaxaImposto() * getValor());
    }
}
