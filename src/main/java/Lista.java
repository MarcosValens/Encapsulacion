import java.util.ArrayList;

public class Lista {
    private ArrayList<Persona> personas = new ArrayList<Persona>();

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public Lista() {

    }

    void addPersona(Persona persona) {
        personas.add(persona);
    }

    void removePersona(int cantidad) {
        int contador = 0;
        while (contador < cantidad) {
            personas.remove(personas.remove(0));
            contador++;
        }
    }

    int totalPersonas() {
        return personas.size();
    }

    void listadoPersonas() {
        try {
            for (Persona persona : personas) {
                System.out.println("Nombre: " + persona.getNombre());
                System.out.println("Apellido " + persona.getApellido());
                System.out.println("Sexo: " + persona.getSexo());
                System.out.println("Edad: " + persona.getEdad());
                System.out.println("DNI: " + persona.getDni());
            }
        } catch (NullPointerException exception) {
            System.out.println("La lista esta vacia.");
        }
    }
}
