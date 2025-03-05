package dispensador;
//Manejador Base
public class CajeroAutomatico {
        private IManejador cadena;
    
        public CajeroAutomatico() {
            // Crear la cadena de responsabilidad
            IManejador billete100000 = new Billete100000();
            IManejador billete50000 = new Billete50000();
            IManejador billete20000 = new Billete20000();
            IManejador billete10000 = new Billete10000();
            IManejador billete5000 = new Billete5000();
    
            // Configurar la cadena
            billete100000.setSiguiente(billete50000);
            billete50000.setSiguiente(billete20000);
            billete20000.setSiguiente(billete10000);
            billete10000.setSiguiente(billete5000);
    
            this.cadena = billete100000; // La cabeza de la cadena
        }
    
        public void dispensar(int cantidad) {
            if (cantidad % 5000 != 0) {
                System.out.println("Error: La cantidad debe ser un múltiplo de 5.000.");
                return;
            }
            cadena.procesarSolicitud(cantidad);
        }
    }


