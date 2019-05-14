package toDoApplication.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import toDoApplication.model.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task,Integer>{

	List<Task> findByListid(Integer i);
}
