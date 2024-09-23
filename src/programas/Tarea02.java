
package programas;
import java.util.Scanner;
public class Tarea02 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = 7; // Número secreto
        int intento;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Intenta adivinar el número entre 1 y 10.");

        // Iniciamos el ciclo while
        while (true) {
            System.out.print("Introduce tu número: ");
            intento = scanner.nextInt();

            // Comprobamos si el número es el correcto
            if (intento == numeroSecreto) {
                System.out.println("¡Felicidades! Adivinaste el número.");
                break; // Salimos del ciclo cuando se adivina correctamente
            } else {
                System.out.println("Intenta de nuevo.");
            }
        }
    } 
}
