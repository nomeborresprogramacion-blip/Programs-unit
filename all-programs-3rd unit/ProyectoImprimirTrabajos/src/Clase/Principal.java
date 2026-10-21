package Clase;

/**
 * 
 * 20 Oct 2026
 */
public class Principal {
    
    public static void main(String[] args) {
        
        ClaseImpresoraEpson HiloImpresoraEpsonLote1 = new ClaseImpresoraEpson("Hilo-1 (Lote1)", 115, 1);
        ClaseImpresoraEpson HiloImpresoraEpsonLote2 = new ClaseImpresoraEpson("Hilo-2 (Lote2)", 120, 2);
        
        ClaseImpresoraHP HiloImpresoraHPLote1 = new ClaseImpresoraHP("Hilo-3 (Lote3)", 170, 1);
        ClaseImpresoraHP HiloImpresoraHPLote2 = new ClaseImpresoraHP("Hilo-4 (Lote4)", 410, 2);

        HiloImpresoraEpsonLote1.start();
        HiloImpresoraEpsonLote2.start();
        HiloImpresoraHPLote1.start();
        HiloImpresoraHPLote2.start();
    }
}

