import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("\n¿Que tipo de cola quieres usar?\n\n1. Array\n2. ArrayList\n3. LinkedList\n4. String\n\nIntroduce el numero de la opcion que desees usar: ");
        Scanner input = new Scanner(System.in);
        switch (input.nextInt()) {
            case 1:
                System.out.println("Has seleccionado array...\n\n¿Cuantas personas quieres introducir en el array? (Introduce numeros)");
                int tamaño = input.nextInt();
                int contador = 0;
                Array array = new Array(tamaño);
                input.nextLine();
                while (contador < tamaño) {
                    Persona persona = new Persona();
                    System.out.println("Introduce el nombre: ");
                    persona.setNombre(input.nextLine());
                    System.out.println("Introduce el apellido: ");
                    persona.setApellido(input.nextLine());
                    System.out.println("Introduce el sexo: ");
                    persona.setSexo(input.nextLine());
                    System.out.println("Introduce la edad: ");
                    persona.setEdad(input.nextLine());
                    System.out.println("Introduce el DNI ");
                    persona.setDni(input.nextLine());
                    array.introducir(persona, contador);
                    contador++;
                }
                array.mostrar();
                System.out.println("¿Quieres eliminar personas de la cola?");
                String confirmacion = input.nextLine();
                if (confirmacion.equals("si") || confirmacion.equals("Si") || confirmacion.equals("S") || confirmacion.equals("s")) {
                    System.out.println("¿Cuantas personas deseas eliminar?");
                    int cantidad = input.nextInt();
                    array.eliminar(cantidad);
                    array.mostrar();
                } else System.out.println("Gracias!");
                break;
            case 2:
                System.out.println("Has seleccionado ArrayList...");
                break;
            case 3:
                System.out.println("Has seleccionado LinkedList...");
                break;
            case 4:
                System.out.println("Has seleccionado string...");
            default:
                System.err.println("Introduce una opcion valida...");
                break;
        }
    }
}
