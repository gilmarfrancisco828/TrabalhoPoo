package Controlador;

public class Cartao extends TipoPagamento {
    private static final long serialVersionUID = 125L;
    String nome;
    String numero;

    public Cartao() {
        super("Cartão");
    }

    @Override
    public String exibirDados() {
        return this.tipoPagamento + "\nEmissor: \t" + this.getNome() + "\nNúmero: \t" + this.getNumero();
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
