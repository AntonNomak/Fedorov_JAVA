
/*
Класс описывающий  генерацию ID
 */

package utils;


import java.io.*;

public class IdGenerator {
    private int id;//поле отвечающее за id
    private String idSequenceFileName;//поле отвечающее за имя файла в который мы записываем наше последнее id

    public IdGenerator(String idSequenceFileName){//коструктор принимащий на вход имя файла в котором записаны IDшники
        this.idSequenceFileName = idSequenceFileName;
        try {
            FileReader fileReader = new FileReader(idSequenceFileName);//создание считывателя
            BufferedReader reader = new BufferedReader(fileReader);//создание буферного считывателя
            String lastGeneratedIdAsString = reader.readLine();//создание переменной в которую кладем полученное значение
            this.id = Integer.parseInt(lastGeneratedIdAsString);//парсит строку к числу и присваивает полю ID -
            //текущий IDшник записанный в файле
        }
        catch (IOException e){
            throw new IllegalArgumentException(e);
        }


    }
    public int generateId(){
        try {
            FileWriter fileWriter = new FileWriter(idSequenceFileName);//создание записи
            BufferedWriter writer = new BufferedWriter(fileWriter);//буфферной записи
            int result = this.id;//переменная в которую записывается текущий IDшник
            this.id++;//увеличиваем IDшник
            writer.write(String.valueOf(this.id));//записываем увеличенный IDшник в файл(предыдущий стирается)
            writer.close();//закрываем
            return result;//возвращаем полученный IDшник
        }
        catch (IOException e){
            throw new IllegalArgumentException(e);
        }
    }
}
