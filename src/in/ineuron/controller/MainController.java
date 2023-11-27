package in.ineuron.controller;
import in.ineuron.dto.CustomerDTO;
import in.ineuron.service.ICustomerMgmntService;
import in.ineuron.vo.CustomerVO;


public class MainController {
	
	private ICustomerMgmntService service;
	
	public MainController(ICustomerMgmntService service) {
		this.service = service;
		System.out.println("MainController:: 1 parameter constructor:: " + service.getClass().getName());
	}

	public String processCustomer(CustomerVO vo) throws Exception {
		
		CustomerDTO customerDTO = new CustomerDTO();
		
		customerDTO.setCustomerName(vo.getCustomerName());
		customerDTO.setCustomerAddress(vo.getCustomerAddress());
		customerDTO.setPamt(Float.parseFloat(vo.getPamt()));
		customerDTO.setRate(Float.parseFloat(vo.getRate()));
		customerDTO.setTime(Float.parseFloat(vo.getTime()));
		
		String result = service.calculateSimpleInterest(customerDTO);
		
		return result;
	}

	@Override
	public String toString() {
		return "MainController [service=" + service + "]";
	}
	
	
}
