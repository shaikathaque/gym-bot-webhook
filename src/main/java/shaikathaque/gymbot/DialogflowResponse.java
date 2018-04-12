package shaikathaque.gymbot;

public class DialogflowResponse {
	private String fulfillmentText;
	
	public DialogflowResponse() {
		
	}
	
	public DialogflowResponse(String responseText) {
		this.setFulfillmentText(responseText);
	}

	public String getFulfillmentText() {
		return fulfillmentText;
	}

	public void setFulfillmentText(String fulfillmentText) {
		this.fulfillmentText = fulfillmentText;
	}
	
}
