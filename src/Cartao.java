/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luciano_simeao
 */
public class Cartao extends TipoPagamento {

    String nome;
    String numero;

    public Cartao() {
        super("Cartão");
    }

    @Override
    void exibirDados() {
        System.out.println(this.tipoPagamento);
        System.out.println("Emissor: " + this.getNome());
        System.out.println("Número: " + this.getNumero());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
