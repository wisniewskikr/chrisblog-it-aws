package pl.kwi.aws.responses;

public class GreetingResponse {
	
	private String message;

	public GreetingResponse(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
