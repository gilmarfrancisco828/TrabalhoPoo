
import java.util.Calendar;

public class Venda {
    
    private static final long serialVersionUID = 126L;
    private String numero;
    private Item[] itens;
    private int conti;
    private final int ni = 10;
    private TipoPagamento tipoPgto;
    private Cliente cliente;
    private final Calendar data;

    public Venda() {
        //Definir um tamanho fixo para Item[] ou passar o array por parâmetro e alocar dinâmicamente?
        this.numero = numero;
        this.itens = new Item[ni];
        this.conti = 0;
        this.tipoPgto = tipoPgto;
        this.cliente = cliente;
        this.data = Calendar.getInstance();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

    public TipoPagamento getTipoPgto() {
        return tipoPgto;
    }

    public void setTipoPgto(TipoPagamento tipoPgto) {
        this.tipoPgto = tipoPgto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNi() {
        return ni;
    }

    void addItem(Item item) {
        if (conti < ni) {
            this.itens[conti] = item;
            conti++;
        } else {
            System.out.println("Máximo de produtos atingido!");
        }
    }

    public float calcularTotal() {
        float soma = 0;
        for (int i = 0; i < this.conti; i++) {
            soma+=this.itens[i].calcularTotal();
        }
        return soma;
    }

}
