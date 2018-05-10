/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luciano_simeao
 */
public abstract class Produto {
    String codigo;
    String descricao;
    float valor;
    
    Produto(String codigo, String descricao, float valor){
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    abstract float calcularPreco();
}
