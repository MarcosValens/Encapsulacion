import java.util.ArrayList;
import java.util.LinkedList;

import static junit.framework.TestCase.assertEquals;


public class QueueTest {
    private Persona persona = new Persona();
    private Persona persona1 = new Persona();
    private Persona persona2 = new Persona();
    private Lista lista = new Lista();
    private Queue queue = new Queue();
    private Array array = new Array(3);
    private Texto texto = new Texto();


    /*ARRAYLIST TEST*/
    @org.junit.Test
    public void arrayListAddPersona() {
        ArrayList<Persona> personas1 = new ArrayList<Persona>();
        lista.addPersona(persona);
        lista.addPersona(persona1);
        lista.addPersona(persona2);
        personas1.add(persona);
        personas1.add(persona1);
        personas1.add(persona2);
        assertEquals(lista.getPersonas(), personas1);
    }

    @org.junit.Test
    public void arrayListRemovePersona() {
        ArrayList<Persona> personas1 = new ArrayList<Persona>();
        lista.addPersona(persona);
        lista.addPersona(persona1);
        lista.addPersona(persona2);
        personas1.add(persona1);
        personas1.add(persona2);
        lista.removePersona(1);
        assertEquals(lista.getPersonas(), personas1);
    }

    @org.junit.Test
    public void arrayListCount() {
        lista.addPersona(persona);
        lista.addPersona(persona1);
        lista.addPersona(persona2);
        assertEquals(lista.totalPersonas(), 3);
    }

    /*QUEUE LIST TEST*/
    @org.junit.Test
    public void queueAddPersona() {
        LinkedList<Persona> personas1 = new LinkedList<Persona>();
        queue.addPersona(persona);
        queue.addPersona(persona1);
        queue.addPersona(persona2);
        personas1.add(persona);
        personas1.add(persona1);
        personas1.add(persona2);
        assertEquals(queue.getPersonas(), personas1);
    }

    @org.junit.Test
    public void queueRemovePersona() {
        LinkedList<Persona> personas1 = new LinkedList<Persona>();
        queue.addPersona(persona);
        queue.addPersona(persona1);
        queue.addPersona(persona2);
        personas1.add(persona1);
        personas1.add(persona2);
        queue.removePersona(1);
        assertEquals(queue.getPersonas(), personas1);
    }

    @org.junit.Test
    public void queueCount() {
        queue.addPersona(persona);
        queue.addPersona(persona1);
        queue.addPersona(persona2);
        assertEquals(queue.totalPersonas(), 3);
    }

    /*ARRAY TEST*/
    @org.junit.Test
    public void arrayAddPersona() {
        Persona[] personas1 = new Persona[3];
        array.introducir(persona, 0);
        array.introducir(persona1, 1);
        array.introducir(persona2, 2);

        personas1[0] = persona;
        personas1[1] = persona1;
        personas1[2] = persona2;
        assertEquals(array.totalPersonas(), personas1.length);
    }

    @org.junit.Test
    public void arrayRemovePersona() {
        Persona[] personas1 = new Persona[1];
        array.introducir(persona, 0);
        array.introducir(persona1, 1);
        array.introducir(persona2, 2);
        personas1[0] = persona2;
        array.eliminar(2);
        assertEquals(array.totalPersonas(), personas1.length);
    }

    @org.junit.Test
    public void arrayCount() {
        array.introducir(persona,0);
        array.introducir(persona1,1);
        array.introducir(persona1,2);
        assertEquals(array.totalPersonas(),3);
    }
    /*STRING TEST*/
    @org.junit.Test
    public void stringAddPersona() {
        texto.crearPersona("Marcos,Valens,Masculino,34,23414534");
        texto.crearPersona("Marcos,Valens,Masculino,34,23414534");
        texto.crearPersona("Marcos,Valens,Masculino,34,23414534");
        assertEquals(texto.contarPersonas(), 3);
    }

    @org.junit.Test
    public void stringRemovePersona() {
        texto.crearPersona("Marcos,Valens,Masculino,34,23414534");
        texto.crearPersona("Marcos,Valens,Masculino,34,23414534");
        texto.crearPersona("Marcos,Valens,Masculino,34,23414534");
        texto.eliminarPersona(2);
        assertEquals(texto.contarPersonas(),1);
    }

    @org.junit.Test
    public void stringCount() {
        texto.crearPersona("Marcos,Valens,Masculino,34,23414534");
        texto.crearPersona("Marcos,Valens,Masculino,34,23414534");
        texto.crearPersona("Marcos,Valens,Masculino,34,23414534");
        assertEquals(texto.contarPersonas(),3);
    }
}
