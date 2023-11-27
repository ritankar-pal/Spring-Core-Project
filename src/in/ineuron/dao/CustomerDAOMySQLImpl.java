package in.ineuron.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;
import in.ineuron.bo.CustomerBO;



public class CustomerDAOMySQLImpl implements ICustomerDAO {
	
	private DataSource dataSource;
	private static final String CUSTOMER_INSERT_QUERY = "insert into customer(cname, caddress, pamt, rate, time, intrAmt) values(?,?,?,?,?,?)";
	
	public CustomerDAOMySQLImpl(DataSource dataSource) {
		this.dataSource = dataSource;
		System.out.println("CustomerDAOMySQLImpl:: 1 param constructor ---> " + dataSource.getClass().getName());
	}

	@Override
	public int save(CustomerBO bo) throws Exception {
		
		int count = 0;
		
		try(Connection connection = dataSource.getConnection(); PreparedStatement psmt = connection.prepareStatement(CUSTOMER_INSERT_QUERY)){
			
			psmt.setString(1, bo.getCustomerName());
			psmt.setString(2, bo.getCustomerAddress());
			psmt.setFloat(3, bo.getPamt());
			psmt.setFloat(4, bo.getRate());
			psmt.setFloat(5, bo.getTime());
			psmt.setFloat(6, bo.getIntAmount());
			
			count = psmt.executeUpdate();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}

	@Override
	public String toString() {
		return "CustomerDAOMySQLImpl [dataSource=" + dataSource + "]";
	}
	
}
