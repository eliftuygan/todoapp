package toDoApplication.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity(name="task")
public class Task implements  Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="listid")
	@NotNull
	private int listid;
	
	@Column(name="name")
	@NotNull
	private String name;
	
	@Column(name="description")
	@NotNull
	private String description;
	
	@Column(name="status")
	@NotNull
	private String status;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="deadline")
	@NotNull
	private Date deadline;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="createdate")
	@NotNull
	private Date createDate;
	
	public Task() {
	}
	
	public Task(int todoListId, String name, String description, String status, Date deadline, Date createDate) {
		super();
		this.listid = todoListId;
		this.name = name;
		this.description = description;
		this.status = status;
		this.deadline = deadline;
		this.createDate = createDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTodoListId() {
		return listid;
	}
	public void setTodoListId(int todoListId) {
		this.listid = todoListId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String isStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "ToDoItem [id=" + id + ", todoListId=" + listid + ", name=" + name + ", description=" + description
				+ ", status=" + status + ", deadline=" + deadline + ", createDate=" + createDate + "]";
	}
	
	
	
	
}
