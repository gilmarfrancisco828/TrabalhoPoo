/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luciano_simeao
 */
import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    static boolean isDigit(String str){
        if(str.equals("1") || str.equals("2") || str.equals("3") || str.equals("4") || str.equals("5") || 
                str.equals("6"))
            return true;
        return false;
    }
    
    void menuCadastro(){
        String menu ="";
        int op;
        String opcao;
        menu += "______Cadastro______\n";
        menu += "1 - Cliente\n";
        menu += "2 - Produto\n";
        menu += "3 - Sair\n";
        
        while(true){
            System.out.println(menu);
            opcao = input.nextLine();
            if(!isDigit(opcao)){
                System.out.println("Erro nos dados de entrada!");
                System.exit(1);
                
            }
            else{
                op = Integer.parseInt(opcao);
                
                switch(op){
                    
                    case 1:
                        Cliente c = new Cliente();
                        break;
                    case 2:
                        System.out.println("1 - Produto Nacional");
                        System.out.println("2 - Produto Importado");
                        int opc = input.nextInt();
                        if(opc == 1){
                            ProdutoNacional p = new ProdutoNacional();
                            
                            System.out.print("Código  do produto: ");
                            p.setCodigo(input.nextLine());
                            
                            System.out.print("Descrição do Produto: ");
                            p.setDescricao(input.nextLine());
                            
                            System.out.print("Valor do Produto: ");
                            p.setValor(input.nextFloat());
                            
                            
                        }
                        else if(opc == 2){
                            ProdutoImportado p;
                            String code;
                            String description;
                            float value;
                            
                            
                            System.out.print("Código  do produto: ");
                            code = input.nextLine();
                            
                            System.out.print("Descrição do Produto: ");
                            description = input.nextLine();
                            
                            System.out.print("Valor do Produto: ");
                            value = input.nextFloat();
                            
                            p = new ProdutoImportado(code,description,value);
                            
                            
                            
                            
                        }
                        
                        break;
                    
                    
                    case 3: return;
                    
                }
            }
        }
                
              
                
    }
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
        String menu = "";
        int opcao = 0;
        String escolha;
        
        menu += "_______Menu_Principal_____\n";
        menu += "1 - Cadastrar\n";
        menu += "2 - Registrar Compra\n";
        menu += "3 - Relatorios\n";
        menu += "4 - Salvar Dados\n";
        menu += "5 - Carregar Dados\n";
        menu += "6 - Sair\n";
             
        
        while(true){
               System.out.println(menu);
               System.out.println("Digite a opcao associada a escolha: ");
               escolha = input.nextLine();
               
               if(!isDigit(escolha)){
                   System.out.println("Erro na entrada de dados!");
                   System.exit(1);
               }
               else{
                   opcao = Integer.parseInt(escolha);
                   switch(opcao){
                       case 1:
                           menuCadastro();
//menu cadastrar
                           break;
                       case 2:
                           //registrar compra
                           break;
                       case 3:
                           //relatorios
                           break;
                       case 4:
                           //salvar dados
                           break;
                       case 5:
                           //carregar dados
                           break;
                       case 6:System.exit(0);                         
                   }
               }      
         }
        
        
        
    }
    
}
