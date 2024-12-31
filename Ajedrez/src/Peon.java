import java.util.Scanner;

public class Peon {
    private String posicion;
    private String color;
    private int columna;
    private int fila;

    public Peon(String color, int columna, int fila) {
        this.color = color;
        this.columna = columna;
        this.fila = fila;
    }

    //    //Constructor. Se le pide al usuario la posición y el color.
//    public Peon(String posicion, String color) {
//        this.posicion = posicion;
//        this.color = color;
//        //Se asignan valores a las variables columna y fila con los datos que nos da el usuario.
//        this.columna = posicion.charAt(0);
//        this.fila = Character.getNumericValue(posicion.charAt(1));
//        //Comprobar que no se introduzca ningún valor fuera del rango del tablero.
//        if (fila < 0 || fila > 8 || columna > 'h') {
//            throw new IllegalArgumentException("Posición fuera de los límites del tablero.");
//        }
//    }

    public int[] movimientosPosibles(){
        Tablero tablero = new Tablero();
        Scanner sc = new Scanner(System.in);
        int filaActual = this.fila;
        int columnaActual = this.columna;
        int contador = 0;

        //Comprobar cantidad de movimientos posibles:
        if ((filaActual == 2 && color.equalsIgnoreCase("blanco")) || (filaActual == 7 && color.equalsIgnoreCase("negro"))) {
//            System.out.println("Primer movimiento del peon, deseas avanzar 1 o 2 casillas?");
//            contador = sc.nextInt();
            if (color.equals("blanco")){
                System.out.println("Las posiciones posibles desde la posición actual son:");
                System.out.print(tablero.getPosicion(columnaActual +2,filaActual+2));
                System.out.print(tablero.getPosicion(columnaActual +1,filaActual+1));
            } else if (color.equals("negro")) {
                System.out.println("Las posiciones posibles desde la posición actual son:");
                System.out.print(tablero.getPosicion(columnaActual -2,filaActual -2));
                System.out.print(tablero.getPosicion(columnaActual -1,filaActual -1));
            }
        } else {
            System.out.println("Las posiciones posibles desde la posición actual son:");
            System.out.print(tablero.getPosicion(columnaActual +1,filaActual+1));
        }
        int [] movimientos = new int[2];


        if (tablero.getTablero(columnaActual, filaActual + contador) == null){
            System.out.println(tablero.getTablero(columnaActual,filaActual+contador));
            if (tablero.getTablero(columnaActual, filaActual + 1) == null){
                System.out.println(tablero.getTablero(columnaActual,filaActual+1));
                movimientos[0] = columnaActual;
                movimientos[1] = filaActual+contador;
            }
        }



        return movimientos;

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