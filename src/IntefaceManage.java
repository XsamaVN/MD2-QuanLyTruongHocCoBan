import java.io.IOException;

public interface IntefaceManage<T> {
    void addNew(T t) throws IOException;
    void edit(int a, T t);
    void delete(int t);
    void showList() throws IOException;
}
