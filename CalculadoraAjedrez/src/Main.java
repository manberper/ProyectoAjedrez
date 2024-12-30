import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al calculador de movimientos de ajedrez.");

        //Elegir pieza
        System.out.println("Elige una de las siguientes piezas: (Torre, Peon, Caballo, Alfil, Rey, Reina)");
        String pieza = sc.nextLine().toLowerCase();

        //Elegir color
        System.out.println("Seleccione el color que desee: (Blanco/Negro)");
        String color = sc.nextLine().toLowerCase();

        //Elegir la posición
        System.out.println("Introduce la columna de la pieza (A-H): ");
        char columnaChar = sc.next().charAt(0);


        System.out.println("Introduce el número de la fila de la pieza (1-8): ");
        int fila = sc.nextInt();

        Tablero tablero = new Tablero();
        String piezaUnicode = "";
        int columna = columnaChar - 'a' + 1;
        switch (pieza) {
            case "peon":
                // Se importa la pieza y se imprimen los movimientos posibles
                Peon2 peon2= new Peon2(color, fila, columna);
                System.out.println("Los movimientos posibles son: "+ Arrays.toString(peon2.getPosiciones(tablero)));
                if (color.equals("blanco")){
                    piezaUnicode = "♟";
                }
                else piezaUnicode = "♙";
                System.out.println();
                // Usamos el tablero para imprimir una representación visual
                tablero.imprimirTablero(fila,columna,peon2.getPosiciones(tablero),piezaUnicode);

                break;

            case "torre":
                //Instancia torre
                Torre torre= new Torre(columna, fila, color);
                System.out.println("Los movimientos posibles son: "+ Arrays.toString(torre.getPosiciones(tablero)));
                if (color.equals("blanco")){
                    piezaUnicode = "♜";
                }
                else piezaUnicode = "♖";
                System.out.println();
                // Imprimir tablero con la pieza en la posición indicada
                tablero.imprimirTablero(fila, columna, torre.getPosiciones(tablero), piezaUnicode);
                break;

            case "alfil":
                //Instancia alfil
                Alfil alfil= new Alfil(color, fila, columna);
                System.out.println("Los movimientos posibles son: "+ Arrays.toString(alfil.getPosiciones(tablero)));
                if (color.equals("blanco")){
                    piezaUnicode = "♝";
                }
                else piezaUnicode = "♗";
                System.out.println();
                // Imprimir tablero con la pieza en la posición indicada
                tablero.imprimirTablero(fila, columna, alfil.getPosiciones(tablero), piezaUnicode);
                break;

            case "caballo":
                //Instancia caballo
                Caballo caballo= new Caballo(color, fila, columna);
                System.out.println("Los movimientos posibles son: "+ Arrays.toString(caballo.getPosiciones(tablero)));

                if (color.equals("blanco")){
                    piezaUnicode = "♞";
                }
                else piezaUnicode = "♘";
                System.out.println();
                // Usamos el tablero para imprimir una representación visual
                tablero.imprimirTablero(fila,columna,caballo.getPosiciones(tablero),piezaUnicode);

                break;

            case "reina":

                break;

            case "rey":
                //Instancia rey
                Rey rey = new Rey(columna, fila, color);
                System.out.println("Los movimientos posibles son: "+ Arrays.toString(rey.getPosiciones(tablero)));
                if (color.equals("blanco")){
                    piezaUnicode = "♚";
                }
                else piezaUnicode = "♔";
                System.out.println();
                // Usamos el tablero para imprimir una representación visual
                tablero.imprimirTablero(fila, columna, rey.getPosiciones(tablero), piezaUnicode);

                break;

            default:
                System.out.println("Pieza invalida");
                break;
        }
        }
    }

