package data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class QueryResultBridge<T, U> {
    private String queryText;
    private String action;
    private T parameters;
    private boolean allRequiredParamsPresent;
    private String fulfillmentText;
    private List<FulfillmentMessages> fulfillmentMessages;
    private List<OutputContext<U>> outputContexts;
    private Intent intent;
    private double intentDetectionConfidence;
    private Object diagnosticInfo;
    private String languageCode;
}
