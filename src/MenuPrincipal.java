/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luciano_simeao
 */
public class MenuPrincipal extends Menu{
   
    MenuPrincipal(){
        exibicao += "_______Menu_Principal_____\n";
        exibicao += "1 - Cadastrar\n";
        exibicao += "2 - Registrar Compra\n";
        exibicao += "3 - Relatorios\n";
        exibicao += "4 - Salvar Dados\n";
        exibicao += "5 - Carregar Dados\n";
        exibicao += "6 - Sair\n";
    }
    
    @Override 
    public void exibir(){
        super.exibir();
    }
    
    public static void escolha(int opcao){
        switch(opcao){
            case 1:
                //cadastrar
                break;
            case 2:
                break;
            case 3:
                break;
             case 4:
                 break;
             case  5:
                 break;
                 
             case 6: System.exit(1);
               
        }
    }
    
    
}
