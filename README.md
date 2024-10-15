# Convertidor de moneda

Este proyecto es un conversor de monedas en Java que utiliza `HttpClient` y `GSON` para obtener tasas de conversión actualizadas desde una API pública.
https://www.exchangerate-api.com/

## Instalación

1. **Descargar y agregar GSON**:

   - Descarga el archivo JAR desde [Maven Central](https://mvnrepository.com/artifact/com.google.code.gson/gson) y añádelo a tu proyecto.

2. **Configuración de la API**:

   Reemplaza `YOUR_API_KEY` en `CurrencyConverterAPI.java` con tu clave de API de [ExchangeRate-API](https://www.exchangerate-api.com/).

## Uso

### Clase Principal

La clase principal `CurrencyConverterWithMenuAndAPI` proporciona un menú de opciones para que el usuario seleccione el tipo de conversión deseada:

```java
public class CurrencyConverterWithMenuAndAPI {
    public static void main(String[] args) {
        // Código para la interacción con el usuario y la conversión de moneda
    }

    private static void convertCurrency(String fromCurrency, String toCurrency, Scanner scanner) {
        // Método para realizar la conversión de moneda
    }
}
