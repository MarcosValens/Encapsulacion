import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("\n¿Que tipo de cola quieres usar?\n\n1. Array\n2. ArrayList\n3. LinkedList\n4. String\n\nIntroduce el numero de la opcion que desees usar: ");
        Scanner input = new Scanner(System.in);
        String auxiliar;
        int cantidad;
        boolean repetir = true;
        switch (input.nextInt()) {
            case 1:
                System.out.println("Has seleccionado array...\n\n¿Cuantas personas quieres introducir en el array? (Introduce numeros)");
                int tamaño = input.nextInt();
                int contador = 0;
                Array array = new Array(tamaño);
                input.nextLine();
                while (contador < tamaño) {
                    Persona persona = new Persona();
                    Utiles.crearDatosPersona(persona, input);
                    array.introducir(persona, contador);
                    contador++;
                }
                array.mostrar();
                cantidad = Utiles.eliminarPersona(input);
                array.eliminar(cantidad);
                array.mostrar();
                input.nextLine();
                break;
            case 2:
                Lista lista = new Lista();
                input.nextLine();
                System.out.println("Has seleccionado ArrayList...");
                while (repetir) {
                    Persona persona = new Persona();
                    Utiles.crearDatosPersona(persona, input);
                    lista.addPersona(persona);
                    System.out.println("¿Quieres añadir mas personas?");
                    auxiliar = input.nextLine();
                    if (auxiliar.equals("no") || auxiliar.equals("No") || auxiliar.equals("N")
                            || auxiliar.equals("n"))
                        repetir = false;
                }
                lista.listadoPersonas();
                System.out.println("Actualmente hay " + lista.totalPersonas());
                cantidad = Utiles.eliminarPersona(input);
                lista.removePersona(cantidad);
                lista.listadoPersonas();
                break;
            case 3:
                System.out.println("Has seleccionado LinkedList...");
                break;
            case 4:
                System.out.println("Has seleccionado string...\nIntroduce en orden los siguientes valores: nombre," +
                        " apellidos, sexo, edad y DNI (separado por comas(,))");
                input.nextLine();
                auxiliar = input.nextLine();
                Texto texto = new Texto(auxiliar);
                while (repetir) {
                    ArrayList<Persona> personas = texto.crearPersona(auxiliar);
                    System.out.println("¿Quieres añadir mas personas?");
                    auxiliar = input.nextLine();
                    if (auxiliar.equals("no") || auxiliar.equals("No") || auxiliar.equals("N")
                            || auxiliar.equals("n"))
                        repetir = false;
                    else {

                    }
                }

            default:
                System.err.println("Introduce una opcion valida...");
                break;
        }
    }
}
