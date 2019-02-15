import Models.User;
import Utils.UserFromConsoleRetriever;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserFromConsoleRetriever retriever = new UserFromConsoleRetriever();//создание обьекта
        User user = retriever.retrieveUser();//создание переменной класса "user" которая ссылается на переменную
        //retriever класса UserFromConsoleRetriever,которая в свою очередь вызывает метод в котором  реализованно
        //создание нового обьекта класса User с инициализированными полями.
    }
}
