import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al calculador de movimientos de ajedrez.");

            //Elegir pieza
            System.out.println("Elige una de las siguientes piezas: (Torre, Peon, Caballo, Alfil, Rey, Reina");
            String pieza = sc.nextLine().toLowerCase();

            //Elegir color
            System.out.println("Seleccione el color que desee: (Blanco/Negro");
            String color = sc.nextLine().toLowerCase();

            //Elegir la posición
            System.out.println("Introduce la columna de la pieza (A-H): ");
            char columnaChar = sc.next().charAt(0);


            System.out.println("Introduce el número de la fila de la pieza (1-8): ");
            int fila = sc.nextInt();

        Tablero tablero = new Tablero();
        int columna = columnaChar - 'a' + 1;
            switch (pieza) {
                case "peon":
                    //Instancia peón
                    Peon peon= new Peon(color, fila, columna);
                    peon.movimientosPosibles();
                    break;

                case "torre":

                    break;

                case "alfil":
                    //Instancia alfil
                    Alfil alfil= new Alfil(columna, fila, color);
                    alfil.mostrarMovimientos();
                    break;

                case "caballo":
                    //Instancia caballo
                    Caballo caballo= new Caballo(color, fila, columna);

                    //Obtener posibles posiciones
                    String[] posicionesCaballo = caballo.getPosiciones(tablero);

                    // Mostrar las posiciones posibles
                    System.out.println("Las posiciones posibles para el caballo son:");
                    for (String posicion : posicionesCaballo) {
                        System.out.println(posicion);
                    }
                    break;

                case "reina":

                    break;

                case "rey":
                    //Instancia rey
                    Rey rey = new Rey(columna, fila, color);
                    rey.mostrarMovimientos();
                    break;

                default:
                    System.out.println("Pieza invalida");
                    break;
            }
        }
    }

