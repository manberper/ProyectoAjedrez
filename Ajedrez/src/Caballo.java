public class Caballo {
    private final String color;
    private final int fila;
    private final int columna;

    public Caballo(String color, int fila, int columna) {
        this.color = color.toLowerCase();
        this.fila = fila;
        this.columna = columna;
    }

    public String[] getPosiciones(Tablero tablero) {
        int[][] movimientos = {
                {2, 1}, {2, -1}, {-2, 1}, {-2, -1},
                {1, 2}, {1, -2}, {-1, 2}, {-1, -2}
        };

        String[] posiblesMovimientos = new String[8];
        int index = 0;

        for (int[] movimiento : movimientos) {
            int nuevaFila = fila + movimiento[0];
            int nuevaColumna = columna + movimiento[1];
            if (tablero.esPosicionValida(nuevaFila, nuevaColumna)) {
                posiblesMovimientos[index++] = tablero.obtenerPosicion(nuevaFila, nuevaColumna);
            }
        }

        // Filtrar movimientos nulos
        return filtrarMovimientos(posiblesMovimientos, index);
    }

    private String[] filtrarMovimientos(String[] movimientos, int size) {
        String[] filtrados = new String[size];
        System.arraycopy(movimientos, 0, filtrados, 0, size);
        return filtrados;
    }
}
