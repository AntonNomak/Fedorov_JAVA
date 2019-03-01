/*
В этом классе мы описали процедуру создание нового пользователя с заполнением полей из консоли.
 */

package utils;
import models.User;

import java.util.Scanner;

public class UserFromConsoleRetriever {
    private Scanner scanner;//поле класса работающая с классом Scanner

    public UserFromConsoleRetriever(){//конструктор обьявляющий что при создании обьекта данного класса
        //создается так же новый обьект класса Scanner
        this.scanner = new Scanner(System.in);
    }

    public User retrieveUser(){
        String firstName = scanner.nextLine();//заполенние переменных строками с консоли
        String lastName = scanner.nextLine();
        String login = scanner.nextLine();
        String password = scanner.nextLine();

        return new User(firstName,lastName,login,password);//создание нового обьекта класса User с инициализированными полями

    }

}
