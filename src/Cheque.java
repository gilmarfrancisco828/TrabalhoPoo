/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luciano_simeao
 */
public class Cheque extends TipoPagamento{
    String nomeEmissor;
    String numeroCheque;

    public Cheque() {
        super("Cheque");
    }
    
    
    
    
    @Override
    void exibirDados(){
        System.out.println(this.tipoPagamento);
        System.out.println("Emissor: " + this.getNomeEmissor());
        System.out.println("Número: " + this.getNumeroCheque());
    }
    
    void exibirDadosInline(){
        System.out.print(this.tipoPagamento + " - " + this.getNomeEmissor() + "\t\t" +this.getNumeroCheque());
    }

    public String getNomeEmissor() {
        return nomeEmissor;
    }

    public void setNomeEmissor(String nomeEmissor) {
        this.nomeEmissor = nomeEmissor;
    }

    public String getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(String numeroCheque) {
        this.numeroCheque = numeroCheque;
    }
    
}
