import java.util.Scanner;

public class Dividir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        do {
            System.out.print("Ingrese un número para ver su tabla de división: ");

            int numero = scanner.nextInt();

            System.out.println("Tabla de dividir del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " / " + numero + " = " + (i / numero));
            }
            System.out.println("¿Quiere ver otra tabla? (S/N): ");
            respuesta = scanner.next();

        } while (respuesta.equalsIgnoreCase("S"));

                    System.out.println("¡Gracias por usar el programa!");
                    scanner.close();
        }
    }
