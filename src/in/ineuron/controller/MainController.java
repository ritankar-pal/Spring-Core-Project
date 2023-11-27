package in.ineuron.controller;
import in.ineuron.service.ICustomerMgmntService;
import in.ineuron.vo.CustomerVO;


public class MainController {
	
	private ICustomerMgmntService service;
	
	public MainController(ICustomerMgmntService service) {
		this.service = service;
		System.out.println("MainController:: 1 parameter constructor:: " + service.getClass().getName());
	}

	public String processCustomer(CustomerVO vo) throws Exception {
		return "";
	}

	@Override
	public String toString() {
		return "MainController [service=" + service + "]";
	}
	
	
}
