package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;

        int votosInternet = 0;
        int votosRadio = 0;
        int votosTelevision = 0;

        int totalVotos = 0;
        double costoTotalCampana = 0;

        int opcion;

        do {
            System.out.println("\nElecciones Municipio Premier");
            System.out.println("1. Votar");
            System.out.println("2. Calcular costo de campaña");
            System.out.println("3. Vaciar urnas");
            System.out.println("4. Mostrar resultados");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1: //Candidatos
                    System.out.println("\nCandidatos:");
                    System.out.println("1. Candidato 1");
                    System.out.println("2. Candidato 2");
                    System.out.println("3. Candidato 3");
                    System.out.print("Ingrese su voto: ");
                    int voto = scanner.nextInt();

                    switch (voto) { //Suma de votos por candidato
                        case 1:
                            candidato1++;
                            break;
                        case 2:
                            candidato2++;
                            break;
                        case 3:
                            candidato3++;
                            break;
                        default:
                            System.out.println("Voto inválido.");
                            break;
                    }
                    //Medio de publicidad
                    System.out.println("\nMedio de publicidad que influyó en su voto:");
                    System.out.println("1. Internet");
                    System.out.println("2. Radio");
                    System.out.println("3. Televisión");
                    System.out.print("Ingrese el número del medio: ");
                    int medio = scanner.nextInt();

                    switch (medio) {
                        //Suma por Medio
                        case 1:
                            votosInternet++;
                            break;
                        case 2:
                            votosRadio++;
                            break;
                        case 3:
                            votosTelevision++;
                            break;
                        default:
                            System.out.println("Medio inválido.");
                            break;
                    }

                    totalVotos++;
                    break;
                case 2: //Costo de campaña
                    System.out.print("Ingrese el número del candidato (1, 2 o 3): ");
                    int candidato = scanner.nextInt();

                    double costoCandidato = 0;
                    switch (candidato) {
                        case 1:
                            costoCandidato = candidato1 * 700000 + candidato1 * 200000 + candidato1 * 600000;
                            break;
                        case 2:
                            costoCandidato = candidato2 * 700000 + candidato2 * 200000 + candidato2 * 600000;
                            break;
                        case 3:
                            costoCandidato = candidato3 * 700000 + candidato3 * 200000 + candidato3 * 600000;
                            break;
                        default:
                            System.out.println("Candidato inválido.");
                            break;
                    }
                    System.out.println("Costo de campaña del candidato " + candidato + ": $" + costoCandidato);
                    break;
                case 3: //Vacias urnas
                    candidato1 = 0;
                    candidato2 = 0;
                    candidato3 = 0;
                    votosInternet = 0;
                    votosRadio = 0;
                    votosTelevision = 0;
                    totalVotos = 0;
                    costoTotalCampana = 0;
                    System.out.println("Urnas vacias.");
                    break;
                case 4: //Mostrar resultados
                    System.out.println("\nResultados:");
                    System.out.println("Candidato 1: " + candidato1 + " votos (" + (totalVotos > 0 ? (candidato1 * 100.0 / totalVotos) : 0) + "%)");
                    System.out.println("Candidato 2: " + candidato2 + " votos (" + (totalVotos > 0 ? (candidato2 * 100.0 / totalVotos) : 0) + "%)");
                    System.out.println("Candidato 3: " + candidato1 + " votos (" + (totalVotos > 0 ? (candidato3 * 100.0 / totalVotos) : 0) + "%)");
                    System.out.println("Total de votos: " + totalVotos);

                    costoTotalCampana = candidato1 * 700000 + candidato1 * 200000 + candidato1 * 600000 + candidato2 * 700000 + candidato2 * 200000 + candidato2 * 600000 + candidato3 * 700000 + candidato3 * 200000 + candidato3 * 600000;
                    double costoPromedioCampana = totalVotos > 0 ? costoTotalCampana / totalVotos : 0;
                    System.out.println("Costo total de campaña: $" + costoTotalCampana);
                    System.out.println("Costo promedio de campaña: $" + costoPromedioCampana);
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 5);
        scanner.close();
    }
}