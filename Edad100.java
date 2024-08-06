import java.time.Year;
import java.util.Scanner;

public class Edad100 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese su nombre; ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            int anioActual = Year.now().getValue();
            int anio100 = anioActual + (100 - edad);

            int aniorestante = (100 - edad);

            System.out.println(nombre + ", tendras 100 años en el año " + anio100);
            System.out.println(nombre + ", te faltan " + aniorestante + " años para cumplir 100 años"); 
        }
    }
}
