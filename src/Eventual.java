public class Eventual extends Trabajador {
    private boolean disponibilidad;
    private String correo;

    public Eventual(String nombres, String apellidos, String run, int telefono, int edad, boolean disponibilidad, String correo) {
        super(nombres, apellidos, run, telefono, edad);
        this.disponibilidad = disponibilidad;
        this.correo = correo;
    }

    public Eventual(String nombres, String apellidos, boolean disponibilidad, String correo) {
        super(nombres, apellidos);
        this.disponibilidad = disponibilidad;
        this.correo = correo;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Eventual{" +
                "disponibilidad=" + disponibilidad +
                ", correo='" + correo + '\'' +
                '}';
    }

    @Override
    public void mostrarDatos() {
        if(disponibilidad){
            System.out.println("Disponibilidad inmediata. Correo: " + correo);
        }else{
            System.out.println("No disponible. Correo: " + correo);
        }
    }
}
