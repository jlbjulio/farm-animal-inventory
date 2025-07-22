public class InventarioG extends Gallina {
    
    private int inventarioHuevosIsa;
    private int inventarioHuevosLoh;
    private int inventarioHuevosCa;

    public int getInventarioHuevosIsa() {
        return inventarioHuevosIsa;
    }

    public int getInventarioHuevosLoh() {
        return inventarioHuevosLoh;
    }

    public int getInventarioHuevosCa() {
        return inventarioHuevosCa;
    }

    public int recolectarHuevosIsa() {
        inventarioHuevosIsa += getRecolectarH();
        return inventarioHuevosIsa;
    }

    public int recolectarHuevosLoh() {
        inventarioHuevosLoh += getRecolectarH();
        return inventarioHuevosLoh;
    }

    public int recolectarHuevosCa() {
        inventarioHuevosCa += getRecolectarH();
        return inventarioHuevosCa;
    }

    public double venderHuevosIsa() {
        double ganancia = 0;

        if (inventarioHuevosIsa >= getVenderH()) {
            inventarioHuevosIsa -= getVenderH();
            ganancia = getVenderH() * 4.50;
        }
        return ganancia;
    }

    public double venderHuevosLoh() {
        double ganancia = 0;

        if (inventarioHuevosLoh >= getVenderH()) {
            inventarioHuevosLoh -= getVenderH();
            ganancia = getVenderH() * 6.00;
        }
        return ganancia;
    }

    public double venderHuevosCa() {
        double ganancia = 0;

        if (inventarioHuevosCa >= getVenderH()) {
            inventarioHuevosCa -= getVenderH();
            ganancia = getVenderH() * 12.00;
        }
        return ganancia;
    }

}
