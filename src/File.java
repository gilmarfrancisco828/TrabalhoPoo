
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

/**
 *
 * @author parafuso828
 */
public class File{
    String fileName;
    Object datas[];
    int max = 500;

    public File(String fileName) {
        this.fileName = fileName;
        this.datas = new Object[this.max];
    }
    
    public Object[] getDatas() throws FileNotFoundException, IOException, ClassNotFoundException
    {  
       FileInputStream fis = new FileInputStream(this.fileName);
       ObjectInputStream ois = new ObjectInputStream(fis);
       
       int cont = ois.readInt();
       
       for(int i=0; i<cont; i++){
           datas[i] = (Object)ois.readObject();
       }
       
       ois.close();
       fis.close();
       
        return this.datas;
    }
    
    public void setObjects(Object datas[]) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(this.fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        int cont = datas.length;
        
        oos.writeInt(cont);
        for(int i=0; i<cont; i++){
            oos.writeObject(datas[i]);
        }
    }
    
}
