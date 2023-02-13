package pl.kwi.aws.lambda;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.S3Object;

public class GreetingHandler implements RequestHandler<Object, String> {
	
	private static final String S3_BUCKET = "wisniewskikr-greeting";
	private static final String S3_KEY = "name.txt";	

	public String handleRequest(Object input, Context context) {
		
		String name = null; 
		
		try {
			
			AmazonS3 client = AmazonS3ClientBuilder.defaultClient();
			S3Object xFile = client.getObject(S3_BUCKET, S3_KEY);
			InputStream inputStream = xFile.getObjectContent();			
			name = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
			
		} catch (IOException e) {
			e.printStackTrace();
			context.getLogger().log("Exception: " + e.getMessage());
		}
		
        return "Hello World: " + name;
    }
	
}
