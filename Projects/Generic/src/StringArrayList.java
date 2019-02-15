public class StringArrayList {
    private String elements[];
    private int count;

    public StringArrayList(){
        this.elements = new String[10];
        this.count = 0;
    }
    public void add(String value){
        this.elements[count] = value;
        count++;
    }
    public String get(int index){
        if (index > -1 && index < this.elements.length){
            return elements[index];
        }
        else {
            throw new IndexOutOfBoundsException();
        }
    }
}
