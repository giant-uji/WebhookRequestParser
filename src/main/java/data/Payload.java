package data;

import lombok.Data;

import java.util.List;

@Data
public class Payload {
    private boolean isInSandbox;
    private Surface surface;
    private List<Inputs> inputs;
    private User user;
    private Conversation conversation;
    private List<AvailableSurface> availableSurfaces;
}
