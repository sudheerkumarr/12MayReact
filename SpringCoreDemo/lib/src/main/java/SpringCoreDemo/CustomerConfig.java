package SpringCoreDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("SpringCoreDemo")
@PropertySource("classpath:customer.properties")
public class CustomerConfig {

	@Bean
	Customer getCustomer() {
		return new Customer();
	}
}
