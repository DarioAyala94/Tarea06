
package programas;
import java.util.Scanner;
public class Tarea03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número para mostrar su tabla de multiplicar: ");
        int numero = scanner.nextInt();
        int i = 1;

        // Iniciamos el ciclo while para mostrar la tabla de multiplicar
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++; // Incrementamos el contador
        }
    }
}
