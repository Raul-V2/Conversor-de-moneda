package com.aluracurso.conversor.conexion;

import com.aluracurso.conversor.modelos.HistorialConversiones;
import com.aluracurso.conversor.modelos.Monedas;
import com.aluracurso.conversor.modelos.RegistroConsulta;
import com.google.gson.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Conexion {
    private double cambio;
    private double resultado;

    public void obtenerDatos (String monedaEntrada, String monedaSalida, double monto){
        String apiKey="a8aea8394635c6237ccb9e62";
        //3) Importando la biblioteca Gson en Intellij
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        String direccion= "https://v6.exchangerate-api.com/v6/"+apiKey+"/latest/"+monedaEntrada;

        //4) Construyendo el Cliente para Solicitudes (HttpClient)
        HttpClient client = HttpClient.newHttpClient();

        //5) Construyendo la Solicitud (HttpRequest)
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        //6) Construyendo la Respuesta (HttpResponse)
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            //7) Analizando la respuesta en formato JSON
            //System.out.println(json);

            Monedas monedas = gson.fromJson(json, Monedas.class);
            cambio=monedas.getCambio().get(monedaSalida);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        resultado = monto * cambio;

        System.out.println("El valor "+monto+" ["+monedaEntrada+"] corresponde al valor final de =>>> "+resultado+" ["+monedaSalida+"]");
    }

    public double getResultado() {
        return resultado;
    }
}
