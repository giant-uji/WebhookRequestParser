package data;

import lombok.Data;

import java.util.List;

@Data
public class Inputs {
    private List<RawInputs> rawInputs;
    private List<Argument> arguments;
    private String intent;

}
