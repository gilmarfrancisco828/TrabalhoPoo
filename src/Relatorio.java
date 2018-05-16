
public abstract class Relatorio {

    public Relatorio() {
    }

    public static void clientesGeral(Cliente[] clientes) {
        System.out.println("NOME \t\t\t| CPF");
        for (Cliente cliente : clientes) {
            cliente.relatorio();
        }
    }

    public static void clienteEspecifico(Cliente cliente) {
        if (cliente != null) {
            cliente.relatorioDetalhado();

        } else {
            System.out.println("Cliente não encontrado");
        }
    }

    public static void produtosGeral(Produto[] produtos) {
        System.out.println("CÓDIGO \t|  DESCRIÇÃO \t\t| PREÇO");
        for (Produto produto : produtos) {
            produto.relatorio();
        }
    }

    public static void produtoEspecifico(Produto produto) {
        if (produto != null) {
            produto.relatorioDetalhado();
        } else {
            System.out.println("Produto não encontrado");
        }
    }

    public void relatorioGeral(Produto produtos[]) {
        System.out.println("CÓDIGO | DESCRIÇÃO | VALOR");
        for (int i = 0; i < produtos.length; i++) {
            produtos[i].relatorio();
        }
    }

    public void relatorioEspecifico(Produto produto) {
        System.out.println("CÓDIGO | DESCRIÇÃO | VALOR");
        produto.relatorio();
    }

    public void vendasGeral(Venda vendas[]) {
//        float soma = 0F;
//        for (int i = 0; i < vendas.length; i++) {
//            vendasEspecificoS(vendas[i]);
//            soma += vendas[i].total;
//        }
//        System.out.println("Total Geral: R$ " + soma);
    }

    public void vendasEspecificoS(Venda venda) {
    }

    public void vendasEspecificoC(Venda venda) {
    }

    public void vendasPagamentoDetalhada() {
    }
}
