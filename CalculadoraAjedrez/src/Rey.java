import java.util.Scanner;

public class Rey {
    private int columna;
    private int fila;
    private String color;

    public Rey(int columna, int fila, String color) {
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

        //Una casilla hacia arriba
        if (fila>=1 && fila<8){
            System.out.println("¿Podemos avanzar a la casilla (" +(fila +1) + ", " +columna+")?(S/N)");
        String respuesta=sc.next();
            if (respuesta.equalsIgnoreCase("S")) {
                fila++;
            }
        } else {
            System.out.println("No se puede mover más arriba.");
        }

        //Una casilla hacia abajo
        if (fila>1 && fila<=8){
            System.out.println("¿Podemos retroceder a la casilla (" +(fila -1) + ", " +columna+")?(S/N)");
            String respuesta=sc.next();
            if (respuesta.equalsIgnoreCase("S")) {
                fila--;
            }
        } else {
            System.out.println("No se puede retroceder más.");
        }

        //Una casilla hacia la derecha
        if (columna>=1 && columna<8){
            System.out.println("¿Podemos avanzar a la casilla (" + fila + "," + (columna + 1) + ")? (S/N)");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("S")) {
                columna++;
            }
        } else {
            System.out.println("No se puede mover más hacia la derecha.");
        }

        //Una casilla hacia la izquierda
        if (columna>1 && columna<=8){
            System.out.println("¿Podemos movernos a la casilla (" + fila + "," + (columna - 1) + ")? (S/N)");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("S")) {
                columna--;
            }
        } else {
            System.out.println("No se puede mover más hacia la izquierda.");
        }

        //Una casilla movimiento diagonal arriba derecha
        if((fila>=1 && fila<8) && (columna>=1 && columna<8)){
            System.out.println("¿Podemos avanzar a la casilla ("+ (fila + 1) + "," + (columna + 1) + ")? (S/N)");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("S")) {
                fila++;
                columna++;
            }
        } else {
            System.out.println("No se puede mover más en esa diagonal.");
        }

        //Una casilla movimiento diagonal arriba izquierda
        if((fila>=1 && fila<8) && (columna>1 && columna<=8)){
            System.out.println("¿Podemos movernos a la casilla ("+ (fila + 1) + "," + (columna - 1) + ")? (S/N)");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("S")) {
                fila++;
                columna--;
            }
        } else {
            System.out.println("No se puede mover más en esa diagonal.");
        }

        //Una casilla movimiento diagonal abajo derecha
        if((fila>1 && fila<=8) && (columna>=1 && columna<8)){
            System.out.println("¿Podemos movernos a la casilla (" + (fila - 1) + "," + (columna + 1) + ")? (S/N)");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("S")) {
                fila--;
                columna++;
            }
        } else {
            System.out.println("No se puede mover más en esa diagonal.");
        }

        //Una casilla movimiento diagonal abajo izquierda
        if((fila>1 && fila<=8) && (columna>1 && columna<=8)){
            System.out.println("¿Podemos movernos a la casilla (" + (fila - 1) + "," + (columna - 1) + ")? (S/N)");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("S")) {
                fila--;
                columna--;
            }
        } else {
            System.out.println("No se puede mover más en esa diagonal.");
        }

        }
    }






