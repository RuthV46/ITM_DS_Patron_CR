package dispensador;

public class Billete100000 implements IManejador {
    private IManejador siguiente;

    @Override
    public void setSiguiente(IManejador siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void procesarSolicitud(int cantidad) {
        if (cantidad >= 100000) {
            int numBilletes = cantidad / 100000;
            int resto = cantidad % 100000;
            System.out.println("Dispensando " + numBilletes + " billetes de $100.000");
            if (resto != 0 && siguiente != null) {
                siguiente.procesarSolicitud(resto);
            }
        } else if (siguiente != null) {
            siguiente.procesarSolicitud(cantidad);
        }
    }
}


