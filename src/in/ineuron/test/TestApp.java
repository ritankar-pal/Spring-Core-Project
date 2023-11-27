package in.ineuron.test;
import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.controller.MainController;
import in.ineuron.vo.CustomerVO;



public class TestApp {

	public static void main(String[] args) throws Exception {
		
		//Reading the inputs::
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Customer Name:: ");
		String customerName = scan.next();
		
		System.out.print("Enter the Customer Address:: ");
		String customerAddress = scan.next();
		
		System.out.print("Enter the Principal Amount:: ");
		String pamt = scan.next();
		
		System.out.print("Enter the Rate of Interest:: ");
		String rate = scan.next();
		
		System.out.print("Enter the Time:: ");
		String time = scan.next();
		
		//Making an object of CustomerVO and setting the inputs::
		CustomerVO customerVO = new CustomerVO();
		customerVO.setCustomerName(customerName);
		customerVO.setCustomerAddress(customerAddress);
		customerVO.setPamt(pamt);
		customerVO.setRate(rate);
		customerVO.setTime(time);
		
		
		//Starting the IOC Container::
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");	
		System.out.println("***********Container Started*************\n");

		
		MainController controller = factory.getBean("customerController", MainController.class); //Created an Object of MainController
		
		try {
			String result = controller.processCustomer(customerVO);
			System.out.println(result);
		}
		catch(Exception e) {
			System.out.println("Internal Problem...Please Try Again!");
		}
		
		System.out.println("\n***********Container Stopper*************");
		scan.close();
	}

}
