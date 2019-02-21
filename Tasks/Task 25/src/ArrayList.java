public class ArrayList<T>implements List<T> {

    final int MAX_SIZE = 10;
    T element[];
    int count;
    int current;

public ArrayList(){
    this.element = (T[])new Object[MAX_SIZE];
    this.count = 0;
}



    @Override
    public void add(T element) {
        this.element[count] = element;
        this.count++;
    }

    @Override
    public void addToBegin(T element) {
        this.current = 0;
        for (int i = MAX_SIZE-1 ; i > 0 ; i--) {
            this.element[i] = this.element[i-1];
        }
        this.element[current] = element;
        if (count <= MAX_SIZE){
            count++;
        }

    }

    @Override
    public void addToEnd(T element) {
    if(this.element[count] == null){
        this.element[count] = element;
        count++;
        return;
    }
        this.current = MAX_SIZE -1;
        for (int i = 0 ; i < MAX_SIZE-1 ; i++) {
            this.element[i] = this.element[i+1];
        }
        this.element[current] = element;
    }

    @Override
    public void remove(int index) {
    this.current = 0;
        for (int i = index; i <count-1 ; i++) {
            this.element[i] = this.element[i+1];
        }
        this.element[count-1] = null;
        count--;
    }

    @Override
    public T get(int index) {
        if(index < count && index >= 0){
            return this.element[index];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public void insert(T element, int index) {
        this.current = index;
        for (int i = MAX_SIZE -1; i > index ; i--) {
            this.element[i] = this.element[i-1];
        }
        this.element[current] = element;

    }

    @Override
    public void reverse() {
        T x;
        for (int i = 0; i < MAX_SIZE/2; i++) {
            x = this.element[i];
            this.element[i] = this.element[MAX_SIZE - 1 - i];
            this.element[MAX_SIZE - 1-i] = x;
        }

    }

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public boolean contains(T element) {
        for (int i = 0; i <MAX_SIZE ; i++) {
            if (this.element[i] == element) {
                return true;
            }
        }
        return false;

    }

    @Override
    public int indexOf(T element) {
        for (int i = 0; i < MAX_SIZE ; i++) {
            if(this.element[i] == element){

                return i;
            }
        }
        return -1;
    }

    @Override
    public void print() {
        this.current = MAX_SIZE;
        for (int i = 0; i < current; i++) {
            System.out.println(this.element[i]);
        }
    }
}
