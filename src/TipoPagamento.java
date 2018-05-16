
public abstract class TipoPagamento {
    
    private static final long serialVersionUID = 124L;
    String tipoPagamento;

    public TipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    
    

    abstract void exibirDados();
}
