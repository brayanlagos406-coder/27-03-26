public class Voleibolista extends Atleta implements Evaluable{

    private int saquesEfectivos;
    private int bloqueos;

    public Voleibolista() {
    }



    public Voleibolista(String nombre, int edad, double horasEntrenamiento, int saquesEfectivos, int bloqueos) {
        super(nombre, edad, horasEntrenamiento);
        this.saquesEfectivos = saquesEfectivos;
        this.bloqueos = bloqueos;
    }

    public int getSaquesEfectivos() {
        return saquesEfectivos;
    }

    public void setSaquesEfectivos(int saquesEfectivos) {
        this.saquesEfectivos = saquesEfectivos;
    }

    public int getBloqueos() {
        return bloqueos;
    }

    public void setBloqueos(int bloqueos) {
        this.bloqueos = bloqueos;
    }

    @Override
    public String toString() {
        return "Voleibolista{" +
                "saquesEfectivos=" + saquesEfectivos +
                ", bloqueos=" + bloqueos +
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
