
package programas;

/**
Crear un programa que pemita ingresar una cantidad.
Vizualizar la cantidad invertida.

Por ejemplo:
cantidad=123
caninv=321
 */
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args) {
            //declarar variables
            int cantidad,caninv,dig;
            Scanner lectura=new Scanner(System.in);
            //entrada de datos
            System.out.print("ingresar una  cantidad:");
            cantidad=lectura.nextInt();
            //proceso de datos
            caninv=0;
            dig=0;
            while(cantidad>0){
                dig=cantidad%10;
                caninv=(caninv*10)+dig;
                cantidad=cantidad/10;
            }
            //salida de datos
             System.out.println("La cantidas invertida es;"+caninv);           
    }
}
