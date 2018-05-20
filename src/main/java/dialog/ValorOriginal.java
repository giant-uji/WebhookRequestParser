package dialog;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ValorOriginal {
    @SerializedName("valor.original")
    private String valorOriginal;
    private String valor;
}
