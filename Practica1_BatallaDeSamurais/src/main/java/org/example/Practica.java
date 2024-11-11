package org.example;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Practica {
    public void Ejercicio() {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        int poder1_int[] = new int[7];
        int poder2_int[] = new int[7];
        int suma1 = 0, suma2= 0, samurai_random, team1= 0, team2 = 0;


        bucle_inicial1:
        while (true) {
            suma1 = 0;
            System.out.println("Equipo 1");
            System.out.print("Introduce potencia de los samurais: ");
            String poder1 = entrada.nextLine();
            String subcadena1[] = poder1.split(" ");

            if (subcadena1.length == 7) {
                for (int i = 0; i < subcadena1.length; i++) {
                    try {
                        poder1_int[i] = Integer.parseInt(subcadena1[i]);
                    } catch (NumberFormatException err) {
                        System.out.println("ERROR. Introduce la potencia de los samurais correctamente...");
                        continue bucle_inicial1;
                    }
                    if (poder1_int[i] < 0){
                        System.out.println("ERROR. Introduce la potencia de los samurais correctamente...");
                        continue bucle_inicial1;
                    }
                    suma1 += poder1_int[i];
                }
                if(suma1 != 30){
                    System.out.println("ERROR. La potencia total no suma 30...");
                    continue bucle_inicial1;
                }
                System.out.println("Equipo completado.");
                break;
            }else{
                System.out.println("ERROR. Introduce la potencia de los samurais correctamente...");
                continue;
            }
        }

        bucle_inicial2:
        while (true) {
            suma2 = 0;
            System.out.println("Equipo 2");
            System.out.print("Introduce potencia de los samurais: ");
            String poder2 = entrada.nextLine();
            String subcadena2[] = poder2.split(" ");

            if (subcadena2.length == 7) {
                for (int i = 0; i < 7; i++) {
                    try {
                        poder2_int[i] = Integer.parseInt(subcadena2[i]);
                    } catch (NumberFormatException err) {
                        System.out.println("ERROR. Introduce la potencia de los samurais correctamente...");
                        continue bucle_inicial2;
                    }
                    if (poder2_int[i] < 0){
                        System.out.println("ERROR. Introduce la potencia de los samurais correctamente...");
                        continue bucle_inicial2;
                    }
                    suma2 += poder2_int[i];
                }
                if(suma2 != 30){
                    System.out.println("ERROR. La potencia total no suma 30...");
                    continue bucle_inicial2;
                }
                System.out.println("Equipo completado.");
                break;
            }else{
                System.out.println("ERROR. Introduce la potencia de los samurais correctamente...");
                continue;
            }
        }
        System.out.println("¡Empieza la batalla!");
        samurai_random = aleatorio.nextInt(7)+1;
        System.out.println("La batalla inicia con el Samurai " + samurai_random + ".");


        for( ;team1 < 4 && team2 < 4; samurai_random++){
            if (poder1_int[samurai_random - 1] < poder2_int[samurai_random - 1]){
                System.out.println("Samurai " + samurai_random + "." + " Gana Equipo 2. " + poder1_int[samurai_random - 1] + " vs " + poder2_int[samurai_random - 1]);
                team2++;
            }else if(poder1_int[samurai_random - 1] > poder2_int[samurai_random - 1]){
                System.out.println("Samurai " + samurai_random + "." + " Gana Equipo 1. " + poder1_int[samurai_random - 1] + " vs " + poder2_int[samurai_random - 1]);
                team1++;
            }else{
                System.out.println("Samurai " + samurai_random + "." + " ¡EMPATE!. " + poder1_int[samurai_random - 1] + " vs " + poder2_int[samurai_random - 1]);
                team1++;
                team2++;
            }
            if(samurai_random == 7){
                samurai_random = 0;}
        }

        if(team1 == team2){
            System.out.println("¡EMPATE! Los dos equipos han tenido 4 bajas.");
        }else if(team2 == 4) {
            System.out.println("¡Equipo " + 2 + " GANA! Equipo " + 1 + " ha tenido 4 bajas.");
        }else if(team1 == 4){
            System.out.println("¡Equipo " + 1 + " GANA! Equipo " + 2 + " ha tenido 4 bajas.");
        }
    }

}
