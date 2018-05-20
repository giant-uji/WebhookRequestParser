package data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import dialog.Valor;
import dialog.ValorOriginal;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.file.Paths;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

public class ParametersTest {
    private static RequestBridge<Valor, ValorOriginal> request;

    @BeforeAll
    public static void setUp() throws FileNotFoundException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        File file = Paths.get("src/main/resources/result.json").toFile();
        Reader reader = new FileReader(file);

        Type type = new TypeToken<RequestBridge<Valor, ValorOriginal>>(){}.getType();

        request = gson.fromJson(reader, type);
        System.out.println(gson.toJson(request));
    }

    @Test
    public void parametersTest() {
        Valor valor = new Valor();
        valor.setValor("cinco");

        Valor retrieved = request.getQueryResult().getParameters();

        assertThat(retrieved, is(valor));
    }
}
