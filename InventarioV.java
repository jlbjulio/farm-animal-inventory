public class InventarioV extends Vaca{
    private int produccionLecheDiaria;
    
    public int getProduccionLecheDiaria() {
        return produccionLecheDiaria;
    }

    public int producirLeche() {
        produccionLecheDiaria += getProduccion();
        return produccionLecheDiaria;
    }

    public double venderLeche() {
        if (produccionLecheDiaria >= getVender())
            produccionLecheDiaria -= getVender();
        double ganancia = getVender() * 2.00;
        return ganancia;
    }

}