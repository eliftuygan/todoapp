package toDoApplication.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import toDoApplication.dao.TaskRepository;
import toDoApplication.model.Task;

@Service
@Transactional
public class TaskService{
	
	@Autowired
	private final TaskRepository task_repo;

	public TaskService(TaskRepository tr) {
		this.task_repo = tr;
	}

	public List<Task> findAll() {
		List<Task> tasks = new ArrayList<>();
		for (Task t : task_repo.findAll()) {
			tasks.add(t);
		}
		return tasks;
	}

	public void save(Task task) {
		task_repo.save(task);
	}

	public void delete(Integer id) {
		task_repo.deleteById(id);
	}
	
	public List<Task> findByListId(Integer id) {
		return task_repo.findByListid(id);
	}

}
