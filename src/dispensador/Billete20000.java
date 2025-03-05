package dispensador;

public class Billete20000 implements IManejador {
    private IManejador siguiente;

    @Override
    public void setSiguiente(IManejador siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void procesarSolicitud(int cantidad) {
        if (cantidad >= 20000) {
            int numBilletes = cantidad / 20000;
            int resto = cantidad % 20000;
            System.out.println("Dispensando " + numBilletes + " billetes de $20.000");
            if (resto != 0 && siguiente != null) {
                siguiente.procesarSolicitud(resto);
            }
        } else if (siguiente != null) {
            siguiente.procesarSolicitud(cantidad);
        }
    }
}
