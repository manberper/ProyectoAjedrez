
public class Tablero {
   String[][] posicion = {
            {"A8", "B8", "C8", "D8", "E8", "F8", "G8", "H8"},
            {"A7", "B7", "C7", "D7", "E7", "F7", "G7", "H7"},
            {"A6", "B6", "C6", "D6", "E6", "F6", "G6", "H6"},
            {"A5", "B5", "C5", "D5", "E5", "F5", "G5", "H5"},
            {"A4", "B4", "C4", "D4", "E4", "F4", "G4", "H4"},
            {"A3", "B3", "C3", "D3", "E3", "F3", "G3", "H3"},
            {"A2", "B2", "C2", "D2", "E2", "F2", "G2", "H2"},
            {"A1", "B1", "C1", "D1", "E1", "F1", "G1", "H1"}
    };
//
//
//
    private String[][] tablero = new String[8][8];
//
//    public Tablero() {
//    }
//
//
    public String[][] getTablero(int x, int y) {
        return tablero;
    }
//
//    public void setTablero(String[] pieza) {
//        //     String peon = new String(pieza, color, extraeLetra(letra), num);
//       String nombre = pieza[0];
//       String color = pieza[1];
//       int numLetra = Integer.parseInt(pieza[2]);
//       int numero = Integer.parseInt(pieza[3]);
//
//       tablero[numLetra][numero] = pieza[0];
//
//    }
//
     public String getPosicion(int x, int y) {
     return posicion[x][y];
     }


    private final String[][] posiciones;

    public Tablero() {
        posiciones = new String[8][8];
        inicializarTablero();
    }

    private void inicializarTablero() {
        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 8; columna++) {
                posiciones[fila][columna] = (char) ('A' + columna) + String.valueOf(fila + 1);
            }
        }
    }

    public boolean esPosicionValida(int fila, int columna) {
        return fila >= 1 && fila <= 8 && columna >= 1 && columna <= 8;
    }

    public String obtenerPosicion(int fila, int columna) {
        if (esPosicionValida(fila, columna)) {
            return posiciones[fila - 1][columna - 1];
        }
        return null;
    }

    public void imprimirTablero(int filaPieza, int columnaPieza, String[] movimientos, String simboloPieza) {
        char[][] tableroVisual = new char[8][8];

        // Inicializar el tablero vacío con casillas alternadas
        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 8; columna++) {
                tableroVisual[fila][columna] = ((fila + columna) % 2 == 0) ? '□' : '■'; // Unicode para cuadros blancos y negros
            }
        }

        // Colocar la pieza en el tablero
        tableroVisual[filaPieza - 1][columnaPieza - 1] = simboloPieza.charAt(0);

        // Marcar los movimientos posibles
        for (String movimiento : movimientos) {
            int columna = movimiento.charAt(0) - 'A';
            int fila = Character.getNumericValue(movimiento.charAt(1)) - 1;
            tableroVisual[fila][columna] = 'X';
        }

        // Imprimir la representación visual del tablero
        for (int fila = 7; fila >= 0; fila--) {
            for (int columna = 0; columna < 8; columna++) {
                System.out.print(tableroVisual[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}