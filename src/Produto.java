
import java.io.Serializable;


public abstract class Produto implements Serializable{

    private static final long serialVersionUID = 123L;
    private int tipo;
    private String codigo;
    private String descricao;
    private float valor;
    private float taxaImposto;

    public Produto() {
    }

    public Produto(int tipo, String codigo, String descricao, float valor, float taxaImposto) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.taxaImposto = taxaImposto;
    }
    
    
    abstract float calcularPreco();

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getTaxaImposto() {
        return taxaImposto;
    }

    public void setTaxaImposto(float taxaImposto) {
        this.taxaImposto = taxaImposto;
    }
    
    public void relatorio(){
        String space = "";
        for (int i = 0; i < (18 - this.getDescricao().length()); i++) {
            space = space.concat(" ");
        }
        System.out.println(this.getCodigo()+ "\t   " + this.getDescricao() + space + "\t  R$ " + calcularPreco());
    }
    
    public void relatorioDetalhado()
    {
        System.out.println("CÓDIGO: \t"+ this.getCodigo());
        System.out.println("DESCRIÇÃO: \t" + this.getDescricao());
        System.out.println("PREÇO: \t\t" + calcularPreco());
        if(this.getTipo() == 1){
                System.out.println("TIPO: \t\tProduto Nacional");
            }
            else if(this.getTipo() == 2){
                System.out.println("TIPO: \t\tProduto Importado");
            }
    }
    
    public static Produto buscarCodigo(Produto[] produtos, String codigo)
    {
        for (Produto produto : produtos) {
            if (codigo.equals(produto.getCodigo())) {
                return produto  ;
            }
        }
        return null;
    }
}
