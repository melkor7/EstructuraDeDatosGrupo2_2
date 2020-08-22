import java.util.Scanner;

public class Punto02 {
    public static void main(String[] args) {
        int resp, resp2, a, b;
        a = 0;
        b = 0;
        int r = 0;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese el Simbolo");
            String s = input.nextLine();
            System.out.println("Desea Ingresar Datos o que se Generen Aleatoriamente");
            resp2 = input.nextInt();
            if (resp2 ==1 ) {
                System.out.println("Ingrese un Valor A");
                a = input.nextInt();
                System.out.println("Ingrese un Valor B");
                b = input.nextInt();
            }else if (resp2 ==2 ) {
                a = (int) (Math.random() * 99);
                b = (int) (Math.random() * 99);
            }

            operaciones(s, a, b, r);

            System.out.println("Desea segir?(1/2)");
            resp = input.nextInt();
        } while (resp != 2);
    }

    public static void operaciones(String s,int a, int b, int r) {
        switch (s) {
            case "/": r = a % b;
                System.out.println(a +" / "+ b +" = "+ r);
                break;
            case "*":r = a * b;
                System.out.println(a +" * "+ b +" = "+ r);
                break;
            case "-":r = a - b;
                System.out.println(a +" - "+ b +" = "+ r);
                break;
            case "+":r = a + b;
                System.out.println(a +" + "+ b +" = "+ r);
                break;
        }
    }
}
