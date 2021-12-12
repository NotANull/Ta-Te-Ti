import java.util.Scanner;

public class GameMode1 {

	private Scanner leer;
	private int fila, columna, puntajeJugador1 = 0, puntajeJugador2 = 0;
	private String jugador1, jugador2, ganador = null, sigue = "si";
	private Estructura e;

	public void modoJuego1() {

		leer = new Scanner(System.in);

		System.out.println();

		System.out.print("Ingrese el nombre del jugador 1: ");
		jugador1 = leer.next();

		System.out.print("Ingrese el nombre del jugador 2: ");
		jugador2 = leer.next();

		while (sigue.equals("si")) {

			e = new Estructura();

			while ((!e.ganadorX()) || (!e.ganadorO()) || (!e.matrizLlena())) {

				System.out.println("");
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

				System.out.println("");
				System.out.println("Turno de " + jugador2);
				System.out.print("Elija el eje X: ");
				fila = leer.nextInt();
				System.out.print("Elija el eje Y: ");
				columna = leer.nextInt();

				if (e.posicionValida(fila, columna)) {

					if (e.CeldaMarcada(fila, columna)) {

						e.ingresarMarcaO(fila, columna);
						e.imprimirMatriz();

					} else {
						while (!e.CeldaMarcada(fila, columna)) {
							System.out.println("");
							System.out.println("Ya se marcó en la celda, por favor marque otra celda");

							System.out.println("");
							System.out.println("Turno de " + jugador2);

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

						e.ingresarMarcaO(fila, columna);
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

					e.ingresarMarcaO(fila, columna);
					e.imprimirMatriz();
				}

				if (e.ganadorO()) {
					ganador = jugador2;
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
				System.out.println("El ganador de la ronda es: " + ganador);

				System.out.println("");
				System.out.print("Quiere/n jugar otra partida? Escriba 'si' en ese caso: ");
				sigue = leer.next();
			} else if ((e.matrizLlena() && !e.ganadorX()) && (e.matrizLlena() && !e.ganadorO())) {
				System.out.println("Ya no se pueden hacer más movimientos.");
				System.out.print("Quiere/n jugar otra partida? Escriba 'si' en ese caso: ");
				sigue = leer.next();
			}
		}

		System.out.println(e.ganador(jugador1, puntajeJugador1, jugador2, puntajeJugador2));
	}
}