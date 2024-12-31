import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al calculador de movimientos de ajedrez.");

        // Elegir pieza
        String pieza = "";
        while (true) {
            try {
                System.out.println("Elige una de las siguientes piezas: (Torre, Peon, Caballo, Alfil, Rey, Reina)");
                pieza = sc.nextLine().toLowerCase();
                if (pieza.equals("peon") || pieza.equals("torre") || pieza.equals("alfil") || pieza.equals("caballo") || pieza.equals("reina") || pieza.equals("rey")) {
                    break;
                } else {
                    System.out.println("Pieza no válida, por favor elija una de las opciones: Torre, Peon, Caballo, Alfil, Rey, Reina.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Intenta nuevamente.");
                sc.next(); // Limpiar el buffer
            }
        }

        // Elegir color
        String color = "";
        while (true) {
            try {
                System.out.println("Seleccione el color que desee: (Blanco/Negro)");
                color = sc.nextLine().toLowerCase();
                if (color.equals("blanco") || color.equals("negro")) {
                    break;
                } else {
                    System.out.println("Color no válido, por favor elija entre Blanco o Negro.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Intenta nuevamente.");
                sc.next(); // Limpiar el buffer
            }
        }

        // Elegir la posición de la pieza (columna)
        int columna = 0;
        while (true) {
            try {
                System.out.println("Introduce la columna de la pieza (A-H): ");
                char columnaChar = sc.next().charAt(0);
                if (columnaChar >= 'A' && columnaChar <= 'H') {
                    columna = columnaChar - 'A' + 1;
                    break;
                } else {
                    System.out.println("Columna no válida. Debe ser una letra entre A y H.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Intenta nuevamente.");
                sc.next(); // Limpiar el buffer
            }
        }

        // Elegir la fila
        int fila = 0;
        while (true) {
            try {
                System.out.println("Introduce el número de la fila de la pieza (1-8): ");
                fila = sc.nextInt();
                if (fila >= 1 && fila <= 8) {
                    break;
                } else {
                    System.out.println("Número de fila no válido. Debe estar entre 1 y 8.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Intenta nuevamente.");
                sc.next(); // Limpiar el buffer
            }
        }


        Tablero tablero = new Tablero();
        String piezaUnicode = "";
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
                //Instancia reina
                Reina reina= new Reina(columna, fila, color);
                System.out.println("Los movimientos posibles son: "+ Arrays.toString(reina.getPosiciones(tablero)));

                if (color.equals("blanco")){
                    piezaUnicode = "♛";
                }
                else piezaUnicode = "♕";
                System.out.println();
                // Usamos el tablero para imprimir una representación visual
                tablero.imprimirTablero(fila,columna,reina.getPosiciones(tablero),piezaUnicode);
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

