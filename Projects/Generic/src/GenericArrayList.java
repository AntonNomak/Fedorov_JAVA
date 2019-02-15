/*
Первая T  - параметр типа,то есть мы указали что список может работать с неизвестным типом T.Вторая Т  указывает что
массив такого же типа как указанно в первой Т.Третья Т - так же указывает на тот тип который указан в первой Т.То что
указали в первой Т попадет и во вторую и в третью
 */

public class GenericArrayList<T>implements GenericList<T> {
    private T elements[];//T - означает что неизвестно массив каких элементов будет создан,но известно что они будут
    private int count;//ОДНОГО типа,а именно типа Т

    public GenericArrayList(){
        this.elements = (T[])new Object[10];//этой конструкцией указываем что необходимо преобразовать массив к типу T
        this.count = 0;
    }
    public void add(T value){
        this.elements[count] = value;
        count++;
    }
    public T get(int index){
        if (index > -1 && index < this.elements.length){
            return elements[index];
        }
        else {
            throw new IndexOutOfBoundsException();
        }
    }
}
