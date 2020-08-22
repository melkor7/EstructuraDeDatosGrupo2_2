import java.util.Scanner;

public class Punto01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese X");
        int x = input.nextInt();
        System.out.println("Ingrese Y");
        int y = input.nextInt();
        cuadrantes(x, y);
    }
    public static void cuadrantes(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("El Punto esta Ubicado en el Primer Cuadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("El Punto esta Ubicado en el Segundo Cuadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("El Punto esta Ubicado en el Tercer Cuadrante");
        } else if (x > 0 && y < 0) {
            System.out.println("El Punto esta Ubicado en el Cuarto Cuadrante");
        } else if (x == 0 && y == 0) {
            System.out.println("El Punto esta Ubicado en el Origen de Coordenadas");
        } else if (x > 0 && y == 0) {
            System.out.println("El Punto esta Ubicado en el Eje Positivo de las X");
        } else if (x < 0 && y == 0) {
            System.out.println("El Punto esta Ubicado en el Eje Negativo de las X");
        }else if (x == 0 && y > 0) {
            System.out.println("El Punto esta Ubicado en el Eje Positivo de las Y");
        }else if (x == 0 && y < 0) {
            System.out.println("El Punto esta Ubicado en el Eje Negativo de las Y");
        }
    }
}
