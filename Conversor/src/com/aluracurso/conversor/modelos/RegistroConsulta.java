package com.aluracurso.conversor.modelos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RegistroConsulta {
    private String monedaOrigen;
    private String monedaDestino;
    private double monto;
    private double resultado;
    private LocalDateTime timestamp;

    public RegistroConsulta(String monedaOrigen, String monedaDestino, double monto, double resultado) {
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.monto = monto;
        this.resultado = resultado;
        this.timestamp = LocalDateTime.now(); // Marca de tiempo automática
    }

    public String getMonedaOrigen() { return monedaOrigen; }
    public String getMonedaDestino() { return monedaDestino; }
    public double getMonto() { return monto; }
    public double getResultado() { return resultado; }
    public LocalDateTime getTimestamp() { return timestamp; }
}
