
package programas;
import java.util.Scanner;
public class Tarea01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;

        // Iniciamos el ciclo while
        while (true) {
            System.out.print("Introduce un número (número negativo para salir): ");
            numero = scanner.nextInt();

            // Si el número es negativo, salimos del ciclo
            if (numero < 0) {
                break;
            }

            // Sumamos el número ingresado
            suma += numero;
        }

        // Mostramos la suma total
        System.out.println("La suma total es: " + suma);
    }
}
