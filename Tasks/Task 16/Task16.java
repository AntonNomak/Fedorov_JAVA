import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList arrayList1 = new ArrayList();
       arrayList1.add(345);
       arrayList1.add(23);
       arrayList1.add(543);
       arrayList1.add(43);
       arrayList1.add(6512);
       arrayList1.add(234);
       arrayList1.add(534);
       arrayList1.add(345);
       arrayList1.add(12);
       arrayList1.add(432);
       arrayList1.addToBegin(5);
       arrayList1.get(scanner.nextInt());
       arrayList1.addToBegin2(5);
       arrayList1.addToEnd(5);
       arrayList1.addToEnd2(5);
       arrayList1.insert(125,5);
       arrayList1.reverse();
       arrayList1.print();
       arrayList1.contains(scanner.nextInt());
       arrayList1.indexOf(scanner.nextInt());
       System.out.println(arrayList1.get(scanner.nextInt()));
    }
}
