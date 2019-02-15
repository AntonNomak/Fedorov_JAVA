package Utils;

import Models.User;

import java.util.Scanner;

public class UserFromConsoleRetriever {//реализация создания и заполнения полей класса User с консоли.
    private Scanner scanner;
    public UserFromConsoleRetriever(){
        this.scanner = new Scanner(System.in);//конструктор класса в котором при создании обьекта данного класса создае-
        //тся новый обьект класса Scanner(для считывания с консоли)
    }

    public User retrieveUser() {//метод в котором реализовано заполнение полей класса User с консоли
        String firsName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String login = scanner.nextLine();
        String password = scanner.nextLine();

        return new User(firsName,lastName,login,password);//возвращает новосозданный обьект с инициализированными полями
    }
}