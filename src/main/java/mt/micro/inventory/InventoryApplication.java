package mt.micro.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class InventoryApplication {

	private final static Logger log = LoggerFactory.getLogger("InventoryApplication");
	
	public static void main(String[] args) {
	    log.trace("Entering InventoryApplication()");
		
		SpringApplication.run(InventoryApplication.class, args);
	}
}
