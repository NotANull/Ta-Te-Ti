
import java.util.Scanner;


public class TATETI {

	public static void main(String[] args) {

		try (Scanner leer = new Scanner(System.in)) {
			GameMode1 gm1;
			GameMode2 gm2;

			int modoDeJuego;

			//COMIENZO DEL JUEGO
			//Elección de modo de juego
			System.out.println("¿Cómo desea jugar?");
			System.out.println("Ingrese 1 para jugar pvp");
			System.out.println("Ingrese 2 para jugar pve");
			System.out.print("Ingrese el modo de juego que desea jugar: ");
			modoDeJuego = leer.nextInt(); //Ingresa desde consola un dato

			while ((modoDeJuego != 1) && (modoDeJuego != 2)) {
				System.out.println("No existe el modo de juego que elegiste, porfavor ingrese el correcto");
				System.out.println();

				System.out.print("Ingrese el modo de juego que desea jugar: ");
				modoDeJuego = leer.nextInt();
			}

			//Modo de juego PVP
			if (modoDeJuego == 1) {

				gm1 = new GameMode1();
			
				gm1.modoJuego1();

			//Modo de juego PVE
			} else if (modoDeJuego == 2) {
				
				gm2 = new GameMode2();

				gm2.modoJuego2();
			}
		}
	}
}
