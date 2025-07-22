public class Gallina extends Animal {

    private int numGallinas;
    private int venderH;
    private int recolectarH;
    private int[] historialProduccionHuevos;

    public void asignar(int numGallinas) {
        this.numGallinas = numGallinas;

    }
    public void asignarR(int recolectarH) {
        this.recolectarH = recolectarH;
    }
    
    public void asingarV(int venderH) {
        this.venderH = venderH;
    }
    public void recolectarH(int recolectarH) {
        this.recolectarH = recolectarH;
    }

    public Gallina() {
        historialProduccionHuevos = new int[numGallinas];
    }

    public void asignarHistorial(int[] historialProduccionHuevos) {
        this.historialProduccionHuevos = historialProduccionHuevos;
    }

    public int[] getHistorialProduccionHuevos() {
        return historialProduccionHuevos;
    }

    public int total() {
        int total = 0;
        for (int i = 0; i < historialProduccionHuevos.length; i++) {
            total = total + historialProduccionHuevos[i];
        }
        return total;
    }

    public int getNumGallinas() {
        return numGallinas;
    }

    
    public int getVenderH() {
        return venderH;
    }

    public int getRecolectarH() {
        return recolectarH;
    }

}
