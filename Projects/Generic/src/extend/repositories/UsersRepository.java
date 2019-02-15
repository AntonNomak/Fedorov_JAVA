package extend.repositories;

import extend.CrudRepository;
import extend.models.User;

public interface UsersRepository extends CrudRepository<User> {

    User findByName(String  name);


}
