import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[5];

        for (int i = 0; i < 5; i++){
            System.out.print("Ingrese el nombre " + (+1) + ":");
            nombres[i] = scanner.nextLine();

        }

        Arrays.sort(nombres);
        System.out.println("Nombres Ordenados: " + Arrays.toString(nombres));

        System.out.print("Ingrese un nombre a buscar: ");
        String buscar = scanner.nextLine();
        int indice = Arrays.binarySearch(nombres, buscar);

        if (indice >= 0) {
            System.out.println(buscar + "esta en la posicion " + (indice + 1));
        } else {
            System.out.println(buscar + "no esta en la lista");
        }
    }
}