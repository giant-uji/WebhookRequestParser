package examples;

import javax.xml.bind.annotation.XmlElement;

public class ValorOriginal {
    @XmlElement(name = "valor.original")
    private String valorOriginal;
    private String valor;

    public ValorOriginal() {
        super();
    }

    public String getValorOriginal() {
        return valorOriginal;
    }

    public String getValor() {
        return valor;
    }
}
