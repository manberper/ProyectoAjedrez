public class MainPeon{
    public static void main(String[] args) {
        //Creamos los objetos, en este caso dos peones:
        Peon peonBlanco1 = new Peon("a4", "blanco");
        Peon peonNegro1 = new Peon("c7", "negro");

        //Calculamos e imprimimos los movimientos posibles de cada peón según su color y posición:
        System.out.println("Movimientos para el peón negro: ");
        imprimirArray(peonNegro1.calculaMovimiento());

        System.out.println("Movimientos para el peón blanco: ");
        imprimirArray(peonBlanco1.calculaMovimiento());
    }

    //Metodo para imprimir el array de los movimientos posibles:
    public static void imprimirArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
