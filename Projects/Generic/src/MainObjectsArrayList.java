public class MainObjectsArrayList {
    public static void main(String[] args) {
        ObjectsArrayList  integerList = new ObjectsArrayList();

        integerList.add(24);
        //integerList.add("Привет"); - не стоит в Integer класть String
        //System.out.println(integerList.get(0)); Делать так не надо,в спиской integerList - необходимо класть только
        //System.out.println(integerList.get(1));int т.к. в  случае работы со списком будут возникать ошибки
        ObjectsArrayList stringList = new ObjectsArrayList();
        stringList.add("Привет");
        stringList.add("Антон");
        stringList.add("Как дела");
        int valueFromIntegerList = (int)integerList.get(0);//Перед методом мы указываем на явное преобразование
        String hello = (String) stringList.get(0);//из Integer - int из String - String
        System.out.println(valueFromIntegerList + "\n" + hello);

    }
}
