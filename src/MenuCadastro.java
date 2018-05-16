
public class MenuCadastro extends Menu {

    MenuCadastro() {
        exibicao += "______Cadastro______\n";
        exibicao += "1 - Cliente\n";
        exibicao += "2 - Produto\n";
        exibicao += "3 - Sair\n";
    }

    @Override
    public void exibir() {
        super.exibir();
    }

    public Cliente cadCliente() {

        Cliente cli = new Cliente();
        //Le dados referentes ao cliente e salva no objeto cli criado
        input.nextLine();
        System.out.println("Entre com o nome: ");
        cli.setNome(input.nextLine());

        System.out.println("Entre com o CPF: ");
        cli.setCpf(input.nextLine());

        return cli;

    }

    public Produto cadProduto(int codigo) {
        Produto p = null;

        input.nextLine();
        System.out.println("Entre com a descrição do produto: ");
        String descricao = input.nextLine();

        System.out.println("Entre com o valor do produto: ");
        float valor = input.nextFloat();

        System.out.println("Entre com a taxa de Imposto: ");
        float taxa = input.nextFloat();

        System.out.println("Entre com o tipo de produto:\n1 - Produto Nacional\n2 - Produto Importado");
        int tipo = input.nextInt();
        if (tipo == 1) {
            p = new ProdutoNacional(codigo + "PN", tipo, descricao, valor, taxa);
        } else if (tipo == 2) {
            System.out.println("Entre com a taxa de importação: ");
            float taxaimpor = input.nextFloat();
            p = new ProdutoImportado(codigo + "PI", tipo, descricao, valor, taxa, taxaimpor);
        }
        return p;
    }

    public void escolha(Empresa emp) {
        switch (this.opcao()) {
            case 1:
                //Cadastro de clientes
                //Adiciona o cliente criado ao vetor de clientes da empresa
                emp.addCliente(this.cadCliente());
                System.out.println("Total: " + emp.getContc());
                break;
            case 2:
                //Cadastro de produto
                emp.addProduto(this.cadProduto(emp.getContp()));
                System.out.println("Total: " + emp.getContp());
                break;
            case 3:
                //Sair
                break;
        }
    }
}
