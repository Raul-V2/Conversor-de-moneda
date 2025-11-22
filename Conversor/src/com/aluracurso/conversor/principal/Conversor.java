package com.aluracurso.conversor.principal;

import com.aluracurso.conversor.conexion.Conexion;
import com.aluracurso.conversor.modelos.HistorialConversiones;
import com.aluracurso.conversor.modelos.RegistroConsulta;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion=0;
        double monto =0;
        double resultado =0;
        String monedaOrigen ="";
        String monedaSalida ="";
        String menu = """
                ************************************************
                Sea bienvenido/a al Conversor de Moneda =]
                
                1) Dólar >>> Peso Argentino
                2) Peso Argentino >>> Dólar
                3) Dólar >>> Real Brasileño
                4) Real Brasileño >>> Dólar
                5) Dólar >>> Peso Colombiano
                6) Peso Colombiano >>> Dólar
                7) Otra conversion
                8) Mostrar Historial de Conversiones
                9) Salir
                Elija una opción válida:
                ************************************************
                """;

        String mnsj = "Ingrese el valor que desea convertir:";
        HistorialConversiones historial = new HistorialConversiones();
        while (opcion != 9) {
            System.out.println(menu);

            opcion = teclado.nextInt();

            if (opcion == 9) {
                System.out.println("finalizando el programa. Muchas gracias por usar nuestros servicios");
            } else if (opcion == 8) {
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                System.out.println("""
                                ------------------------------------------------------------------------------------------------
                                                                     HISTORIAL DE CONVERSIONES
                                ------------------------------------------------------------------------------------------------
                                """);
                for (RegistroConsulta r : historial.getRegistros()) {
                    System.out.println(
                            "Consulta: " + r.getMonedaOrigen() + " → " + r.getMonedaDestino() +
                                    " | Monto: " + r.getMonto() +
                                    " | Resultado: " + r.getResultado() +
                                    " | Fecha: " + r.getTimestamp().format(formato)
                    );
                }
            }else {

                if (opcion % 2 ==0) {
                    monedaSalida = "USD";
                }else {
                    monedaOrigen ="USD";
                }
                switch (opcion){
                    case 1:
                        monedaSalida = "ARS";
                        break;
                    case 2:
                        monedaOrigen ="ARS";
                        break;
                    case 3:
                        monedaSalida = "BRL";
                        break;
                    case 4:
                        monedaOrigen ="BRL";
                        break;
                    case 5:
                        monedaSalida = "COP";
                        break;
                    case 6:
                        monedaOrigen ="COP";
                        break;
                    case 7:
                        System.out.println("""
                                ------------------------------------------------------------------------------
                                                     CODIGO DE MONEDAS
                                ------------------------------------------------------------------------------
                                USD : Dolares            | ARS : Pesos Argentinos   | CLP : Pesos Chilenos
                                COP : Pesos Colombianos  | BRL : Real Brasileño     | BOB : Bolivianos
                                UYU : Pesos Uruguayos    | PEN : Soles Peruanos     | MXN : Peso Mexicano
                                VES : Bolivar Venezolano | EUR : Euros              | JPY : Yenes JAponeses
                                ------------------------------------------------------------------------------
                                Ingrese codigo de moneda que quiere cambiar:""");
                                monedaOrigen = teclado.next().toUpperCase();
                                System.out.println("codigo de moneda de cambio:");
                                monedaSalida = teclado.next().toUpperCase();
                        break;
                }
                System.out.println(mnsj);
                Conexion conexion=new Conexion();
                monto = teclado.nextDouble();
                conexion.obtenerDatos(monedaOrigen,monedaSalida,monto);
                resultado= conexion.getResultado();

                RegistroConsulta registro = new RegistroConsulta(monedaOrigen,monedaSalida,monto,resultado);
                historial.agregarRegistro(registro);
                //variable = conexion.obtenerDatos(monedaOrigen,monedaSalida);
                //resultado = monto*variable;
                //String respuesta = "El valor "+monto+" ["+monedaOrigen+"] corresponde al valor final de =>>> "+resultado+" ["+monedaSalida+"]";
                //System.out.println(respuesta);
            }
        }

    }
}
