import java.util.Scanner;

public class Utiles {
    public static void crearDatosPersona(Persona persona, Scanner input) {
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
    }

    public static int eliminarPersona(Scanner input) {
        System.out.println("¿Quieres eliminar personas de la cola?");
        String confirmacion = input.nextLine();
        if (confirmacion.equals("si") || confirmacion.equals("Si") || confirmacion.equals("S") ||
                confirmacion.equals("s")) {
            System.out.println("¿Cuantas personas deseas eliminar?");
            return input.nextInt();
        } else System.out.println("Gracias!");
        return 0;
    }

    public static boolean preguntaAnadir(Scanner input, boolean repetir) {
        System.out.println("¿Quieres añadir mas personas?");
        String auxiliar = input.nextLine();
        if (auxiliar.equals("no") || auxiliar.equals("No") || auxiliar.equals("N")
                || auxiliar.equals("n"))
            repetir = false;
        return repetir;
    }

}

