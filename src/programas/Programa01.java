
package programas;
import java.Screen.util;
/*
Crear un programa en java que permita ingresar cantidad.
Vizualizar el numero de digitos de la cantidad egresada.
Por ejemplo:
cantidad=1234
Resultado:
Congud=4
 */
import java.util.Scanner;
public class Programa01 {
    public static void main(String []args){
        // declarar variables
        int cantidad, candig;
        Scanner lectura=new Scanner(System.in);
        // entrada de datos
        System.out.print("Ingresar una cantidad: ");
        cantidad=lectura.nextInt();
        //proceso de datos
        candig=0;
        while(cantidad>0){
            candig++;
            cantidad=cantidad/10;
        }
        //salida de datos
        System.out.println("la cantidad de digitos es:"+candig);
    }   
}
