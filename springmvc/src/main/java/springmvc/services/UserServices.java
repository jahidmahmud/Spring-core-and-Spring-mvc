package springmvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDao;
import springmvc.model.User;
@Service
public class UserServices {
	@Autowired
	private UserDao dao;
	
	public int CreateUser(User user) {
		return this.dao.save(user);
	}

}
