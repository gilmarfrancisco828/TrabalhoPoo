
public class MenuRelatorio extends Menu {

    MenuRelatorio() {
        exibicao += "______Relatórios______\n";
        exibicao += "1 - Clientes Geral\n";
        exibicao += "2 - Cliente Específico\n";
        exibicao += "3 - Produtos Geral\n";
        exibicao += "4 - Produtos Específico\n";
        exibicao += "5 - Sair\n";
    }

    @Override
    public void exibir() {
        super.exibir();
    }

    public void escolha(Empresa emp) {
        switch (this.opcao()) {
            case 1:
                //Relatório de clientes Geral
                Relatorio.clientesGeral(emp.getClientes());
                System.out.println("\n\nTotal de clientes: " + emp.getContc());
                break;
            case 2:
                //Relatório de cliente específico
                System.out.println("Digite o CPF do cliente desejado: ");
                input.nextLine();
                Relatorio.clienteEspecifico(Cliente.buscarCpf(emp.getClientes(), input.nextLine()));
                break;
            case 3:
                //Relatório de produtos Geral
                Relatorio.produtosGeral(emp.getProdutos());
                System.out.println("\n\nTotal de produtos: " + emp.getContp());
                break;
            case 4:
                //Relatório de produto específico
                System.out.println("Digite o código do produto desejado: ");
                input.nextLine();
                Relatorio.produtoEspecifico(Produto.buscarCodigo(emp.getProdutos(), input.nextLine()));
                break;
            case 5:
                //Sair
                break;
        }
    }

}
