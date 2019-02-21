public interface List<V> {
    void add(V element);
    void addToBegin(V element);
    void addToEnd(V element);
    void remove(int index);
    V get(int index);
    void insert(V element,int index);
    void reverse();
    int getCount();
    boolean contains(V element);
    int indexOf(V element);
    void print();
}
