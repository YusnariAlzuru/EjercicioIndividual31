public class Main {
    public static void main(String[] args){
        Trabajador trabajador = new Trabajador("Sebastián","Parra","18116285-6",57657865, 31);
        Honorario honorario = new Honorario("Sebastián","Parra","Ferretería",2019);
        Contratado contratado = new Contratado("Sebastián","Parra","21/04/2018","650000");
        Eventual eventual = new Eventual("Sebastián","Parra",true,"s.parra.z@icloud.com");

        System.out.printf("Datos trabajador: ");
        System.out.println("");
        trabajador.mostrarDatos();
        honorario.mostrarDatos();
        contratado.mostrarDatos();
        eventual.mostrarDatos();
    }
}
