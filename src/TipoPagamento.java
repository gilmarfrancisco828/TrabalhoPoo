
public abstract class TipoPagamento {

    String tipoPagamento;

    public TipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    
    

    abstract void exibirDados();
}
