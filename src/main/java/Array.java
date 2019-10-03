import java.util.Arrays;

public class Array {
    private int tamaño;
    private Persona[] personas;

    public Array(int tamaño) {
        this.tamaño = tamaño;
        personas = new Persona[tamaño];
    }

    public void introducir(Persona persona, int posicion) {
        personas[posicion] = persona;
    }

    public void mostrar() {
        try {
            for (Persona persona : personas) {
                System.out.println("Nombre: " + persona.getNombre());
                System.out.println("Apellido " + persona.getApellido());
                System.out.println("Sexo: " + persona.getSexo());
                System.out.println("Edad: " + persona.getEdad());
                System.out.println("DNI: " + persona.getDni());
            }
        } catch (NullPointerException exception) {
            System.out.println("El array esta vacio.");
        }
    }

    public void eliminar(int cantidad) {
        Persona[] personasFinal = new Persona[cantidad];
        int contador = 0;
        for (int i = cantidad; i < personas.length; i++) {
            personasFinal[contador] = personas[i];
            contador++;
        }
        personas = personasFinal;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
}
