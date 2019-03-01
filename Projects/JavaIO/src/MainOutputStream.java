import java.io.FileOutputStream;
import java.io.OutputStream;

public class MainOutputStream {

    public static void main(String[] args)throws Exception {
        OutputStream output = new FileOutputStream("output.txt");//output - создание файла
        output.write('B');//добавление символа в файл
        output.write('Ф');//запись по байтам
    }
}
