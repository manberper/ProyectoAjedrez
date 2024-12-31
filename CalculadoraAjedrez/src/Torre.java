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
                //Posibles movimientos horizontales y verticales.
                {0,1} , {0,2} , {0,3} , {0,4} , {0,5} , {0,6} , {0,7} ,

                {1,0} , {2,0} , {3,0} , {4,0} , {5,0} , {6,0} , {7,0}
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
