public class Reina {
        private int columna;
        private int fila;
        private String color;

        public Reina(int columna, int fila, String color) {
            this.columna = columna;
            this.fila = fila;
            this.color = color;
        }

        public String[] getPosiciones(Tablero tablero) {
            String[] posiblesMovimientos = new String[27]; // 7 movimientos en cada dirección (vertical, horizontal y diagonal)
            int cont = 0;

            // Direcciones de los posibles movimientos de la Reina (horizontal, vertical, diagonal)
            int[] filasMovimiento = {-1, 1, 0, 0, -1, -1, 1, 1}; // Movimientos en las filas
            int[] columnasMovimiento = {0, 0, -1, 1, -1, 1, -1, 1}; // Movimientos en las columnas

            // Mover en todas las direcciones posibles (horizontal, vertical, diagonal)
            for (int i = 0; i < 8; i++) {
                int nuevaFila = fila;
                int nuevaColumna = columna;

                // Mover en esa dirección hasta que llegue al límite del tablero o encuentre una casilla no válida
                while (true) {
                    nuevaFila += filasMovimiento[i];
                    nuevaColumna += columnasMovimiento[i];

                    // Comprobar si la nueva posición es válida
                    if (tablero.esPosicionValida(nuevaFila, nuevaColumna)) {
                        posiblesMovimientos[cont++] = tablero.obtenerPosicion(nuevaFila, nuevaColumna);
                    } else {
                        break;
                    }
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


