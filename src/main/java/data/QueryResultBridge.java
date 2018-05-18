package data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class QueryResultBridge<T> {
    private String queryText;
    private String action;
    private T parameters;
    private boolean allRequiredParamsPresent;
    private String fulfillmentText;
    private List<FulfillmentMessages> fulfillmentMessages;
    private List<OutputContext> outputContexts;
    private Intent intent;
    private double intentDetectionConfidence;
    private Object diagnosticInfo;
    private String languageCode;

    public QueryResultBridge() {
        super();
    }

    public QueryResultBridge(String queryText, String fulfillmentText, String languageCode, double intentDetectionConfidence, T parameters) {
        this.queryText = queryText;
        this.fulfillmentText = fulfillmentText;
        this.languageCode = languageCode;
        this.intentDetectionConfidence = intentDetectionConfidence;
        this.parameters = parameters;
    }
}
