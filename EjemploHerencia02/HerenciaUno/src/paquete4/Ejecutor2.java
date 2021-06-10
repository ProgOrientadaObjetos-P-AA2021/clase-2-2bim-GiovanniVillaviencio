
package paquete4;

public class Ejecutor2 {
    public static void main(String[] args) {
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        
        EstudiantePresencial estPrecencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);
        
        estPrecencial.establecerCostoCredito(70.50);
        estPrecencial.establecerNumeroCreditos(6);
        estPrecencial.calcularMatriculaPresencial();
        
        System.out.println(estPrecencial);
    }
}
