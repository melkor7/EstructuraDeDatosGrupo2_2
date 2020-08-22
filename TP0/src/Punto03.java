import java.util.Scanner;

public class Punto03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cont = 0;
        boolean val = true;

        do {
            System.out.println("Ingrese un Numero");
            int x = input.nextInt();
            if (x > 0) {
                System.out.println("Sus Divisores son: ");
                divisores(x);
                System.out.println("La Cantidad de Divisores de "+x+" son: "+cantidadDivisores(x, cont));
                val = false;
            }else {
                System.out.println("Debe Ingresar Valores Positivos");
            }
        }while (val);

    }
    public static void divisores (int x) {
        for (int i=1; i<=x; i++) {
            if (x % i == 0) {
                System.out.println(i + ", ");
            }
        }
    }

    public static int cantidadDivisores (int x, int cont) {
        for (int i = 1; i <= x; i++) {
            int r = x % i;
            if (r == 0) {
                cont ++;
            }
        }
        return cont;
    }

}
