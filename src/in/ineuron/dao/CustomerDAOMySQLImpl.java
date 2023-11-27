package in.ineuron.dao;
import javax.sql.DataSource;
import in.ineuron.bo.CustomerBO;



public class CustomerDAOMySQLImpl implements ICustomerDAO {
	
	private DataSource dataSource;
	
	public CustomerDAOMySQLImpl(DataSource dataSource) {
		this.dataSource = dataSource;
		System.out.println("CustomerDAOMySQLImpl:: 1 param constructor ---> " + dataSource.getClass().getName());
	}

	@Override
	public int save(CustomerBO bo) throws Exception {
		return 0;
	}

	@Override
	public String toString() {
		return "CustomerDAOMySQLImpl [dataSource=" + dataSource + "]";
	}
	
}
