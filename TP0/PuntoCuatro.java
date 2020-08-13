import java.util.Scanner;

public class PuntoCuatro {

	static Scanner scanner = new Scanner(System.in);

	
	static boolean isPrime(int n) // O(n^(1/2)) (SE PENSÓ UTILIZAR LA CRIBA DE ERATÓSTENES, PERO AL SER SOLO UN TEST DE UN PRIMO NO SE VERÍA REQUERIDA.
	{
		for(int i = 2; i <= Math.sqrt(n); i++)
		{
			if(n%i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	static void solve(int n)
	{
		System.out.println(isPrime(n) ? n+ " es un número primo." : n+ " no es un número primo.");
	}
	
	
	public static void main(String[] args) {
		
		try
		{
			
			int n = Integer.parseInt(scanner.next());
			solve(n);
		}catch (Exception e) {
			System.out.println("Se introdujo un número inválido, reintente.");
			main(args);
		}
	}

}
