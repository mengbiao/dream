package action;

import service.HelloService;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{
	
	
	/**
	 * ע��service
	 */
	private HelloService helloService;
	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}



	//action��ÿ�ζ���ִ�� execute����
	@Override
	public String execute() throws Exception {
		
		helloService.add();
		return "ok";
		
	}

	//����һ��stuts.xml���������ļ�,����dtdԼ��
	//���ù�����

}
