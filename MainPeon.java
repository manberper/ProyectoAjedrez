public class MainPeon{
    public static void main(String[] args) {
        Peon peonBlanco1 = new Peon("a4", "blanco");
        Peon peonNegro1 = new Peon("c7", "negro");

        System.out.println("Movimientos para el peón negro: ");
        String[] movimientosNegro1 = peonNegro1.calculaMovimiento();
        imprimirArray(movimientosNegro1);

        System.out.println("Movimientos para el peón blanco: ");
        String[] movimientosBlanco1 = peonBlanco1.calculaMovimiento();
        imprimirArray(movimientosBlanco1);
    }

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
