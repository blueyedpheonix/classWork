package classes;

public interface Dao<T> {
    void writeOB(T t);
    T readOB();
}
