package service;

import org.springframework.transaction.annotation.Transactional;

import dao.HelloDao;

@Transactional
public class HelloService {

	//注入dao的对象
		private HelloDao helloDao;
		public void setHelloDao(HelloDao helloDao) {
			this.helloDao = helloDao;
		}
		public void add() {
			System.out.println("----->>service");
			helloDao.add();
			
			
		}
	
}
