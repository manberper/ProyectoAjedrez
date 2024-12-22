public class Caballo {
    private String posicion;
    private String color;
    private char columna;
    private int fila;

    public Caballo(String posicion, String color) {
        this.posicion = posicion;
        this.color = color;
        this.columna = posicion.charAt(0);
        this.fila = Character.getNumericValue(posicion.charAt(1));

        if (fila < 0 || fila > 8 || columna > 'h') {
            throw new IllegalArgumentException("Posición fuera de los límites del tablero.");
        }
    }

    public String[] calculaMovimiento() {
        int[][] desplazamientos = {
                {2, 1}, {2, -1}, {-2, 1}, {-2, -1},
                {1, 2}, {1, -2}, {-1, 2}, {-1, -2}
        };

        String[] movimientosCaballo = new String[8];
        int contadorMovimientos = 0;

        int columnaActual = columna - 'a';
        int filaActual = this.fila;

        for (int[] movimientos : desplazamientos) {
            int nuevaColumna = columnaActual + movimientos[0];
            int nuevaFila = filaActual + movimientos[1];

            if (nuevaColumna >= 0 && nuevaColumna < 8 && nuevaFila >= 1 && nuevaFila <= 8) {
                char columnaFinal = (char) ('a' + nuevaColumna);
                movimientosCaballo[contadorMovimientos++] = columnaFinal + Integer.toString(nuevaFila);
            }
        }
        String[] movimientosValidos = new String[contadorMovimientos];
        System.arraycopy(movimientosCaballo, 0, movimientosValidos, 0, contadorMovimientos);

        return movimientosValidos;
    }
}
