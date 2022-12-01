package paqueteej;


import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner   teclado = new Scanner (System.in);

        System.out.println("introduce un numero: "); // Pedimos por consola un numero
        int numero = teclado.nextInt(); //introduccimos por teclado un numero aleatorio

        if (numero<0){
            System.out.println("El numero es Negativo");
        } else{
            System.out.println("El numero es Positivo");
        }


        int contador = 3;

        while (contador >  0) {
            System.out.println(contador);
            contador = contador -1;
        }


        do {
            System.out.println(contador);
            contador = contador -1;
        } while (contador > 3);


        for(int contador_2 = 3;contador_2 > 3; contador_2 = contador_2 - 1){
            System.out.println(contador_2);
        }

        var estacion = "PRIMAVERA" ;

        switch (estacion) {
            case ("VERANO"):
                System.out.println("Que calor, Vamos a tomar polas");
                break;
            case ("OTOÑO"):
                System.out.println("Madre mia se estan cayendom las hojas ");
                break;
            case ("INVIERNO"):
                System.out.println(" !!!!!Joder!!! que helada esta haciendo ");
                break;
            case ("PRIMAVERA"):
                System.out.println("WOOUUU que dia tan bonito ");
                break;
            default:
                System.out.println("Puta pero que estacion estamos");
        }


    }
}
