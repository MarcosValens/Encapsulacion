import java.util.ArrayList;

public class Texto {
    private String persona;
    private ArrayList<Persona> personas = new ArrayList<Persona>();

    public Texto(String persona) {
        this.persona = persona;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public ArrayList crearPersona(String persona){
        Persona objPersona = new Persona();
        String[] datos = persona.split(",");
        objPersona.setNombre(datos[0]);
        objPersona.setApellido(datos[1]);
        objPersona.setEdad(datos[2]);
        objPersona.setSexo(datos[3]);
        objPersona.setDni(datos[4]);
        personas.add(objPersona);
        return personas;
    }

    public void listadoPersonas(ArrayList<Persona> personas){
        for (Persona persona:personas) {
            System.out.println(persona.getNombre());
            System.out.println(persona.getApellido());
            System.out.println(persona.getEdad());
            System.out.println(persona.getSexo());
            System.out.println(persona.getDni());
        }
    }

    void eliminarPersona(int cantidad) {
        int contador = 0;
        while (contador < cantidad) {
            personas.remove(personas.remove(0));
            contador++;
        }
    }

}
