package in.ineuron.service;
import in.ineuron.bo.CustomerBO;
import in.ineuron.dao.ICustomerDAO;
import in.ineuron.dto.CustomerDTO;


public class CustomerMgmntServiceImpl implements ICustomerMgmntService {

	private ICustomerDAO dao;
	
	public CustomerMgmntServiceImpl(ICustomerDAO dao) {
		this.dao = dao;
		System.out.println("CustomerMgmntServiceImpl:: 1 param constructor ---> " + dao.getClass().getName());
	}

	@Override
	public String calculateSimpleInterest(CustomerDTO dto) throws Exception {
		
		float intAmount = (dto.getPamt() * dto.getRate() * dto.getTime())/100.0f;
		
		CustomerBO customerBO = new CustomerBO();
		
		customerBO.setCustomerName(dto.getCustomerName());
		customerBO.setCustomerAddress(dto.getCustomerAddress());
		customerBO.setPamt(dto.getPamt());
		customerBO.setRate(dto.getRate());
		customerBO.setTime(dto.getTime());
		customerBO.setIntAmount(intAmount);
		
		int count = dao.save(customerBO);
		
		return count == 0 ? "Customer Registration Failed" : "Customer Registration Successful with an interest amt of :: " + intAmount;
	}

	@Override
	public String toString() {
		return "CustomerMgmntServiceImpl [dao=" + dao + "]";
	}
	
}
