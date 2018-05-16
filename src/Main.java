
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {

        Empresa emp = new Empresa();

        MenuPrincipal main_menu = new MenuPrincipal();

        while (true) {
            main_menu.exibir();
            switch (main_menu.opcao()) {
                case 1:
                    //menu cadastrar
                    MenuCadastro cadCliente = new MenuCadastro();
                    cadCliente.exibir();
                    cadCliente.escolha(emp);
                    break;
                case 2:
                    //registrar compra
                    MenuRegistrarCompra compra = new MenuRegistrarCompra();
                    compra.exibir();
                    compra.cadCompra(emp);
                    break;
                case 3:
                    //relatorios
                    MenuRelatorio relatorio = new MenuRelatorio();
                    relatorio.exibir();
                    relatorio.escolha(emp);
                    break;
                case 4:
                    //salvar dados
                    Empresa.salvar(emp);
                    System.out.println("Dados salvos com sucesso!");
                    break;
                case 5:
                    //carregar dados
                    System.out.println("Dados carregados com sucesso!");
                    Empresa.carregar(emp);
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }

}
