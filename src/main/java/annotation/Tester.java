package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {
public static void main(String[] args) {
	
	ApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
	Mobile mobile=(Mobile) context.getBean("mobile");//in this we have to pass mobile id
	
	System.out.println(mobile);
	
}
}
