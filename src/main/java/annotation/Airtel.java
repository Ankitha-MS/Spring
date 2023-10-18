package annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Airtel implements Sim {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Airtel Sim";
	}
}
