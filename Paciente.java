public class Paciente {
    String nombre;
    String apellido;
    int edad;
    double altura;

    public void mostrarNombre() {
        System.out.println("El nombre del paciente es:" + this.nombre);
    }

    public void mostrarApellido() {
        System.out.println("El apellido del paciente es:" + this.apellido);

    }

    public void mostrarEdad() {
        System.out.println("La edad del paciente es:" + this.edad);
    }

    public void mostrarAltura() {
        System.out.println("La estatura del paciente es:" + this.altura);
    }

}
