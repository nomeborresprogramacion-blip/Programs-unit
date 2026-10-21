package Clase;

/**
 *
 * @author ITM-10339
 */
public class ClaseImpresoraEpson extends Thread {
    private int cantidadPaginas;
    private int tipoImpresion; 

    
    public ClaseImpresoraEpson(String nombreHilo, int cantidadPaginas, int tipoImpresion) {
        super(nombreHilo);
        this.cantidadPaginas = cantidadPaginas;
        this.tipoImpresion = tipoImpresion;
    }

    @Override
    public void run() {
        double tiempoImpresion = 0.0;
        String tipoStr = "";

        if (tipoImpresion == 1) {
            tiempoImpresion = (double) cantidadPaginas / 11.0;
            tipoStr = "Blanco y Negro";
        } else if (tipoImpresion == 2) {
            tiempoImpresion = (double) cantidadPaginas / 5.0;
            tipoStr = "Color";
        }

        System.out.println("[EPSON] Hilo: " + this.getName() 
            + " | Tipo: " + tipoStr 
            + " | Paginas: " + cantidadPaginas 
            + " | Tiempo estimado: " + String.format("%.2f", tiempoImpresion) + " minutos");
    }
}

