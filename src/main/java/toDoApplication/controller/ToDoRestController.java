package toDoApplication.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import toDoApplication.model.MyList;
import toDoApplication.model.Task;
import toDoApplication.model.User;
import toDoApplication.service.MyListService;
import toDoApplication.service.TaskService;
import toDoApplication.service.UserService;

@RestController
public class ToDoRestController {

	@Autowired
	private TaskService task_service;
	@Autowired
	private MyListService mylist_service;
	@Autowired
	private UserService user_service;

	@GetMapping({ "/", "/index" })
	public ModelAndView index() throws Exception {
		System.out.println("index page");
		return new ModelAndView("index");
	}

	@GetMapping("/login")
	public ModelAndView login() throws Exception {
		System.out.println("login page");
		return new ModelAndView("login");
	}

	@GetMapping("/register")
	public ModelAndView register() throws Exception {
		System.out.println("register page");
		return new ModelAndView("register");
	}

	@GetMapping("/forgot")
	public ModelAndView forgot() throws Exception {
		System.out.println("forgot password page");
		return new ModelAndView("forgot");
	}

	@GetMapping("/all-tasks")
	public String allTasks() throws Exception {
		System.out.println("all tasks");
		return task_service.findAll().toString();
	}

	@GetMapping("/all-lists")
	public String allLists() throws Exception {
		return mylist_service.findAll().toString();
	}

	@GetMapping("/save-task")
	public String saveTask(@RequestParam int listid, @RequestParam String name, @RequestParam String description,
			@RequestParam String status, @RequestParam Date deadline) throws Exception {
		Task task = new Task(listid, name, description, status, deadline, new Date());
		task_service.save(task);
		System.out.println("Task Saved.");
		return "Task Saved.";
	}

	@GetMapping("/save-list")
	public String saveList(@RequestParam int userid, @RequestParam String name) throws Exception {
		MyList mylist = new MyList(userid, name);
		mylist_service.save(mylist);
		System.out.println("List Saved.");
		return "List Saved.";
	}

	@GetMapping("/save-user")
	public String saveUser(@RequestParam String name, @RequestParam String surname, @RequestParam String email,
			@RequestParam String password) throws Exception {
		User user = new User(name, surname, email, password);
		User userexist = user_service.findUserByEmail(user.getEmail());
		
		if(!user.equals(userexist)) {
			user_service.saveUser(user);
			System.out.println("User Saved.");
		}
		return "User Saved.";
	}

	@GetMapping("/delete-task")
	public String deleteTask(@RequestParam int id) throws Exception {
		task_service.delete(id);
		System.out.println("Task Deleted.");
		return "Task Deleted.";
	}

	@GetMapping("/delete-list")
	public String deleteList(@RequestParam int id) throws Exception {
		mylist_service.delete(id);
		System.out.println("List Deleted.");
		return "List Deleted.";
	}


}
