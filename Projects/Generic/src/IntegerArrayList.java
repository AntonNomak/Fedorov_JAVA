public class IntegerArrayList {
    private int elements[];
    private int count;

    public IntegerArrayList(){
        this.elements = new int[10];
        this.count = 0;
    }
    public void add(int value){
        this.elements[count] = value;
        count++;
    }
    public int get(int index){
        if (index > -1 && index < this.elements.length){
            return elements[index];
        }
        else {
            throw new IndexOutOfBoundsException();
        }
    }
}
