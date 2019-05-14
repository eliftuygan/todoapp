package toDoApplication.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="mylist")
public class MyList implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="userid")
	@NotNull
	private int userId;
	
	@Column(name="name")
	@NotNull
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Task> tasks = new ArrayList<>();
	
	public MyList() {
		
	}
	

	public MyList(int userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Task> getTasks() {
		return tasks;
	}
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	@Override
	public String toString() {
		return "MyList [id=" + id + ", userId=" + userId + ", name=" + name + "]";
	}

	
	
	

}
