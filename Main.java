public class Main {
    public static void main(String[] args) {
        PeonPrueba peonBlanco1 = new PeonPrueba("a2", "blanco");
        PeonPrueba peonNegro1 = new PeonPrueba("c7", "negro");

        System.out.println("Movimientos para el peón negro: ");
        String[] movimientosNegro1 = peonNegro1.calculaMovimiento();
        PeonPrueba.print(movimientosNegro1);
    }
}
