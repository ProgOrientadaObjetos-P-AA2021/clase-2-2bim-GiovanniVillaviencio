package paquete6;

public class Ejecutor2 {

    public static void main(String[] args) {
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        int numCredito = 5;
        double costoCredi = 50.5;

        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad, numCredito, costoCredi);

        estPresencial.calcularMatriculaPresencial();

        System.out.println(estPresencial);
    }
}
