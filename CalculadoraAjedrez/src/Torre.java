public class Torre {
    private int columna;
    private int fila;
    private String color;

    public Torre(int columna, int fila, String color) {
        this.columna = columna;
        this.fila = fila;
        this.color = color.toLowerCase();
    }

    public String[] getPosiciones(Tablero tablero){

        int[][] movimientos = {
                // Movimientos horizontales
                {0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {0, 6}, {0, 7},
                {0, -1}, {0, -2}, {0, -3}, {0, -4}, {0, -5}, {0, -6}, {0, -7},
                // Movimientos verticales
                {1, 0}, {2, 0}, {3, 0}, {4, 0}, {5, 0}, {6, 0}, {7, 0},
                {-1, 0}, {-2, 0}, {-3, 0}, {-4, 0}, {-5, 0}, {-6, 0}, {-7, 0}
        };

        String[] posiblesMovimientos = new String[28]; // Máximo de movimientos posibles para una torre
        int cont = 0;

        for (int[] movimiento : movimientos) {
            int nuevaFila = fila + movimiento[0];
            int nuevaColumna = columna + movimiento[1];
            if (tablero.esPosicionValida(nuevaFila, nuevaColumna)) {
                posiblesMovimientos[cont++] = tablero.obtenerPosicion(nuevaFila, nuevaColumna);
            }
        }

        // Filtrar movimientos
        return filtrarMovimientos(posiblesMovimientos, cont);
    }

    private String[] filtrarMovimientos(String[] movimientos, int num) {
        String[] filtrados = new String[num];
        System.arraycopy(movimientos, 0, filtrados, 0, num);
        return filtrados;
    }
}
