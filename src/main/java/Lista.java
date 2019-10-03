import java.util.ArrayList;

public class Lista {
    private ArrayList<Persona> personas = new ArrayList<Persona>();

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public Lista(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    void addPersona(Persona persona){
        personas.add(persona);
    }

    void removePersona(){
        personas.remove(personas.size()-1);
    }

    int totalPersonas(){
        return personas.size();
    }
}
