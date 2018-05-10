
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Cliente {
    String cpf;
    String nome;

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Cliente[] getClientes() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        Cliente clientes[] = new Cliente[100];
       
       FileInputStream fis = new FileInputStream("clientes.dat");
       ObjectInputStream ois = new ObjectInputStream(fis);
       
       int cont = ois.readInt();
       for(int i=0; i<cont; i++){
           clientes[i] = (Cliente) ois.readObject();
       }
       ois.close();
       fis.close();
       
       for(int i=0; i<cont; i++){
           clientes[i].getNome();
           System.out.println();
       }
        return clientes;
    }
    
    public void setClientes(Cliente clientes[]) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("clientes.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        int cont = clientes.length;
        
        oos.writeInt(cont);
        for(int i=0; i<cont; i++){
            oos.writeObject(clientes[i]);
        }
    }
    
}
