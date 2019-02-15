public class LinkedList {
    private Node top;//Переменная отвечающая за начало  связного списка
    private Node tail;//Переменная отвечающая за конец связного списка
    private int count;//переменная отвечающая за  количество и в теории отвечающая за индекс
    private Node x;

    public LinkedList() {
        this.top = null;
        this.count = 0;
    }

    public void addToBegin(int value) {
        Node node = new Node(value);//При запуске метода мы создаем новый обьект класса Node - вызывается  конструктор
        //Node и в поле value класса Node кладем  значение указанное в методе.

        if (top == null) {//Запускается  проверка если переменная отвечающая за начало - null(то есть список пустой)
            tail = node;//то в конец списка кладем ново - созданный обьект.То есть у нас и в начале и в конце один
            //обьект
        }

        node.setNext(top);//в поле next класса  Node - кладем указание на top(ссылку на элемент который сейчас в
        //в top
        count++;//увеличиваем кол-во
        top = node;//в топ кладем ссылку на новосозданный обьект
    }

    public void addToEnd(int value) {
        Node node = new Node(value);

        if (top == null) { //если top = null(список пустой)
            top = node;//то в начало кладем созданный обьект
            tail = top;//и в конец тоже кладем новосозданный обьект
        } else {
            tail.setNext(node);//В поле next класса Node кладем ссылку на новосозданный обьект
            tail = node;//и в конец связного списка (tail)кладем новосозданный обьект
        }
        count++;//увеличиваем  значение

    }

    public void search(int value) {
        x = top;
        for (int i = 0; i <= count; i++) {
            if (x.getValue() == value) {
                System.out.println("Элемент найден под индексом" + " " + i);
                return;
            } else {
                x = x.getNext();
            }
        }
        System.out.println("Элемента в списке нет");

    }

    public void print() {
        x = top;
        for (int i = 0; i < count; i++) {
            System.out.println(x.getValue());
            x = x.getNext();
        }
    }
}
