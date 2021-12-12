
public class Estructura {

    private final char[][] matriz;

    public Estructura() {
        this.matriz = new char[3][3];
        inicializarMatriz();
    }

    public boolean ganadorX() {
        if ((this.matriz[0][0] == 'X') && (this.matriz[0][1] == 'X') && (this.matriz[0][2] == 'X')) {
            return true;
        } else if ((this.matriz[1][0] == 'X') && (this.matriz[1][1] == 'X') && (this.matriz[1][2] == 'X')) {
            return true;
        } else if ((this.matriz[2][0] == 'X') && (this.matriz[2][1] == 'X') && (this.matriz[2][2] == 'X')) {
            return true;
        } else if ((this.matriz[0][0] == 'X') && (this.matriz[1][0] == 'X') && (this.matriz[2][0] == 'X')) {
            return true;
        } else if ((this.matriz[0][1] == 'X') && (this.matriz[1][1] == 'X') && (this.matriz[2][1] == 'X')) {
            return true;
        } else if ((this.matriz[0][2] == 'X') && (this.matriz[1][2] == 'X') && (this.matriz[2][2] == 'X')) {
            return true;
        } else if ((this.matriz[0][0] == 'X') && (this.matriz[1][1] == 'X') && (this.matriz[2][2] == 'X')) {
            return true;
        } else {
            return (this.matriz[2][0] == 'X') && (this.matriz[1][1] == 'X') && (this.matriz[0][2] == 'X');
        }
    }

    public boolean ganadorO() {
        if ((this.matriz[0][0] == 'O') && (this.matriz[0][1] == 'O') && (this.matriz[0][2] == 'O')) {
            return true;
        } else if ((this.matriz[1][0] == 'O') && (this.matriz[1][1] == 'O') && (this.matriz[1][2] == 'O')) {
            return true;
        } else if ((this.matriz[2][0] == 'O') && (this.matriz[2][1] == 'O') && (this.matriz[2][2] == 'O')) {
            return true;
        } else if ((this.matriz[0][0] == 'O') && (this.matriz[1][0] == 'O') && (this.matriz[2][0] == 'O')) {
            return true;
        } else if ((this.matriz[0][1] == 'O') && (this.matriz[1][1] == 'O') && (this.matriz[2][1] == 'O')) {
            return true;
        } else if ((this.matriz[0][2] == 'O') && (this.matriz[1][2] == 'O') && (this.matriz[2][2] == 'O')) {
            return true;
        } else if ((this.matriz[0][0] == 'O') && (this.matriz[1][1] == 'O') && (this.matriz[2][2] == 'O')) {
            return true;
        } else {
            return (this.matriz[2][0] == 'O') && (this.matriz[1][1] == 'O') && (this.matriz[0][2] == 'O');
        }
    }

    public void ingresarMarcaX(int fila, int columna) {
        this.matriz[fila][columna] = 'X';
    }

    public void ingresarMarcaO(int fila, int columna) {
        this.matriz[fila][columna] = 'O';
    }

    public void imprimirMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + this.matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public boolean CeldaMarcada(int fila, int columna) {
        return (matriz[fila][columna] == ' ') || (matriz[fila][columna] == ' ');
    }

    public boolean posicionValida(int fila, int columna) {
        return ((fila >= 0) && (fila < 3) && (columna >=0) && (columna < 3));
    }

    public final void inicializarMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.matriz[i][j] = ' ';
            }
        }
    }

    public String ganador(String jugador1, int puntajeJugador1, String jugador2, int puntajeJugador2) {

        String aux;

        if (puntajeJugador1 > puntajeJugador2) {
            aux = "El ganador es " + jugador1 + " con " + puntajeJugador1 + " puntos.";
        } else if (puntajeJugador2 > puntajeJugador1) {
            aux = "El ganador es " + jugador2 + " con " + puntajeJugador2 + " puntos.";
        } else {
            aux = "Empate, ambos jugadores tienen los mismos puntos";
        }

        return aux;
    }

    public boolean matrizLlena() {
        return matriz[0][0] != ' ' && matriz[0][1] != ' ' && matriz[0][2] != ' '
                && matriz[1][0] != ' ' && matriz[1][1] != ' ' && matriz[1][2] != ' '
                && matriz[2][0] != ' ' && matriz[2][1] != ' ' && matriz[2][2] != ' ';
    }

}
