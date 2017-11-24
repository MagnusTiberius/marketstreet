package mt.micro.inventory;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.regions.Regions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DynamoDbClient {

	private final Logger log = LoggerFactory.getLogger(getClass());

	
	public DynamoDbClient() 
	{
		
		//AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
		//		.withRegion(Regions.US_WEST_2)
		//		.build();  
	    log.trace("Entering DynamoDbClient()");

		AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().withEndpointConfiguration(
			new AwsClientBuilder.EndpointConfiguration("http://localhost:8000", "us-west-2"))
		.build(); 		
	}
	
}
