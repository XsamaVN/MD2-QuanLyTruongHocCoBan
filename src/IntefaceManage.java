public interface IntefaceManage<T> {
    void addNew(T t);
    void edit(int a, T t);
    void delete(int t);
    void showList();
}
