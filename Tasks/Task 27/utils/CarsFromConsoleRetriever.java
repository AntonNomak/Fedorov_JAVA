package utils;

import models.Car;

import java.util.Scanner;

public class CarsFromConsoleRetriever {
    private Scanner scanner;

    public CarsFromConsoleRetriever(){
        this.scanner = new Scanner(System.in);
    }

    public Car retrieveCar(){
        String model = scanner.nextLine();
        String number = scanner.nextLine();
        String idOwnerString = scanner.nextLine();
        int idOwner = Integer.parseInt(idOwnerString);
        return new Car(model,number,idOwner);
    }
}
