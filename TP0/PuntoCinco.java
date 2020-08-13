import java.util.Scanner;

public class PuntoCinco {
	
	static Scanner scanner = new Scanner(System.in);
	
	
	static long gcd(long a, long b)
	{
		return a>0 ? gcd(b%a, a):b;
	}

	static long getRandomLongBetweenRange(double min, double max){
	    long x = (long) ((long)(Math.random()*((max-min)+1))+min);
	    return x;
	}
		
	public static void main(String[] args) {
		try
		{
			System.out.println("¿De qué forma trabajará?\n1-Números al azar.\n2-Números cargados por standard input.");
			switch(scanner.next())
			{
				case "1":
				{
					long a = getRandomLongBetweenRange(1, 100000);
					long b = getRandomLongBetweenRange(1, 100000);
					System.out.println("El máximo común divisor entre " +a + " y " + b + " es " + gcd(a,b));
					break;
				}
				case "2":
				{
					long a = Long.parseLong(scanner.next());
					long b = Long.parseLong(scanner.next());
					System.out.println("El máximo común divisor entre " +a + " y " + b + " es " + gcd(a,b));
					break;
				}
				default:
				{
					System.out.println("Opción incorrecta.");
					break;
				}
				
			}
			
		}
		catch (Exception e) {
			System.out.println("Error al cargar el número.");
		}

	}
}
