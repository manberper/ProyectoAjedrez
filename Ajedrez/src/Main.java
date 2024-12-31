import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tablero tablero = new Tablero();

        System.out.println("Bienvenido al calculador de movimientos de ajedrez.");

        // Se elige una pieza
        System.out.println("Selecciona una pieza (Peon, Torre, Alfil, Caballo, Reina, Rey): ");
        String pieza = sc.nextLine().toLowerCase();

        // Se elige un color
        System.out.println("Selecciona un color (Blanco, Negro)");
        String color = sc.nextLine().toLowerCase();

        // Se elige la posición de la pieza
        System.out.println("Introduce la columna de la pieza (A-H): ");
        char letra = sc.next().charAt(0);

        int numeroLetra = extraeNumero(letra);

        System.out.println("Introduce el número de la fila de la pieza (1-8): ");
        int num = sc.nextInt();

        switch (pieza) {
            case "peon":

                String numLetra = Integer.toString(numeroLetra);
                String numNum = Integer.toString(num);

                Peon peon = new Peon("color", numeroLetra, num);

                String[] setPeon = {"peon", "color", numLetra, numNum};
//                System.out.println(setPeon[2]);
//                System.out.println(setPeon[3]);
                tablero.setTablero(setPeon);

                System.out.println(Arrays.toString(peon.movimientosPosibles()));
               // System.out.println(Arrays.deepToString(tablero.getTablero(numeroLetra, num)));

                break;

            case "torre":

                break;

            case "alfil":

                break;

            case "caballo":

                break;

            case "reina":

                break;

            case "rey":
                //Tablero posicion = new Tablero();
                //System.out.println(posicion.getPosicion(7, 4));
                break;

            case "1":


            default:
                System.out.println("Pieza invalida");
                break;
        }

    }
    public static int extraeNumero(char letra){
        int numeroFila = letra - 'a' + 1;
        return numeroFila;
    }
    public static char extraeLetra(int numLetra){
        String letra = String.valueOf((char) ('a' + numLetra - 1));
        int letraInt = Integer.parseInt(letra);
        char letrafinal = (char) letraInt;

        return letrafinal;
    }
    public static void tablero() {
        // Imprimir la cabecera de las columnas
        System.out.print("   ");
        for (char col = 'A'; col <= 'H'; col++) {
            System.out.print("  " + col);
        }
        System.out.println("\n   +------------------------+");

        // Imprimir cada fila del tablero
        for (int row = 8; row >= 1; row--) {
            System.out.print(row + " | ");
            for (char col = 'A'; col <= 'H'; col++) {
                if ((row + col) % 2 == 0) {
                    System.out.print(" ■ ");
                } else {
                    System.out.print(" □ ");
                }
            }
            System.out.println(" |");
        }

        // Imprimir el pie de las filas
        System.out.println("   +------------------------+");
    }
}