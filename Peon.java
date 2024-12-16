public class Peon {
    private String posicion;
    private String color;
    private char columna;
    private int fila;

    //Constructor. Se le pide al usuario la posición y el color.
    public Peon(String posicion, String color) {
        this.posicion = posicion;
        this.color = color;
        //Se asignan valores a las variables columna y fila con los datos que nos da el usuario.
        this.columna = posicion.charAt(0);
        this.fila = Character.getNumericValue(posicion.charAt(1));
        //Comprobar que no se introduzca ningún valor fuera del rango del tablero.
        if (fila < 0 || fila > 8 || columna > 'h') {
            throw new IllegalArgumentException("Posición fuera de los límites del tablero.");
        }
    }

    public String[] calculaMovimiento() {
        //Variable número para convertir la letra de la columna tipo String en int:
        int numeroFila = columna - 'a' + 1;
        /*Explicación de la variable numeroFila:
        'a' = 97, 'b' = 98, 'c' = 99, etc.
        columna = 'c'
        99 - 97 + 1 = 3
        numero = 3 / Pasa de 'c' a 3.*/

        int filaActual = this.fila;
        int contadorMovimientos = 0;

        //Comprobar cantidad de movimientos posibles:
        if ((filaActual == 2 && color.equalsIgnoreCase("blanco")) || (filaActual == 7 && color.equalsIgnoreCase("negro"))) {
            contadorMovimientos = 2;
        } else {
            contadorMovimientos = 1;
        }

        String[] movimientos = new String[contadorMovimientos];
        if (color.equalsIgnoreCase("blanco")) {
            filaActual += 1;
        } else {
            filaActual -= 1;
        }

        movimientos[0] = String.valueOf((char) ('a' + numeroFila - 1)) + filaActual;
        /*Explicación de ('a' + numeroFila - 1) para pasar la columna de número a letra:
        'a' = 97 | numeroFila = 2
        97 + 2 - 1 = 98
        98 = 'b' | La fila número 2 es la b*/

        if (contadorMovimientos > 1) {
            if (color.equalsIgnoreCase("blanco")) {
                filaActual += 1;
            } else {
                filaActual -= 1;
            }
            movimientos[1] = String.valueOf((char) ('a' + numeroFila - 1)) + filaActual;
        }
        return movimientos;
    }
}
