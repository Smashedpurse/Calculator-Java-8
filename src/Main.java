import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion = 0;

        //DECLARACION DE OBJETO DE TIPO SCANNER
        Scanner sc ;

        do{

            System.out.println("\n");
            System.out.println("****Calculadora OPENWEBINARS");
            System.out.println("1 Sumar");
            System.out.println("2 Restar");
            System.out.println("3 Multiplicar");
            System.out.println("4 Dividir");
            System.out.println("5 Resto");
            System.out.println("0 Salir del programa");
            System.out.println("Introduzca una opcion valida");

            sc = new Scanner(System.in);
            opcion = Integer.parseInt(sc.nextLine());

            if (opcion < 0 || opcion < 5){
                System.out.println("Ingresa una opción valida");
            } else if (opcion != 0){
                System.out.println("\n");

                System.out.println("Ingrese el primer valor");

                float a = Float.parseFloat(sc.nextLine());

                System.out.println("Ingrese el segundo valor");

                float b = Float.parseFloat(sc.nextLine());

                System.out.println("\n");

                switch (opcion){
                    case 1:
                        System.out.println("El resultado de la suma es: " +( a + b));
                }

            }


            } while ()
        }
}