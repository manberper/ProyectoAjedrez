import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static String pieza() {
        Scanner sc = new Scanner(System.in);
        String pieza = "";
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println("""
                        Elige una pieza:
                        Alfil ♝♗
                        Caballo ♞♘
                        Peon ♟♙
                        Torre ♜♖
                        Reina ♛♕
                        Rey ♚♔""");

                pieza = sc.nextLine().toLowerCase();

                // String para el control de fallos
                String[] piezasValidas = {"alfil", "caballo", "peon", "torre", "reina", "rey"};
                boolean esValida = false;
                for (String i : piezasValidas) {
                    if (pieza.equals(i)) {
                        esValida = true;
                        break;
                    }
                }

                if (esValida) {
                    entradaValida = true; // Si es true se cierra el bucle
                } else {
                    System.out.println("Pieza no válida, por favor elija una de las opciones: Alfil, Caballo, Peon, Torre, Reina, Rey.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Intenta nuevamente.");
                sc.next(); // Limpia buffer (si se quita se rompe)
            }
        }
        return pieza;
    }
    public static String color() {
        Scanner sc = new Scanner(System.in);
        String color = "";
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println("Seleccione el color que desee: (Blanco/Negro)");
                color = sc.nextLine().toLowerCase(); // Convertir la entrada a minúsculas

                if (color.equals("blanco") || color.equals("negro")) {
                    entradaValida = true; // Si es true termina el bucle
                } else {
                    System.out.println("Color no válido, por favor elija entre Blanco o Negro.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Intenta nuevamente.");
                sc.next(); // Limpia buffer (si se quita se rompe)(
            }
        }
        return color;
    }
    public static int columna() {
        Scanner sc = new Scanner(System.in);
        int columna = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println("Introduce la columna de la pieza (A-H): ");
                String colStr = sc.nextLine().trim(); // con trim quitamos espacios

                if (colStr.length() == 1) {
                    char columnaChar = Character.toUpperCase(colStr.charAt(0));

                    if (columnaChar >= 'A' && columnaChar <= 'H') {
                        columna = columnaChar - 'A' + 1; // Convierte la letra a número del 1 al 8
                        entradaValida = true;
                    } else {
                        System.out.println("Columna no válida. Debe ser una letra entre A y H.");
                    }
                } else {
                    System.out.println("Entrada no válida. Por favor, ingrese una sola letra entre A y H.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Intenta nuevamente.");
                sc.next(); // Limpia el bufer (no quitar)
            }
        }
        return columna;
    }
    public static int fila() {
        Scanner sc = new Scanner(System.in);
        int fila = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println("Seleccione una fila (de 1 a 8):");
                fila = sc.nextInt();

                if (fila >= 1 && fila <= 8) {
                    entradaValida = true; // true cierra el bucle
                } else {
                    System.out.println("Entrada no válida. Por favor ingrese un número entre 1 y 8.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Intenta nuevamente.");
                sc.next(); // Limpia buffer (si se quita se rompe)
            }
        }
        return fila;
    }

    public static void main(String[] args) {
        System.out.println("Bienvenido al calculador de movimientos de ajedrez.");

        // Elegir pieza
        String pieza = pieza();

        // Elegir color
        String color = color();

        // Elegir la posición de la pieza (columna)
        int columna = columna();

        // Elegir la fila
        int fila = fila();

        Tablero tablero = new Tablero();
        String piezaUnicode;
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
