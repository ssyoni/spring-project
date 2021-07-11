package noums.study.pizzahouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class PizzahouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzahouseApplication.class, args);
	}

}
