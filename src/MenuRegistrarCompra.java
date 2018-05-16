
public class MenuRegistrarCompra extends Menu {

    MenuRegistrarCompra() {
        exibicao += "Registrar Compra\n";
    }

    @Override
    public void exibir() {
        super.exibir();
    }

    public Venda cadCompra(Empresa emp) {
        
        //Ler CPF do cliente ao qual a venda será realizada
        System.out.println("Entre com o CPF do cliente: ");
        String cpf = input.nextLine();

        Venda venda = new Venda();
        //Setta o cliente para a venda
        venda.setCliente(Cliente.buscarCpf(emp.getClientes(), cpf));

        //Adiciona Itens a venda
        for (int i = 0; i < venda.getNi(); i++) {
            //Encontra o produto a ser adicionado
            System.out.println("Entre com o código do produto: ");
            String codigo = input.nextLine();

            //Seleciona quantos produtos do tipo selecionado serão comprados
            System.out.println("Entre com quantos produtos deseja comprar: ");
            float quantidade = (float) input.nextInt();

            //Instancia o Item
            Item item = new Item(emp.getContv(), Produto.buscarCodigo(emp.getProdutos(), codigo), quantidade);
            System.out.println("Total: " + item.calcularTotal());

            //Adiciona o item criado a venda
            venda.addItem(item);
            
            //Verifica se o usuário quer continuar a adicionar clientes a venda
            input.nextLine();
            System.out.println("Continuar adicionando produtos (y, n)?");
            if (input.nextLine().equals("n")) {
                break;
            }
        }

        //Escolher tipo de Pagamento
        switch (this.escolhePagamente()) {
            case 1:
                venda.setTipoPgto(this.cadDinheiro());
                break;
            case 2:
                venda.setTipoPgto(this.cadCheque());
                break;
            case 3:
                venda.setTipoPgto(this.cadCartao());
                break;
            default:
                throw new AssertionError();
        }

        //Imprime o total da venda
        System.out.println("Total R$: " + venda.calcularTotal());

        //Pergunta se o cliente deseja continuar
        System.out.println("Finalizar compra (y, n)?");
        if (input.nextLine().equals("n")) {
            return null;
        } else {
            System.out.println("Compra finalizada com sucesso!");
            return venda;
        }

    }

    private int escolhePagamente() {
        this.exibicao = "1 - Dinheiro\n2 - Cheque\n3 - Cartão";
        this.exibir();
        return this.opcao();
    }

    private Dinheiro cadDinheiro() {
        Dinheiro p = new Dinheiro();
        return p;
    }

    private Cheque cadCheque() {
        Cheque p = new Cheque();
        input.nextLine();
        System.out.println("Entre com o nome do Emissor: ");
        p.setNomeEmissor(input.nextLine());
        System.out.println("Entre com o númeor do cheque: ");
        p.setNumeroCheque(input.nextLine());
        return p;
    }

    private Cartao cadCartao() {
        Cartao p = new Cartao();
        input.nextLine();
        System.out.println("Entre com o nome: ");
        p.setNome(input.nextLine());
        System.out.println("Entre com o número: ");
        p.setNumero(input.nextLine());
        return p;
    }
}
