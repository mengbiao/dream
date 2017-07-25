package action;

import service.HelloService;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{
	
	
	/**
	 * 注入service
	 */
	private HelloService helloService;
	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}



	//action中每次都会执行 execute方法
	@Override
	public String execute() throws Exception {
		
		helloService.add();
		return "ok";
		
	}

	//创建一个stuts.xml核心配置文件,引入dtd约束
	//配置过滤器

}
