
import Controlador.Empresa;
import Telas.TelaPrincipal;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        
        Empresa emp = new Empresa();
        
        TelaPrincipal telinhaPrincipal = new TelaPrincipal(emp);
        telinhaPrincipal.setVisible(true);
    }

}
