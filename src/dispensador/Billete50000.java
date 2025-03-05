package dispensador;

public class Billete50000 implements IManejador {
    private IManejador siguiente;

    @Override
    public void setSiguiente(IManejador siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void procesarSolicitud(int cantidad) {
        if (cantidad >= 50000) {
            int numBilletes = cantidad / 50000;
            int resto = cantidad % 50000;
            System.out.println("Dispensando " + numBilletes + " billetes de $50.000");
            if (resto != 0 && siguiente != null) {
                siguiente.procesarSolicitud(resto);
            }
        } else if (siguiente != null) {
            siguiente.procesarSolicitud(cantidad);
        }
    }
}


