package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")//it give diff object
//@Lazy(true)//it is lazy
//@Lazy(false)//it is egerly
public class Mobile {
	@Value("Iphone")
	String brand;
	
	@Value("8")
	int ram;
	
	@Value("white")
	String color;

	@Autowired
	@Qualifier("getSim")
	Sim sim;

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", ram=" + ram + ", color=" + color + ", sim=" + sim + "]";
	}
	
	
	
	
}
