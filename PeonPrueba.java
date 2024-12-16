public class PeonPrueba {
    private String posicion;
    private String color;
    private char columna;
    private int fila;

    public PeonPrueba(String posicion, String color) {
        this.posicion = posicion;
        this.color = color;
        this.columna = posicion.charAt(0);
        this.fila = Character.getNumericValue(posicion.charAt(1));

        if (fila < 0 || fila > 8 || columna < 'a' || columna > 'h') {
            throw new IllegalArgumentException("Posición fuera de los límites del tablero.");
        }
    }

    public String[] calculaMovimiento() {
        int numero = columna - 'a' + 1;
        int filaActual = this.fila;
        int contadorMovimientos = 0;

        if ((fila == 2 && color.equals("blanco")) || (fila == 7 && color.equals("negro"))) {
            contadorMovimientos = 2;
        } else {
            contadorMovimientos = 1;
            this.fila += 1;
        }

        String[] movimientos = new String[contadorMovimientos];
        filaActual += 1;
        movimientos[0] = String.valueOf((char) ('a' + numero - 1)) + filaActual;

        if (contadorMovimientos > 1) {
            filaActual += 1;
            movimientos[1] = String.valueOf((char) ('a' + numero - 1)) + filaActual;
            ;
        }
        return movimientos;
    }

    public static void print(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }
}