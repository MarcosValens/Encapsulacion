import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class QueueTest {
    private Persona persona =  new Persona("Toni", "Mesquida");
    private Persona persona1 =  new Persona("Marcos", "Valent");
    private Persona persona2 =  new Persona("Nico", "Lagrega");
    private ArrayList<Persona> personas = new ArrayList<Persona>(){};
    private Lista lista = new Lista(personas);




    @org.junit.Test
    public void addPersona() {
        lista.addPersona(persona);
        lista.addPersona(persona1);
        lista.addPersona(persona2);
        ArrayList<Persona> personas1 = new ArrayList<Persona>();
        personas1.add(persona);
        personas1.add(persona1);
        personas1.add(persona2);
        assertEquals(personas, personas1);
    }

    @org.junit.Test
    public void removePersona() {
        lista.addPersona(persona);
        lista.addPersona(persona1);
        lista.addPersona(persona2);
        ArrayList<Persona> personas1 = new ArrayList<Persona>();
        personas1.add(persona);
        personas1.add(persona1);
        lista.removePersona();
        assertEquals(personas,personas1);
    }

    @org.junit.Test
    public void count() {

    }
}
