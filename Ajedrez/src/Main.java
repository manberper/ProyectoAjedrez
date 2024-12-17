public class Main {
    public static void main(String[] args) {
        tablero();
    }
    public static int extraeNumero(char letra){
        int numeroFila = letra - 'a' + 1;
        return numeroFila;
    }
    public static char extraeLetra(int numLetra){
        String letra = String.valueOf((char) ('a' + letra - 1));
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
