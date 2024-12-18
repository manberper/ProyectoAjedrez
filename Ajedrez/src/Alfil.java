import java.util.Scanner;

public class Alfil {
    private String color;
    private int columna;
    private int fila;
    private final int tamtablero = 8;

    public Alfil(String color, int columna, int fila) {
        this.color = color;
        this.columna = columna;
        this.fila = fila;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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

    public void movimientosPosibles(){
        Scanner sc = new Scanner(System.in);
        Tablero tablero = new Tablero();


       for (int i = fila; i < 8;i++){
           for (int j = columna; j <8;i++) {

               fila++;
               columna++;
               System.out.println("¿Se puede avanzar en la siguiente posición?(S/N)");
               g
           }
       }

       for (int i = fila; i <8;i++){
           for (int j = columna;i <8;i++) {

               fila++;
               columna--;
               System.out.println("¿Se puede avanzar en la siguiente posición?(S/N)");

           }
       }

        for (int i = fila; i <8;i++){
            for (int j = columna;i <8;i++) {

                fila--;
                columna--;
                System.out.println("¿Se puede avanzar en la siguiente posición?(S/N)");


            }
        }

        for (int i = fila; i <8;i++){
            for (int j = columna;i <8;i++) {

                fila--;
                columna++;
                System.out.println("¿Se puede avanzar en la siguiente posición?(S/N)");

            }
        }


    }
}


