
public class Dinheiro extends TipoPagamento {

    public Dinheiro() {
        super("Dinheiro");
    }

    @Override
    void exibirDados() {
        System.out.println(this.tipoPagamento);
    }

}
