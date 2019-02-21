public class Main {
    public static void main(String[] args) {
      LinkedList<Integer> linkedList = new LinkedList<>();
      linkedList.add(5);
      linkedList.add(4);
      linkedList.add(3);
      linkedList.add(2);
      linkedList.add(1);
      linkedList.addToEnd(6);
      linkedList.addToBegin(0);
      //linkedList.remove(3);
        System.out.println(linkedList.indexOf(3));
      //linkedList.print();
    }
}
