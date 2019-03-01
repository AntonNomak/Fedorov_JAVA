import models.Car;
import models.User;
import repository.CarsRepository;
import repository.CarsRepositoryImpl;
import repository.UsersRepository;
import repository.UsersRepositoryImpl;
import utils.CarsFromConsoleRetriever;
import utils.IdGenerator;
import utils.UserFromConsoleRetriever;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UserFromConsoleRetriever retrieverUsers = new UserFromConsoleRetriever();
        IdGenerator idGeneratorForUser = new IdGenerator("users_id_sequence.txt");
        UsersRepository usersRepository = new UsersRepositoryImpl("User.txt",idGeneratorForUser);
        User user1 = retrieverUsers.retrieveUser();
        usersRepository.save(user1);
        CarsFromConsoleRetriever retrieverCars = new CarsFromConsoleRetriever();
        IdGenerator idGeneratorForCar = new IdGenerator("cars_id_sequence.txt");
        CarsRepository carsRepository = new CarsRepositoryImpl("Car.txt",idGeneratorForCar);
        //Car car = retrieverCars.retrieveCar();
        //carsRepository.save(car);

        carsRepository.findByOwner(user1).print();

        //System.out.println(usersRepository.find(5));




    }
}
