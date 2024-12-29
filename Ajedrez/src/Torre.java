import java.util.Scanner;

public class Torre {

    private int columna;
    private int fila;
    private String color;

    public Torre(int columna) {
        this.columna = columna;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mostrarMovimientos(){

        Tablero tablero = new Tablero();
        Scanner sc = new Scanner(System.in);

        //Movimiento horizontal
        for (int i = fila; i <8;i++) {
            for (int j = columna; j < 8; j++) {

                System.out.println("¿Podemos avanzar?(S/N)");
                i++;
            }
        }

        //Movimiento vertical
        for (int i = fila; i <8;i++) {
            for (int j = columna; j < 8; j++) {

                System.out.println("¿Podemos avanzar?(S/N)");
                j++;
            }
        }

    }
}
