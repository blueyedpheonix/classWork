package classes;

import java.io.*;

public class DaoIO<T> implements Dao<T> {
    private File file;

    public DaoIO(File file) {
        this.file = file;
    }

    @Override
    public void writeOB(T t) {
        try (ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream(file))) {
            write.writeObject(t);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    @Override
    public T readOB() {
        T t = null;
        try(ObjectInputStream read = new ObjectInputStream(new FileInputStream(file))){
            t = (T) read.readObject();
        }catch (IOException | ClassNotFoundException e){
            e.getStackTrace();
        }
     return t;
    }
}
