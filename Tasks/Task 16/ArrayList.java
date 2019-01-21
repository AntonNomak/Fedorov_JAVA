public class ArrayList {

    final int MAX_SIZE = 10;
    int element[];
    int count;

    public ArrayList() {
        this.element = new int[MAX_SIZE];
        this.count = 0;
    }
    void add(int element) {
        this.element[count] = element;
        this.count++;
    }
    void addToBegin(int element){
        this.count = 0;
        this.element[count] = element;
    }
    void  addToBegin2(int element){
        this.count = 0;
        for (int i = MAX_SIZE ; i > 0 ; i--) {
            this.element[i] = this.element[i-1];
        }
        this.element[count] = element;
    }
    void addToEnd(int element){
        this.count = MAX_SIZE -1;
        this.element[count] = element;
    }
    void addToEnd2(int element){
        this.count = MAX_SIZE -1;
        for (int i = 0 ; i < MAX_SIZE-1 ; i++) {
            this.element[i] = this.element[i+1];
        }
        this.element[count] = element;
    }
    int get(int get){
        this.count = MAX_SIZE;
        for (int i = 0; i < count; i++) {
            if (get == i){
                return this.element[i];
            }
        }
        return -1;
    }

    void insert(int element,int index){
        this.count = index;
        for (int i = MAX_SIZE -1; i > index ; i--) {
            this.element[i] = this.element[i-1];
        }
        this.element[count] = element;
    }

    void reverse(){
        int x;
        for (int i = 0; i < MAX_SIZE/2; i++) {
            x = this.element[i];
            this.element[i] = this.element[MAX_SIZE - 1 - i];
            this.element[MAX_SIZE - 1-i] = x;
        }
    }


    void sort(){
        int x;
        for (int i = 0; i <MAX_SIZE ; i++) {
            for (int j = 0; j <MAX_SIZE ; j++) {
                if(this.element[j] > this.element[i]){
                    x = this.element [j];
                    this.element[j] = this.element[i];
                    this.element[i] = x;
                }
            }
        }
    }

    boolean contains(int element){
        for (int i = 0; i <MAX_SIZE ; i++) {
            if (this.element[i] == element) {
                System.out.println(true);
                return true;
            }
        }
        return false;

    }
    int indexOf(int element){
        for (int i = 0; i < MAX_SIZE ; i++) {
            if(this.element[i] == element){

                return i;
            }
        }
        return -1;
    }


    void print() {
        this.count = MAX_SIZE;
        for (int i = 0; i < count; i++) {
            System.out.println(this.element[i]);
        }
    }
}
