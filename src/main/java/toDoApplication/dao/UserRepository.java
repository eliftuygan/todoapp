package toDoApplication.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import toDoApplication.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer>{

	User findByEmail(String email);
}
