public class Vaca extends Animal {
    private int cantidad;
    private int produccion;
    private int vender;
    
    public int getVender() {
        return vender;
    }

    public int getProduccion() {
        return produccion;
    }

    public void asignar(int n) {
        cantidad = n;
        
    }

    public void asignarProduccion(int n) {
        produccion = n;
    }

    public void asignarVender(int n) {
        vender = n;
    }
    
    public int getCantidad() {
        return cantidad;
    }

}
