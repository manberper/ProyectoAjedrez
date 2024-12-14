public class PeonPrueba {
    private String posicion;
    private String color;
    private char columna = posicion.charAt(0);
    private int fila = posicion.charAt(1);

    public PeonPrueba(String posicion, String color) {
        if (fila < 0 || fila > 7 || columna < 0 || columna > 7) {
            throw new IllegalArgumentException("Posición fuera de los límites del tablero.");
        }

        this.posicion = posicion;
        this.color = color;
    }

    public String[] calculaMovimiento() {
        int numero = Integer.MAX_VALUE;

        switch (columna) {
            case 'a':
                numero = 1;
                break;
            case 'b':
                numero = 2;
                break;
            case 'c':
                numero = 3;
                break;
            case 'd':
                numero = 4;
                break;
            case 'e':
                numero = 5;
                break;
            case 'f':
                numero = 6;
                break;
            case 'g':
                numero = 7;
                break;
            case 'h':
                numero = 8;
                break;
        }

        String posicionNumeros = Integer.toString(numero) + Integer.toString(fila);
        int contadorMovimientos = 0;

        if (fila == 2 && color.equals("blanco") || fila == 7 && color.equals("negro")) {
            contadorMovimientos = 2;
        } else {
            contadorMovimientos = 1;
        }

        String[] movimientos = new String[contadorMovimientos];

        return movimientos;
    }
}