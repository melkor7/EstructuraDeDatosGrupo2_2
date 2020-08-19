import java.util.Scanner;


public class EjercicioTres {
	static Scanner scanner=new Scanner(System.in);
	
	//metodo para resolver cuales y cuantos divisores tiene el numero ingresado
	 static void op (long numero) {
		 long cont=0;
		 long divisores=0;
		 
		 System.out.println("Los divisores son: ");
		 for (int i = 1 ; i <= numero; i++) {
	            if (numero % i == 0) {
	                System.out.println (i);
	                divisores++;
	                cont=cont+i;
	                }
	          }
		 System.out.println("En total son: "+divisores+" divisores");
		 System.out.println("Promedio de divisores: "+cont);
		 }
	
	//Carga de datos
	public static void main(String args[]) {
		String inicio=null;
		do {
			System.out.println("Bienvenido");
			System.out.println("Para saber cuantos divisores tiene tu número positivo, ingrese el valor");
			long numero = scanner.nextLong();
			if (numero>0) {
				op(numero);
			}
			else {System.out.println("Error. El número debe ser positivo");}
			System.out.println("----------------------------------------");
			System.out.println("Si desea volver al Inicio, coloque Si");
			System.out.println("Sino ingrese cualquier letra");
			inicio = scanner.next();
			inicio = inicio.toUpperCase();
	    }while (inicio.equals("SI"));
		System.out.println("Saliendo del programa");
	}

}
