package dao;

import org.springframework.orm.hibernate4.HibernateTemplate;

import entity.User;

public class HelloDaoImp implements HelloDao{

	//得到hibernateTemplate对象
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	@Override
	public void add() {
//		HibernateTemplate hibernateTemplate=new HibernateTemplate(sessionFactory)
		User user=new User();
		user.setUserName("rose");
		user.setAdress("保定");
		hibernateTemplate.save(user);
	}

	
}
