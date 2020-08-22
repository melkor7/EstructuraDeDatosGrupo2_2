import java.util.Scanner;

public class Punto05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el Primer Numero");
        int a = input.nextInt();
        System.out.println("Ingrese el Segundo Numero");
        int b = input.nextInt();

        int numero1 = Math.max(a, b);
        int numero2 = Math.min(a, b);
        int resultado;

        do {
            resultado = numero2;
            numero2 = numero1 % numero2;
            numero1 = resultado;
        } while (numero2 != 0);

        System.out.println("El M.C.D entre "+a+" y "+b+" es: "+resultado);
    }
}
