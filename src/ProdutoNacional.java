/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luciano_simeao
 */
public class ProdutoNacional extends Produto{
        float taxaImposto;
        
            @Override
            float calcularPreco(){
                
            }
            
            ProdutoNacional(String codigo, String descricao, float valor, float taxaImposto){
                super()
            }

    public float getTaxaImposto() {
        return taxaImposto;
    }

    public void setTaxaImposto(float taxaImposto) {
        this.taxaImposto = taxaImposto;
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
}
