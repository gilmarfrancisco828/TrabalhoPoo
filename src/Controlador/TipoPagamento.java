package Controlador;

import java.io.Serializable;

public abstract class TipoPagamento implements Serializable{
    
    private static final long serialVersionUID = 124L;
    String tipoPagamento;

    public TipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    
    public String getTipoPagamento(){
        return this.tipoPagamento;
    }
    public abstract String exibirDados();
    
    public static TipoPagamento cadPagamento(String tipo, String titular, String numero){
        if(tipo.equals("Dinheiro")){
               Dinheiro t = new Dinheiro();
               return t;
           }
           if(tipo.equals("Cheque")){
               Cheque t = new Cheque();
               t.setNomeEmissor(titular);
               t.setNumeroCheque(numero);
               return t;
           }
           if(tipo.equals("Cartão")){
               Cartao t = new Cartao();
               t.setNome(titular);
               t.setNumero(numero);
               return t;
           }
           return null;
    }
}
