package main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import data.QueryResultBridge;
import data.RequestBridge;
import data.Valor;
import data.ValorOriginal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        GsonBuilder gsonBuilder = new GsonBuilder().setPrettyPrinting();
        Gson gson = gsonBuilder.create();

        File file = Paths.get("src/main/resources/result.json").toFile();
        Reader reader = new FileReader(file);


        Type listType = new TypeToken<ArrayList<RequestBridge>>(){}.getType();
        Type type = new TypeToken<RequestBridge<Valor, ValorOriginal>>(){}.getType();
//        List<YourClass> yourClassList = new Gson().fromJson(jsonArray, listType);

//        RequestBridge request = gson.fromJson(reader, RequestBridge.class);
        RequestBridge request = gson.fromJson(reader, type);
        System.out.println(gson.toJson(request));

//        QueryResultBridge<Valor> queryResultBridge = new QueryResultBridge<>("a", "b", "c", 1, new Valor("d"));
//        RequestBridge<Valor> coso = new RequestBridge<>("e", queryResultBridge, "f");
//        System.out.println(gson.toJson(coso));

    }
}
