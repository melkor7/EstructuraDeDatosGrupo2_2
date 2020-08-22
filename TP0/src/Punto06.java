import java.util.Scanner;

public class Punto06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un Numero");
        int x = input.nextInt();
        if (esPerfecto(x)) {
            System.out.println(x+" es un Numero Perfecto");
        }else
            System.out.println(x+" no es un Numero Perfecto");
    }

    public static boolean esPerfecto (int x) {
        int cont = 0;
        boolean perfecto = false;
        for (int i=1; i<x; i++) {
            if (x % i == 0) {
                cont = cont + i;
            }
        }
        if (cont == x) {
            perfecto = true;
        }
        return perfecto;
    }
}
