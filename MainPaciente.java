import java.util.Scanner;

public class MainPaciente {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Escribir nombre del paciente ");
        String nombre = reader.next();
        System.out.println("Escribir el apellido del paciente");
        String apellido = reader.next();
        System.out.println("Escribir la edad del paciente ");
        int edad = reader.nextInt();
        System.out.println("Escrbir la altura del paciente");  
        double altura = reader.nextDouble();
        
        Paciente p1 = new Paciente();
        p1.nombre = nombre;
        p1.apellido = apellido;
        p1.edad = edad;
        p1.altura = altura;
        p1.mostrarNombre();
        p1.mostrarApellido();
        p1.mostrarEdad();
        p1.mostrarAltura();
    }
}
