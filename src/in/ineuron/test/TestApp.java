package in.ineuron.test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.controller.MainController;



public class TestApp {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");	
		System.out.println("***********Container Started*************\n");

		
		MainController controller = factory.getBean("customerController", MainController.class);
		System.out.println(controller);
		
		
		
		System.out.println("\n***********Container Stopper*************");
	}

}
