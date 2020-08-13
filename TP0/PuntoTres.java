import java.util.Scanner;

public class PuntoTres {

	
	static Scanner scanner = new Scanner(System.in);

	static void solve(long n)
	{
		long quantDiv = 1; 
		long sumDiv = n;
		System.out.print("Divisores: [");
		for(long i = 1; i <= n/2; i++)
		{
			if(n%i == 0)
			{
				sumDiv+= i;
				quantDiv++;
				System.out.print(i + " ");
			}
		}
		System.out.print(n + "]\n");
		System.out.println("Cantidad de divisores: "+ quantDiv);
		System.out.println("Suma de divisores: "+ sumDiv);
	}
	
	public static void main(String[] args) {
		try
		{
			// Por obvias razones no cargar números mayores a 1e9+7 (No es probable el cálculo)
			// Se contemplaron los números primos para evitar cálculos innecesarios.
			
			long n = Long.parseLong(scanner.next());
			solve(n);
			
		}
		catch (Exception e) {
			System.out.println("Error al cargar el número.");
		}

	}

}
