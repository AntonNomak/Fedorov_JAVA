package repository;

import models.Car;
import models.User;
import utils.List;

public interface CarsRepository extends CrudRepository<Car> {
    @Override
    default void save(Car model) {

    }

    @Override
    default Car find(int id) {
        return null;
    }

    List<Car> findByOwner(User owner);
}
