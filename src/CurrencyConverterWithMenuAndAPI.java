import java.util.Scanner;

public class CurrencyConverterWithMenuAndAPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona la opción de conversión:");
        System.out.println("1. USD a EUR");
        System.out.println("2. EUR a USD");
        System.out.println("3. USD a COP");
        System.out.println("4. COP a USD");
        System.out.println("5. Salir");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                convertCurrency("USD", "EUR", scanner);
                break;

            case 2:
                convertCurrency("EUR", "USD", scanner);
                break;

            case 3:
                convertCurrency("USD", "COP", scanner);
                break;

            case 4:
                convertCurrency("COP", "USD", scanner);
                break;

            case 5:
                System.out.println("Saliendo del programa...");
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }
        scanner.close();
    }

    private static void convertCurrency(String fromCurrency, String toCurrency, Scanner scanner) {
        System.out.println("Introduce la cantidad en " + fromCurrency + ":");
        double amount = scanner.nextDouble();
        double conversionRate = CurrencyConverterAPI.getConversionRate(fromCurrency, toCurrency);
        if (conversionRate != 0) {
            System.out.println(amount + " " + fromCurrency + " son " + (amount * conversionRate) + " " + toCurrency + ".");
        } else {
            System.out.println("Error al obtener la tasa de conversión. Inténtalo de nuevo más tarde.");
        }
    }
}
