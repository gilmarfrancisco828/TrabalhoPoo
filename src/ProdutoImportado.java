/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luciano_simeao
 */
public class ProdutoImportado extends Produto{
   float taxaImposto;
   float taxaImportacao;
   
    @Override
    float calcularPreco(){
             return this.valor + this.taxaImportacao + this.taxaImposto;
    }

    public ProdutoImportado(String codigo, String descricao, float valor, float taxaImposto, float taxaImportacao) {
        super(codigo,descricao,valor);
        this.taxaImposto = taxaImposto;
        this.taxaImportacao = taxaImportacao;
    }
    
}
