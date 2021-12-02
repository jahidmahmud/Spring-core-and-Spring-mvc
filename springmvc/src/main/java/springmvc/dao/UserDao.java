package springmvc.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springmvc.model.User;
@Repository
public class UserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@org.springframework.transaction.annotation.Transactional
	public int save(User user) {
		int id=(int) this.hibernateTemplate.save(user);
		return id;
	}

}
