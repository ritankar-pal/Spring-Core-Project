package in.ineuron.service;
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
		return null;
	}

	@Override
	public String toString() {
		return "CustomerMgmntServiceImpl [dao=" + dao + "]";
	}
	
}
