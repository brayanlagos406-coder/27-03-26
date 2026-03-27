public class Ciclista extends Atleta implements Evaluable{

    private double kilometrosRecorridos;
    private double tiempoHoras;

    public Ciclista() {
    }

    public Ciclista(String nombre, int edad, double horasEntrenamiento, double kilometrosRecorridos, double tiempoHoras) {
        super(nombre, edad, horasEntrenamiento);
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.tiempoHoras = tiempoHoras;
    }



    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public double getTiempoHoras() {
        return tiempoHoras;
    }

    public void setTiempoHoras(double tiempoHoras) {
        this.tiempoHoras = tiempoHoras;
    }

    @Override
    public String toString() {
        return "Ciclista{" +
                "kilometrosRecorridos=" + kilometrosRecorridos +
                ", tiempoHoras=" + tiempoHoras +
                '}';
    }

    @Override
    public double calcularRendimiento() {
        return kilometrosRecorridos / tiempoHoras;
    }

    @Override
    public String clasificarNivel() {
        return "";
    }

    @Override
    public double calcularBono() {
        return 0;
    }






}
