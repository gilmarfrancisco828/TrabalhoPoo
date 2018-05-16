
import java.util.Scanner;

public abstract class Menu {

    protected String exibicao;
    private String op;
    private String[] str;
    protected int opcao;
    protected Scanner input;

    Menu() {
        input = new Scanner(System.in);
    }

    public void exibir() {
        System.out.println(exibicao);
    }

    public int opcao() {
        System.out.println("Opção: ");
        return input.nextInt();
    }

}
