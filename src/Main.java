import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la ruta de un archivo: ");
        String path = sc.nextLine();
        File file = new File(path);

        // Solo comprueba si existe y si es un fichero
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("El fichero existe");

            } else {
                System.out.println("ERROR: Debes introducir la ruta de un fichero");
            }
        } else {
            System.out.println("ERROR: El fichero introducido no existe");
        }
    }
}