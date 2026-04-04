import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Atleta> lstAtletas = new ArrayList<>();

        int opcion;

        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Registrar Ciclista");
            System.out.println("2. Registrar Boxeador");
            System.out.println("3. Registrar Voleibolista");
            System.out.println("4. Mostrar todos los atletas");
            System.out.println("5. Mostrar mejor atleta");
            System.out.println("6. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("Nombre:");
                    String nombre = sc.nextLine();

                    System.out.println("Edad:");
                    int edad = sc.nextInt();

                    System.out.println("Horas entrenamiento:");
                    double horas = sc.nextDouble();

                    System.out.println("Kilómetros recorridos:");
                    double km = sc.nextDouble();

                    System.out.println("Tiempo en horas:");
                    double tiempo = sc.nextDouble();

                    lstAtletas.add(new Ciclista(nombre, edad, horas, km, tiempo));
                    break;

                case 2:
                    System.out.println("Nombre:");
                    String nombre1 = sc.nextLine();

                    System.out.println("Edad:");
                    int edad1 = sc.nextInt();

                    System.out.println("Horas entrenamiento:");
                    double horas1 = sc.nextDouble();

                    System.out.println("Golpes acertados:");
                    int golpes = sc.nextInt();

                    System.out.println("Peleas ganadas:");
                    int peleas = sc.nextInt();

                    lstAtletas.add(new Boxeador(nombre1, edad1, horas1, golpes, peleas));
                    break;

                case 3:
                    System.out.println("Nombre:");
                    String nombre2 = sc.nextLine();

                    System.out.println("Edad:");
                    int edad2 = sc.nextInt();

                    System.out.println("Horas entrenamiento:");
                    double horas2 = sc.nextDouble();

                    System.out.println("Saques efectivos:");
                    int saques = sc.nextInt();

                    System.out.println("Bloqueos:");
                    int bloqueos = sc.nextInt();

                    lstAtletas.add(new Voleibolista(nombre2, edad2, horas2, saques, bloqueos));
                    break;

                case 4:
                    for (Atleta a : lstAtletas) {

                        a.mostrarDatos();

                        double rendimiento = a.calcularRendimiento();
                        System.out.println("Rendimiento: " + rendimiento);

                        String nivel = ((Evaluable) a).clasificarNivel();
                        System.out.println("Nivel: " + nivel);

                        double bono = ((Evaluable) a).calcularBono();
                        System.out.println("Bono: " + bono);

                        System.out.println("----------------------");
                    }
                    break;

                case 5:
                    Atleta mejor = null;
                    double max = 0;

                    for (Atleta a : lstAtletas) {

                        double rendimiento = a.calcularRendimiento();

                        if (rendimiento > max) {
                            max = rendimiento;
                            mejor = a;
                        }
                    }

                    if (mejor != null) {
                        System.out.println("MEJOR ATLETA:");
                        mejor.mostrarDatos();
                        System.out.println("Rendimiento: " + max);

                        String nivel = ((Evaluable) mejor).clasificarNivel();
                        System.out.println("Nivel: " + nivel);

                        double bono = ((Evaluable) mejor).calcularBono();
                        System.out.println("Bono: " + bono);
                    }
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;
            }

        } while (opcion != 6);
    }
}