package toDoApplication.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import toDoApplication.dao.MyListRepository;
import toDoApplication.dao.TaskRepository;
import toDoApplication.model.MyList;
import toDoApplication.model.Task;

@Service
@Transactional
public class MyListService{
	
	@Autowired
	private final MyListRepository mylist_repo;
	private  TaskRepository task_repo;
	
	public MyListService(MyListRepository mr) {
		this.mylist_repo = mr;
	}
	
	public List<MyList> findAll(){
		List<MyList> mylists = new ArrayList<>();
		for(MyList l : mylist_repo.findAll()) {
			mylists.add(l);
		}
		return mylists;
	}
	
	public void save(MyList mylist) {
		List<Task> tasks = task_repo.findByListid(mylist.getId());
		for (Task t : tasks) {
			mylist.getTasks().add(t);
			}
		mylist_repo.save(mylist);
	}

	
	public void delete(Integer id) {
		mylist_repo.deleteById(id);
	}
	
	public List<MyList> findByUserId(Integer id) {
		return mylist_repo.findByUserId(id);
	}
	

}
