package data;

import lombok.Data;

@Data
public class OriginalDetectIntentRequest {
    private String source;
    private String version;
    private Payload payload;
}
