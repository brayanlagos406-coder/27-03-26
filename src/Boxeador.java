public class Boxeador extends Atleta implements Evaluable{

    public  int golpesAcertados;
    public int peleasGanadas;

    public Boxeador() {
    }

    public Boxeador(String nombre, int edad, double horasEntrenamiento, int golpesAcertados, int peleasGanadas) {
        super(nombre, edad, horasEntrenamiento);
        this.golpesAcertados = golpesAcertados;
        this.peleasGanadas = peleasGanadas;
    }

    public int getGolpesAcertados() {
        return golpesAcertados;
    }

    public void setGolpesAcertados(int golpesAcertados) {
        this.golpesAcertados = golpesAcertados;
    }

    public int getPeleasGanadas() {
        return peleasGanadas;
    }

    public void setPeleasGanadas(int peleasGanadas) {
        this.peleasGanadas = peleasGanadas;
    }

    @Override
    public String toString() {
        return "Boxeador{" +
                "golpesAcertados=" + golpesAcertados +
                ", peleasGanadas=" + peleasGanadas +
                '}';
    }

    @Override
    public double calcularRendimiento() {
        return 0;
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
