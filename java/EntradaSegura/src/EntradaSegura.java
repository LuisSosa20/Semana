import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaSegura {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce tu edad: ");
            int edad = sc.nextInt();
            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa.");
            }
            System.out.println("Tu edad es: " + edad);
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número entero.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()); 
       }
    }
}
