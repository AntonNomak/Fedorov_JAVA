package repository;

import itils.ArrayList;
import models.Car;
import models.User;
import utils.IdGenerator;
import utils.List;

import java.io.*;

public class CarsRepositoryImpl implements CarsRepository {

    private String fileName;
    private IdGenerator idGenerator;

    public CarsRepositoryImpl(String fileName, IdGenerator idGenerator) {
        this.fileName = fileName;
        this.idGenerator = idGenerator;
    }



    @Override
    public void save(Car model) {
        try {
            FileWriter fileWriter = new FileWriter(fileName,true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            int id = idGenerator.generateId();
            model.setId(id);
            writer.write(model.getId()+" "+model.getModel()+" "+model.getNumber()+" " + model.getIdOwner());
            writer.newLine();
            writer.close();
        }
        catch (IOException e){
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public List<Car> findByOwner(User owner) {

        List<Car> list = new ArrayList<Car>();
        int id = owner.getId();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);
            String currentLine = reader.readLine();
            while (currentLine != null){
                String carData[] = currentLine.split(" ");
                int idOwner = Integer.parseInt(carData[3]);
                if(idOwner == id){
                    list.add(new Car(carData[1],carData[2],id));
                    list.get(0).setId(Integer.parseInt(carData[0]));
                }
                currentLine = reader.readLine();
            }

        }
        catch (IOException e){
            throw new IllegalArgumentException(e);
        }
        return list;
        }

    }



