package ioc_demoo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Tester {
public static void main(String[] args) {
//	Car car=new Car();
	//initializing the core container
//	ClassPathResource resource=new ClassPathResource("ioc_demoo/MyXml.xml");
//	BeanFactory factory=new XmlBeanFactory(resource);
////	System.out.println(factory.getBean("car"));
//	Car car=(Car) factory.getBean("car");//downcasting
//	Bike bike=(Bike) factory.getBean("bike");//downcasting
//	System.out.println(car);
//	System.out.println(bike);
	
//	ApplicationContext context=new ClassPathXmlApplicationContext("ioc_demoo/MyXml.xml");//this is the new version we hsve to create a object
//	Car car2=(Car) context.getBean("car");
//	System.out.println(car2);
	
//	ApplicationContext context=new ClassPathXmlApplicationContext("ioc_demoo/MyXml.xml");
//	Car car1=(Car) context.getBean("car");
//	Car car2=(Car) context.getBean("car");
//	Car car3=(Car) context.getBean("car");
//	System.out.println(car1);
//	System.out.println(car2);
//	System.out.println(car3);
	
	//setter injection
//	ApplicationContext context=new ClassPathXmlApplicationContext("ioc_demoo/MyXml.xml");
//	Car car=(Car) context.getBean("car");
//	System.out.println(car);
	
	//Using Constructor way
	ApplicationContext context1=new ClassPathXmlApplicationContext("ioc_demoo/MyXml.xml");
	Bike bike=(Bike) context1.getBean("bike");
	System.out.println(bike);
	
}
}
