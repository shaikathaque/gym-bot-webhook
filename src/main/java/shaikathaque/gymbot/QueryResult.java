package shaikathaque.gymbot;

public class QueryResult {
	private Parameters parameters;
	private String queryText;
	
	public QueryResult() {
		
	}
	
	public QueryResult(Parameters params, String text) {
		this.setParameters(params);
		this.setQueryText(text);
	}

	public Parameters getParameters() {
		return parameters;
	}

	public void setParameters(Parameters parameters) {
		this.parameters = parameters;
	}

	public String getQueryText() {
		return queryText;
	}

	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}
	
	
}
