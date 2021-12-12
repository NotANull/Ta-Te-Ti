import java.util.Scanner;

public class GameMode2 {

    private Scanner leer; 
    private int fila, columna, puntajeJugador1 = 0, puntajeJugador2 = 0;
    private String jugador1, ganador = null, sigue = "si";
    private Estructura e;

    public void modoJuego2() {

        leer = new Scanner(System.in);

        System.out.println();
        System.out.print("Ingrese el nombre del jugador 1: ");
        jugador1 = leer.next();

        while (sigue.equals("si")) {

            e = new Estructura();

            while ((!e.ganadorX()) || (!e.ganadorO()) || (!e.matrizLlena())) {

                System.out.println();
                System.out.println("Turno de " + jugador1);
                System.out.print("Elija el eje X: ");
                fila = leer.nextInt();
                System.out.print("Elija el eje Y: ");
                columna = leer.nextInt();

                if (e.posicionValida(fila, columna)) {

                    if (e.CeldaMarcada(fila, columna)) {

                        e.ingresarMarcaX(fila, columna);
                        e.imprimirMatriz();

                    } else {
                        while (!e.CeldaMarcada(fila, columna)) {
                            System.out.println("");
                            System.out.println("Ya se marcó en la celda, por favor marque otra celda");

                            System.out.println("");
                            System.out.println("Turno de " + jugador1);

                            System.out.print("Elija el eje X: ");
                            fila = leer.nextInt();

                            System.out.print("Elija el eje Y: ");
                            columna = leer.nextInt();

                            while (!e.posicionValida(fila, columna)) {
                                System.out.println("");
                                System.out.println("Está ingresando una posición inválida, por favor ingrese otra posición");

                                System.out.println("");
                                System.out.print("Elija el eje X: ");
                                fila = leer.nextInt();
                                System.out.print("Elija el eje Y: ");
                                columna = leer.nextInt();
                            }
                        }

                        e.ingresarMarcaX(fila, columna);
                        e.imprimirMatriz();
                    }

                } else {
                    while (!e.posicionValida(fila, columna)) {
                        System.out.println("");
                        System.out.println("Está ingresando una posición inválida, por favor ingrese otra posición");

                        System.out.println("");
                        System.out.print("Elija el eje X: ");
                        fila = leer.nextInt();
                        System.out.print("Elija el eje Y: ");
                        columna = leer.nextInt();
                    }

                    e.ingresarMarcaX(fila, columna);
                    e.imprimirMatriz();
                }

                if (e.ganadorX()) {
                    ganador = jugador1;
                    puntajeJugador1++;
                    break;
                } else if (e.matrizLlena()) {
                    break;
                }

                //TURNO DE LA MÁQUINA
                fila = (int)(Math.random()*3);
                columna = (int)(Math.random()*3);

                if (e.CeldaMarcada(fila, columna)) {

                    System.out.println("");
                    System.out.println("Turno de la máquina");
                    System.out.println("La máquina eligió el " + fila + " para el eje X");
                    System.out.println("La máquina eligió el " + columna + " para el eje Y");

                    e.ingresarMarcaO(fila, columna);
                    e.imprimirMatriz();
                } else {
                    while (!e.CeldaMarcada(fila, columna)) {
                        fila = (int)(Math.random()*3);
                        columna = (int)(Math.random()*3);
                    }
                    System.out.println("");
                    System.out.println("Turno de la máquina");
                    System.out.println("La máquina eligió el " + fila + " para el eje X");
                    System.out.println("La máquina eligió el " + columna + " para el eje Y");

                    e.ingresarMarcaO(fila, columna);
                    e.imprimirMatriz();
                }

                if (e.ganadorO()) {
                    ganador = "la máquina";
                    puntajeJugador2++;
                    break;
                } else if (e.matrizLlena()) {
                    break;
                }

            }

            if (e.ganadorX()) {
                System.out.println("");
                System.out.println("El ganador de la ronda es: " + ganador);

                System.out.println("");
                System.out.print("Quiere/n jugar otra partida? Escriba 'si' en ese caso: ");
                sigue = leer.next();
            } else if (e.ganadorO()) {
                System.out.println("");
                System.out.println("El ganador de la ronda es la máquina ");

                System.out.println("");
                System.out.print("Quiere/n jugar otra partida? Escriba 'si' en ese caso: ");
                sigue = leer.next();
            } else if ((e.matrizLlena() && !e.ganadorX()) && (e.matrizLlena() && !e.ganadorO())) {
                System.out.println("Ya no se pueden hacer más movimientos.");
                System.out.print("Quiere/n jugar otra partida? Escriba 'si' en ese caso: ");
                sigue = leer.next();
            }
        }
        System.out.println(e.ganador(jugador1, puntajeJugador1, "la máquina", puntajeJugador2));
    }
}
