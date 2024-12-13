public class Main {
    public static void main(String[] args) {
        tablero();
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
