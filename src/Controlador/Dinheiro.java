package Controlador;

public class Dinheiro extends TipoPagamento {
private static final long serialVersionUID = 126L;
    public Dinheiro() {
        super("Dinheiro");
    }

    @Override
    public String exibirDados() {
        return this.tipoPagamento;
    }

}
