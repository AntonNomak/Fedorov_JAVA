/*
Создание интерфейса конкретно заточенного под репозиторий User
 */

package repository;

import models.User;

public interface UsersRepository extends CrudRepository<User> {


    @Override
    default void save(User model) {

    }

    @Override
    default User find(int id) {
        return null;
    }
}
