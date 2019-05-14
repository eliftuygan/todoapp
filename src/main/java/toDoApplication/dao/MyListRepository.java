package toDoApplication.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import toDoApplication.model.MyList;

@Repository
public interface MyListRepository extends CrudRepository<MyList,Integer>{
	
	List<MyList> findByUserId(Integer id);

}
