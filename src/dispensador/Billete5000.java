package dispensador;

public class Billete5000 implements IManejador {
    private IManejador siguiente;

    @Override
    public void setSiguiente(IManejador siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void procesarSolicitud(int cantidad) {
        if (cantidad >= 5000) {
            int numBilletes = cantidad / 5000;
            int resto = cantidad % 5000;
            System.out.println("Dispensando " + numBilletes + " billetes de $5.000");
            if (resto != 0 && siguiente != null) {
                siguiente.procesarSolicitud(resto);
            }
        } else if (siguiente != null) {
            siguiente.procesarSolicitud(cantidad);
        }
    }
}
