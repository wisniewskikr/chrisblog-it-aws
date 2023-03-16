package pl.kwi.aws.responses;

import java.util.Map;

public class GatewayResponse {
	
	private Map<String, String> Headers;
	private Integer statusCode;
	private Boolean isBase64Encoded;
	private String body;
	
	public GatewayResponse(Map<String, String> headers, Integer statusCode, Boolean isBase64Encoded, String body) {
		Headers = headers;
		this.statusCode = statusCode;
		this.isBase64Encoded = isBase64Encoded;
		this.body = body;
	}
	
	public Map<String, String> getHeaders() {
		return Headers;
	}
	public void setHeaders(Map<String, String> headers) {
		Headers = headers;
	}
	
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	
	public Boolean getIsBase64Encoded() {
		return isBase64Encoded;
	}
	public void setIsBase64Encoded(Boolean isBase64Encoded) {
		this.isBase64Encoded = isBase64Encoded;
	}
	
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
}
