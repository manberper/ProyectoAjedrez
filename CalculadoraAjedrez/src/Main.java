import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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


        System.out.println("Introduce el número de la fila de la pieza (1-8): ");
        int num = sc.nextInt();


        switch (pieza) {
            case "peon":

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

                break;

            default:
                System.out.println("Pieza invalida");
                break;
        }

    }
}
