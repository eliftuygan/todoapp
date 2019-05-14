package toDoApplication.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import toDoApplication.dao.MyListRepository;
import toDoApplication.dao.UserRepository;
import toDoApplication.model.MyList;
import toDoApplication.model.User;

@Service
@Transactional
public class UserService{
	
	@Autowired
	private final UserRepository user_repo;
	private MyListRepository mylist_repo;
	
	
	
	public UserService(UserRepository ur) {
		this.user_repo = ur;
	}
	
	public User findUserByEmail(String email) {
		return user_repo.findByEmail(email);
	}
	

	public void saveUser(User u) {
		List<MyList> mylists = mylist_repo.findByUserId(u.getId());
			for (MyList m : mylists) {
				u.getMylists().add(m);
			}
		user_repo.save(u);
	}
	
	

}
