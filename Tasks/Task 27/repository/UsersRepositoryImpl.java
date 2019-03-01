/*
Создание класса который наследуется от интерфейса который работает с необходимым репозиторием.
Класс представляющий реализацию репозитория - предоставляет доступ к данным через текстовый файл.
 */

package repository;

import models.User;
import utils.IdGenerator;

import java.io.*;

public class UsersRepositoryImpl implements UsersRepository {
    private String fileName;//поле для названия файла
    private IdGenerator idGenerator;//поле для работы с классом IdGenerator(в котором у нас прописана логика
    //создания ID

    public UsersRepositoryImpl(String fileName, IdGenerator idGenerator) {
        this.fileName = fileName;//конструктор,инициализирует поле 'название файла"
        this.idGenerator = idGenerator;
    }


    @Override
    public void save(User model) {//переопределение метода
        try {//обработка на непроверяемые ошибки
            FileWriter fileWriter = new FileWriter(fileName, true);//создание нового обьекта записи,который создает
            //или работает с необходимым нам файлом(в параметрах мы передаем ему название
            //В конце написали true - для того чтобы не стиралась предыдущая запись
            BufferedWriter writer = new BufferedWriter(fileWriter);//создание нового обьекта буффера,
            //который работает с с обьектом записи
            int id = idGenerator.generateId();//переменная в которую мы кладем значение полученное из класса IdGenerator.
            //метод generateId(получится число
            model.setId(id);//начначенем полю id класса User значение

            writer.write(model.getId() + " " + model.getFirstName() + " " + model.getLastName()
                    );//вызов обьекта записи,метод который записывает в файл необходимые данные
            //в данном случае это поля класса User(мы в методе прописали что он работает с обьектами класса User
            writer.newLine();//переход на следующую строчку.
            writer.close();//ОБЯЗАТЕЛЬНОЕ ЗАКРЫТИЕ !!!
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public User find(int id) {//в параметры указываем необходимый ID
        try {
            FileReader fileReader = new FileReader(fileName);//обьект считыватель
            BufferedReader reader = new BufferedReader(fileReader);//буффер считыватель
            String currentline = reader.readLine();//текущая линия
            while (currentline != null) {//пока есть строка
                String userData[] = currentline.split(" ");//метод split - разбивает строку на массив строк
                //каждый элемент массива это строка и разделяет ее символ указанный в параметре метода
                int currentId = Integer.parseInt(userData[0]);//мы знаем что IDшник это первый символ после него идет пробел
                //и преобразуем этот символ к int
                if (currentId == id) {//если IDшник равен нужному то
                    User user = new User(userData[1], userData[2]);//создаем нового пользователя
                    //и указываем ему в конструктор все данные из массива нужной нам строки.
                    user.setId(currentId);//задаем этому пользователю IDшник
                    return user;//возвращаем данного пользователя
                }
                currentline = reader.readLine();
            }
            return null;
        }
        catch (IOException e) {
            throw  new IllegalArgumentException(e);
        }
    }
}
