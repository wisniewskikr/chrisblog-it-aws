package pl.kwi.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import pl.kwi.aws.requests.GreetingRequest;
import pl.kwi.aws.responses.GreetingResponse;

public class GreetingHandler implements RequestHandler<GreetingRequest, GreetingResponse> {
	
	public GreetingResponse handleRequest(GreetingRequest request, Context context) {
        context.getLogger().log("Name: " + request.getName());
        return new GreetingResponse("Hello World: " + request.getName());
    }
	
}
