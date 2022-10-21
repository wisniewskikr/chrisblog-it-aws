package pl.kwi.aws.lambda;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import com.amazonaws.services.lambda.AWSLambda;
import com.amazonaws.services.lambda.AWSLambdaClientBuilder;
import com.amazonaws.services.lambda.model.InvokeRequest;
import com.amazonaws.services.lambda.model.InvokeResult;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pl.kwi.aws.requests.GreetingRequest;
import pl.kwi.aws.responses.GreetingResponse;

public class GreetingHandler implements RequestHandler<GreetingRequest, GreetingResponse> {
	
	private static final String INVOKER_FUNCTION_NAME = "responser";

	public GreetingResponse handleRequest(GreetingRequest input, Context context) {
						
		AWSLambda client = AWSLambdaClientBuilder.defaultClient();
		InvokeRequest request = new InvokeRequest().withFunctionName(INVOKER_FUNCTION_NAME).withPayload(convertObjectToString(input));
		InvokeResult result = client.invoke(request);
		String payload = StandardCharsets.UTF_8.decode(result.getPayload()).toString();
		
        return convertStringToObject(payload);
    }
	
	private String convertObjectToString(GreetingRequest input) {
		
		String result = null;
		
		try {
			ObjectMapper mapper = new ObjectMapper();
			result = mapper.writeValueAsString(input);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	private GreetingResponse convertStringToObject(String payload) {
		
		GreetingResponse result = null;
		
		try {
			ObjectMapper mapper = new ObjectMapper();
			result = mapper.readValue(payload, GreetingResponse.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
	
}
