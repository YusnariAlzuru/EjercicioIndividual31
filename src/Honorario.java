public class Honorario extends Trabajador {
    private String giro;
    private int anioIniciacion;

    public Honorario(String nombres, String apellidos, String run, int telefono, int edad, String giro, int anioIniciacion) {
        super(nombres, apellidos, run, telefono, edad);
        this.giro = giro;
        this.anioIniciacion = anioIniciacion;
    }

    public Honorario(String nombres, String apellidos, String giro, int anioIniciacion) {
        super(nombres, apellidos);
        this.giro = giro;
        this.anioIniciacion = anioIniciacion;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public int getAnioIniciacion() {
        return anioIniciacion;
    }

    public void setAnioIniciacion(int anioIniciacion) {
        this.anioIniciacion = anioIniciacion;
    }

    @Override
    public String toString() {
        return "Honorario{" +
                "giro='" + giro + '\'' +
                ", anioIniciacion=" + anioIniciacion +
                '}';
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Giro: " + giro + ". Año iniciación: " + anioIniciacion);
    }
}