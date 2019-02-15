public class Main {
    public static void main(String[] args) {
        GenericArrayList<Integer> integerGenericArrayList = new GenericArrayList<>();
        integerGenericArrayList.add(26);//так как мы указади что массив у нас будет <Integer - то  и класть в него мы можем
        integerGenericArrayList.add(27);//только Integer,мы  избежим ошибки как могла бы быть у ObjectsArrayList где мы могли
        integerGenericArrayList.add(28);//любой тип(так как у нас есть единый тип для всех типов -  Object)

        int integerValue = integerGenericArrayList.get(1);//и получить мы можем его без явных преобразований как в
                                                          //ObjectsArrayList
        GenericArrayList<String> stringGenericArrayList = new GenericArrayList<>();
        stringGenericArrayList.add("Привет");
        stringGenericArrayList.add("Антон");
        stringGenericArrayList.add("Как дела");
        String hello  = stringGenericArrayList.get(0);

        System.out.println(integerValue+" "+hello );

    }
}
