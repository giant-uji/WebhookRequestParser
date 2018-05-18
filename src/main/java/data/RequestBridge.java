package data;

public class RequestBridge<T> {
    private String responseId;
    private QueryResultBridge<T> queryResult;
    private OriginalDetectIntentRequest originalDetectIntentRequest;
    private String session;

    public RequestBridge() {
        super();
    }

    public RequestBridge(String responseId, QueryResultBridge<T> queryResult, String session) {
        this.responseId = responseId;
        this.queryResult = queryResult;
        this.session = session;
    }
}
