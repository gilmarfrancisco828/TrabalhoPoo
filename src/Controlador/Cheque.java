package Controlador;

public class Cheque extends TipoPagamento{
    String nomeEmissor;
    String numeroCheque;
    private static final long serialVersionUID = 127L;

    public Cheque() {
        super("Cheque");
    }
    
    @Override
    public String exibirDados() {
        return this.tipoPagamento + "\nEmissor: \t" + this.getNomeEmissor()+ "\nNúmero: \t" + this.getNumeroCheque();
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
