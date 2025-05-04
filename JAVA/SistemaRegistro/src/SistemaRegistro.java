import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SistemaRegistro {
    List<Persona> personas = new ArrayList<>();

    // Sobrecarga: registrar persona
    void registrarPersona(String nombre) {
        registrarPersona(nombre, 0);
    }

    void registrarPersona(String nombre, int edad) {
        personas.add(new Persona(nombre, edad));
    }

    void mostrarPersonas() {
        System.out.println("\nPersonas registradas:");
        for (Persona p : personas)
            System.out.println("- " + p.nombre + " (" + p.edad + " años)");
    }

    void obtenerEdad(String nombre) {
        for (Persona p : personas) {
            if (p.nombre.equalsIgnoreCase(nombre)) {
                System.out.println(nombre + " tiene " + p.edad + " años.");
                return;
            }
        }
        System.out.println("Error: '" + nombre + "' no está registrado.");
    }

    void probarLista() {
        try {
            System.out.println(Arrays.asList("uno", "dos", "tres").get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: índice fuera de rango.");
        }
    }

    public static void main(String[] args) {
        SistemaRegistro sistema = new SistemaRegistro();

        sistema.registrarPersona("Ana");
        sistema.registrarPersona("Luis", 29);

        sistema.mostrarPersonas();

        sistema.obtenerEdad("Luis");
        sistema.obtenerEdad("Carlos");

        sistema.probarLista();
    }
}

