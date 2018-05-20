package data;
// El primer genérico es para el campo "parameters" de "queryResult"
// El segundo genérico es para el campo "parameters" de cada uno de los "outputContext"
public class RequestBridge<T, U> {
    private String responseId;
    private QueryResultBridge<T, U> queryResult;
    private OriginalDetectIntentRequest originalDetectIntentRequest;
    private String session;
}