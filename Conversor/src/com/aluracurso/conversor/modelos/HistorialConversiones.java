package com.aluracurso.conversor.modelos;

import java.util.ArrayList;
import java.util.List;

public class HistorialConversiones {

    private List<RegistroConsulta> registros = new ArrayList<>();

    public void agregarRegistro(RegistroConsulta registro) {
        registros.add(registro);
    }

    public List<RegistroConsulta> getRegistros() {
        return registros;
    }
}
