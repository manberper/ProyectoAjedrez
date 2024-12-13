public class Peon {
    private String posicion;
    private String color;

    public Peon(String posicion, String color) {
        this.posicion = posicion;
        this.color = color;
    }


    public String[] movimiento(String posicion, String color) {
        char distancia = posicion.charAt(0);
        int altura = posicion.charAt(1);
        int numero = Integer.MAX_VALUE;

        switch (distancia) {
            case 'a':
                numero = 1;
                break;
            case 'b':
                numero = 2;
                break;
            case 'c':
                numero = 3;
                break;
            case 'd':
                numero = 4;
                break;
            case 'e':
                numero = 5;
                break;
            case 'f':
                numero = 6;
                break;
            case 'g':
                numero = 7;
                break;
            case 'h':
                numero = 8;
                break;

        }

        String posicionNumeros = Integer.toString(numero) + Integer.toString(altura);
        int contadorMovimientos = 0;

        if (altura == 2 && color.equals("blanco") || altura == 7 && color.equals("negro")) {
            contadorMovimientos += 2;
        } else {
            contadorMovimientos = 1;
        } ;

        String[] movimientos = new String[contadorMovimientos];

    return movimientos;
    }
}
