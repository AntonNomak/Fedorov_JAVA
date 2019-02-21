package extended.Repository;

import extended.CrudRepository;
import extended.Models.User;

public interface UserRepository extends CrudRepository<User>  {
    User findByName(String name);

    @Override
    default void save(User entity) {

    }

    @Override
    default void update(User entity) {

    }

    @Override
    default void delete(User entity) {

    }

    @Override
    default User find(Long id) {
        return null;
    }
}
