<H2>Conversor de Monedas en Java (con API)</H2>
Este proyecto es una aplicación de consola en Java que permite convertir entre múltiples monedas utilizando una API de tasas de cambio en tiempo real.
Además, registra un historial de conversiones con marca de tiempo usando java.time.</br>
Incluye:</br>
- Menú interactivo </br>
- Conversión entre monedas predefinidas</br>
- Conversión libre entre cualquier par de monedas</br>
- Historial detallado con fecha y hora</br>
- Integración con API JSON</br>
- Código organizado en clases (POO)</br>

<h2>Tecnologías usadas</h2>
-Java 17+</br>
-Gson para parseo JSON</br>
-HttpURLConnection / HttpClient (según implementación)</br>
-java.time para timestamps</br>
-API de tasas de cambio (ExchangeRate API u otra compatible)</br>

<h2>Caracteristicas</h2>
<h3>Menu principal</h3>
<div>- Consta con 9 opciones de interacción:</br>
  1) Las 6 primeras opciones permite conversiones predefinidas:</br>
    - Dólar ⇄ Peso Argentino.</br>
    - Dólar ⇄ Real Brasileño.</br>
    - Dólar ⇄ Peso Colombiano.</br>
  2) Conversión libre.</br>
  3) Historial de conversiones.</br>
  4) Opcion de salir del programa.</br></div>
 <img width="607" height="389" alt="inicio" src="https://github.com/user-attachments/assets/ddb462b7-7ad2-4abc-86bb-078134cd615a" />

<h3>Opcion de conversiones predefinidas:</h3>
- El usuario puede ingresar:</br>
1) El numero de la opcion de la moneda a convertir (ej: 1 → 1) Dólar >>> Peso Argentino). </br>
2) El Monto a convertir:</br>
   → El sistema consulta la API y muestra el resultado(1).</br>
 <img width="765" height="203" alt="opcion 2-6" src="https://github.com/user-attachments/assets/100de2c0-9f98-4d8b-9f82-4d266efe5b11" />

<h3>Opcion de Conversión libre:</h3>
- Muestra un cuadro con codigos de algunas monedas que puede usar.</br>
- El usuario puede ingresar:</br>
1) El código de moneda origen (ej: PEN).</br>
2) El código destino (ej: JPY).</br>
3) El monto a convertir:</br>
   → El sistema consulta la API y muestra el resultado(1).</br>
<h6>(1) El resultado mostrará el monto y su valor correspondiente a la nueva moneda, 
  ambos junto al codigo respectivo de su moneda</h6>
  <img width="892" height="473" alt="opcion 7" src="https://github.com/user-attachments/assets/3509d050-3c74-4381-9f92-570d2a7822f9" />

<h3>Opcion Historial de conversiones:</h3>
Muestra un menu de historial que incluye:</br>
- Moneda origen.</br>
- Moneda destino.</br>
- Monto ingresado.</br>
- Resultado.</br>
- Fecha y hora exacta.</br>
<img width="987" height="310" alt="opcion8" src="https://github.com/user-attachments/assets/fc96c878-c5dd-4c28-ae21-dc5c28ab6f78" />

<h3>Opcion Salir:</h3>
- Muestra un mensaje de despedida</br>
- Sale del programa de conversion </br>
<img width="711" height="135" alt="opcion9" src="https://github.com/user-attachments/assets/5907c172-60ed-4b15-b58a-b9315d65561e" />

<h3>Aprendizajes aplicados</h3>
- Consumo de APIs en Java.</br>
- Procesamiento de JSON con Gson.</br>
- Manejo de excepciones.</br>
- Registro de datos con LocalDateTime.</br>
- Programación orientada a objetos.</br>
- Diseño de menú en consola.</br>

<h3>Autor</h3>
Proyecto desarrollado por Raúl Vidaurre.

