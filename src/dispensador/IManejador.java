package dispensador;

public interface IManejador {
    void setSiguiente(IManejador siguiente);
    void procesarSolicitud(int cantidad);

}
