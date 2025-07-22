public class Animal {
    private String raza;
    private  int edad;
    private double peso;

    public String getRaza() {
        return raza;
    }
    public int getEdad() {
        return edad;
    }
    public double getPeso() {
        return peso;
    }

    public void asignar(String raza, int edad, double peso) {
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
    }

}
