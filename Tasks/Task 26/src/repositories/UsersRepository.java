package repositories;

import Models.User;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsersRepository implements CrudRepository<User> {
    private String fileName;
    public UsersRepository(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void save(User model) {

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write(model.getFirstName() + " " + model.getLastName() + " " + model.getLogin() + " " + model.getPassword() + " " +
                    " ");
        }catch (IOException e){
            throw new IllegalArgumentException(e);
        }
    }
}
