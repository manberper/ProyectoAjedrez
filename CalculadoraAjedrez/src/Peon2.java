public class Peon2 {
    private String color;
    private int fila;
    private int columna;

    public Peon2(String color, int fila, int columna) {
        this.color = color.toLowerCase();
        this.fila = fila;
        this.columna = columna;
    }

    public String[] getPosiciones(Tablero tablero) {
        int direccion = color.equals("blanco") ? 1 : -1;
        int filaInicio = color.equals("blanco") ? 2 : 7;

        String[] posiblesMovimientos = new String[2];
        int cont = 0;



        // Movimiento de 1 casilla
        if (tablero.esPosicionValida(fila + direccion, columna)) {
            posiblesMovimientos[cont++] = tablero.obtenerPosicion(fila + direccion, columna);
        }

        // Movimiento de 2 casillas desde la fila inicial
        if (fila == filaInicio && tablero.esPosicionValida(fila + 2 * direccion, columna)) {
            posiblesMovimientos[cont++] = tablero.obtenerPosicion(fila + 2 * direccion, columna);
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