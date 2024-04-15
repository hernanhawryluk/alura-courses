package com.aluracursos.screenmatch.main;

import com.aluracursos.screenmatch.modelos.Title;
import com.aluracursos.screenmatch.modelos.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner prompt = new Scanner(System.in);
        List<Title> titles = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (true) {
            System.out.println("Write the movie you are looking for:");
            var search = prompt.nextLine();

            if(search.equalsIgnoreCase("exit")) {
                break;
            }

            String url = "http://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=27222298";

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                System.out.println(json);

                TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
                System.out.println(myTitleOmdb);

                Title myTitle = new Title(myTitleOmdb);
                System.out.println("Title already serialized:\n" + myTitle);

                titles.add(myTitle);

            } catch (NumberFormatException e) {
                System.out.println("Something went wrong");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error in the URI, check the url.");
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Oops! Something went wrong.");
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titles);
        FileWriter file = new FileWriter("titles.json");
        file.write(gson.toJson(titles));
        file.close();

        System.out.println("The program finished without errors");
    }
}
