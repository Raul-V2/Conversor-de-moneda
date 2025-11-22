package com.aluracurso.conversor.modelos;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Monedas {
     @SerializedName("conversion_rates")
     private Map<String, Double> cambio;

    public Map<String, Double> getCambio() {
        return cambio;
    }
//@Override
    //public String toString() {
    //    return moneda;
   // }
}
