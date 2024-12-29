import java.util.Scanner;

public class Rey {
    private int columna;
    private int fila;
    private String color;

    public Rey(int columna, int fila, String color) {
        this.columna = columna;
        this.fila = fila;
        this.color = color;
    }

    public String[] getPosiciones(Tablero tablero) {
        String[] posiblesMovimientos = new String[8];
        int cont = 0;
        // Direcciones de los 8 posibles movimientos del Rey
        int[] filasMovimiento = {-1, 1, 0, 0, -1, -1, 1, 1}; // Movimientos en las filas
        int[] columnasMovimiento = {0, 0, -1, 1, -1, 1, -1, 1}; // Movimientos en las columnas

        for (int i = 0; i < 8; i++) {
            int nuevaFila = fila + filasMovimiento[i];
            int nuevaColumna = columna + columnasMovimiento[i];

            // Comprobar si la nueva posición es válida
            if (tablero.esPosicionValida(nuevaFila, nuevaColumna)) {
                posiblesMovimientos[cont++] = tablero.obtenerPosicion(nuevaFila, nuevaColumna);
            }
        }

        return filtrarMovimientos(posiblesMovimientos, cont);
    }

    private String[] filtrarMovimientos(String[] movimientos, int size) {
        String[] filtrados = new String[size];
        System.arraycopy(movimientos, 0, filtrados, 0, size);
        return filtrados;
    }
        }







