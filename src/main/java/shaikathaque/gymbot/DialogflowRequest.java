package shaikathaque.gymbot;

public class DialogflowRequest {
	private QueryResult queryResult;
	private String responseId;
	
	public DialogflowRequest() {

	}
	
	public DialogflowRequest(String id, QueryResult result) {
		this.setQueryResult(result);
		this.setResponseId(id);
	}

	public QueryResult getQueryResult() {
		return queryResult;
	}

	public void setQueryResult(QueryResult queryResult) {
		this.queryResult = queryResult;
	}

	public String getResponseId() {
		return responseId;
	}

	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}
	
}
