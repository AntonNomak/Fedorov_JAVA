public class ObjectsArrayList {
    private Object elements[];
    private int count;

    public ObjectsArrayList(){
        this.elements = new Object[10];
        this.count = 0;
    }
    public void add(Object value){
        this.elements[count] = value;
        count++;
    }
    public Object get(int index){
        if (index > -1 && index < this.elements.length){
            return elements[index];
        }
        else {
            throw new IndexOutOfBoundsException();
        }
    }
}
