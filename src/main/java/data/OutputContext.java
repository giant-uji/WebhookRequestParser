package data;

import lombok.Data;

@Data
public class OutputContext<U> {
    private String name;
    private U parameters;
}
