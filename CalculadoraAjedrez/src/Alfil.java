import java.sql.SQLOutput;
import java.util.Scanner;

public class Alfil {
    private int columna;
    private int fila;
    private String color;

    public Alfil(int columna, int fila, String color) {
        this.columna = columna;
        this.fila = fila;
        this.color = color;
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

    public void mostrarMovimientos() {
        Tablero tablero = new Tablero();
        Scanner sc = new Scanner(System.in);


        for (int i=fila; i<8; i++){
            for (int j=columna; i<8; j++){
                fila++;
                columna++;
                System.out.println("¿Podemos avanzar?(S/N)");
            }

        }
        for (int i =fila; i<8; i++){
            for (int j=columna; i<8; j++){
                fila++;
                columna--;
                System.out.println("¿Podemos avanzar?(S/N)");
            }
        }
        for (int i =fila; i<8; i++){
            for (int j=columna; i<8; j++){
                fila--;
                columna++;
                System.out.println("¿Podemos avanzar?(S/N)");
            }
        }
        for (int i =fila; i<8; i++){
            for (int j=columna; i<8; j++){
                fila--;
                columna--;
                System.out.println("¿Podemos avanzar?(S/N)");
            }
        }
    }
}



