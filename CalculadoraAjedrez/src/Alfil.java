import java.sql.SQLOutput;
import java.util.Scanner;

public class Alfil {
    private String color;
    private int fila;
    private int columna;

    public Alfil(String color, int fila, int columna) {
        this.color = color.toLowerCase();
        this.fila = fila;
        this.columna = columna;
    }

    public String[] getPosiciones(Tablero tablero) {
        String[] posiblesMovimientos = new String[13];
        int cont = 0;

        // Movimientos diagonales hacia arriba-derecha
        for (int i = 1; i <= 8; i++) {
            if (tablero.esPosicionValida(fila + i, columna + i)) {
                posiblesMovimientos[cont++] = tablero.obtenerPosicion(fila + i, columna + i);
            } else {
                break;
            }
        }

        // Movimientos diagonales hacia arriba-izquierda
        for (int i = 1; i <= 8; i++) {
            if (tablero.esPosicionValida(fila + i, columna - i)) {
                posiblesMovimientos[cont++] = tablero.obtenerPosicion(fila + i, columna - i);
            } else {
                break;
            }
        }

        // Movimientos diagonales hacia abajo-derecha
        for (int i = 1; i <= 8; i++) {
            if (tablero.esPosicionValida(fila - i, columna + i)) {
                posiblesMovimientos[cont++] = tablero.obtenerPosicion(fila - i, columna + i);
            } else {
                break;
            }
        }

        // Movimientos diagonales hacia abajo-izquierda
        for (int i = 1; i <= 8; i++) {
            if (tablero.esPosicionValida(fila - i, columna - i)) {
                posiblesMovimientos[cont++] = tablero.obtenerPosicion(fila - i, columna - i);
            } else {
                break;
            }
        }

        // Filtrar movimientos nulos
        return filtrarMovimientos(posiblesMovimientos, cont);
    }

    private String[] filtrarMovimientos(String[] movimientos, int size) {
        String[] filtrados = new String[size];
        System.arraycopy(movimientos, 0, filtrados, 0, size);
        return filtrados;
    }
}



