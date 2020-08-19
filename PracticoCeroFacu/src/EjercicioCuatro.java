import java.util.Scanner;

public class EjercicioCuatro {
	static Scanner scanner=new Scanner(System.in);
	
	//método para decidir si la funcion es verdadera o falsa
	public static boolean primo (int numero) {
		for(int i = 2; i <= numero/2; i++)
		{
			if(numero%i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	//subprograma para la respuesta
	static void resp(int numero) {
		System.out.println(primo(numero)? numero+" es primo":numero+" no es primo");
	}
	
	
	//menu de opciones para el usuario
	public static void main(String args[]) {
		String inicio=null;
		do {
			System.out.println("Bienvenido por favor ingrese su número positivo");
			System.out.println("para saber si es primo o no");
			int numero = scanner.nextInt();
			if	(numero>0) {
				resp(numero);
			}
			else {
				System.out.println("Error. Cargo los datos erroneamente");
			}
			System.out.println("----------------------------------------");
			System.out.println("Si desea volver al Inicio, coloque Si");
			System.out.println("Sino ingrese cualquier letra");
			inicio = scanner.next();
			inicio = inicio.toUpperCase();
		}while (inicio.equals("SI"));
		System.out.println("Saliendo del programa");
	}
}