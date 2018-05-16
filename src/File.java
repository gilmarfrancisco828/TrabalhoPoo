
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class File {

    String fileName;
    Object datas[];

    public File(String fileName) {
        this.fileName = fileName;
        this.datas = null;
    }

    public Object[] read() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(this.fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        if (ois.available() > 0) {
            int cont = ois.readInt();

            this.datas = new Object[cont];

            for (int i = 0; i < cont; i++) {
                datas[i] = (Object) ois.readObject();
            }
        }

        ois.close();
        fis.close();

        return this.datas;
    }

    public void write(Object datas[]) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(this.fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        int cont = datas.length;

        oos.writeInt(cont);
        for (int i = 0; i < cont; i++) {
            oos.writeObject(datas[i]);
        }
    }

    public Object[] getDatas() {
        return this.datas;
    }

    int getLenght() {
        return this.datas.length;
    }

}
