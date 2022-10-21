package pl.kwi.aws.lambda;

import java.util.Collections;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import pl.kwi.aws.requests.GatewayRequest;
import pl.kwi.aws.responses.GatewayResponse;

public class GreetingHandler implements RequestHandler<GatewayRequest, GatewayResponse> {
	
	public GatewayResponse handleRequest(GatewayRequest input, Context context) {
		
		context.getLogger().log("Name: " + input.getName());
		
		GatewayResponse response = new GatewayResponse(
				Collections.singletonMap("Content-Type", "application/json"), 
				200, 
				false, 
				"Hello World: " + input.getName());
		
		return response;
		
    }
	
}
