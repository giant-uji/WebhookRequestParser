package main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import data.RequestBridge;
import data.Valor;
import data.ValorOriginal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        GsonBuilder gsonBuilder = new GsonBuilder().setPrettyPrinting();
        Gson gson = gsonBuilder.create();

        File file = Paths.get("src/main/resources/result.json").toFile();
        Reader reader = new FileReader(file);


        Type type = new TypeToken<RequestBridge<Valor, ValorOriginal>>(){}.getType();

        RequestBridge request = gson.fromJson(reader, type);
        System.out.println(gson.toJson(request));
    }
}
