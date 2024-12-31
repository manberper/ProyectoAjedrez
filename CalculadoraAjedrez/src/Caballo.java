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
