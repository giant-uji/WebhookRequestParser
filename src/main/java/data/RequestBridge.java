package data;

public class RequestBridge<T, U> {
    private String responseId;
    private QueryResultBridge<T, U> queryResult;
    private OriginalDetectIntentRequest originalDetectIntentRequest;
    private String session;
}
