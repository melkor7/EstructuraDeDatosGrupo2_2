import java.util.Scanner;

public class Punto04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un Numero");
        int x = input.nextInt();
        if (validacion(x)) {
            if (esPrimo(x)) {
                System.out.println("El Numero "+x+" es Primo");
            }else {
                System.out.println("El Numero "+x+" no es Primo");
            }
        }else
            System.out.println("El Numero Ingresado debe ser Positivo");
    }

    public static boolean validacion(int x) {
        boolean val = false;
        if (x > 0) {
            val = true;
        }
        return val;
    }

    public static boolean esPrimo(int x) {
        boolean primo = true;

        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                primo = false;
            }
        }
        return primo;
    }
}
