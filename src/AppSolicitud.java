import dispensador.CajeroAutomatico;
import javax.swing.JOptionPane;

public class AppSolicitud {
    public static void main(String[] args) throws Exception {
        CajeroAutomatico cajero = new CajeroAutomatico();
            int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad: "));
            cajero.dispensar(cantidad);
            }
        }
    

