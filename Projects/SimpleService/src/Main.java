import models.User;
import repository.UsersRepository;
import repository.UsersRepositoryImpl;
import utils.IdGenerator;
import utils.UserFromConsoleRetriever;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UserFromConsoleRetriever retriever = new UserFromConsoleRetriever();
        IdGenerator idGenerator = new IdGenerator("users_id_sequence.txt");
        UsersRepository usersRepository = new UsersRepositoryImpl("input.txt",idGenerator);
      //  User user = retriever.retrieveUser();
        //usersRepository.save(user);
        System.out.println(usersRepository.find(5));




    }
}
