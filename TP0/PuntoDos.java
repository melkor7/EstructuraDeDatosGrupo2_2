import java.util.Scanner;

public class PuntoDos {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void eval(double a, double b, char s)
	{
		switch(s)
		{
			case '+':
			{
				System.out.println("El resultado de " + a + "+" + b + " es igual a " + (a+b));
				break;
			}
			case '-':
			{
				System.out.println("El resultado de " + a + "-" + b + " es igual a " + (a-b));
				break;
			}
			case '*':
			{
				System.out.println("El resultado de " + a + "*" + b + " es igual a " + (a*b));
				break;
			}
			case '/':
			{
				if(b == 0 )System.out.println("División por 0.");
				else System.out.println("El resultado de " + a + "/" + b + " es igual a " + (a/b));
				break;
			}
			default: System.out.println("Operador inválido");
		}
	}
	
	static int getRandomIntBetweenRange(double min, double max){
	    int x = (int) ((int)(Math.random()*((max-min)+1))+min);
	    return x;
	}
		
	public static double getRandomDoubleBetweenRange(double min, double max){
	    double x = (Math.random()*((max-min)+1))+min;
	    return x;
	}
	public static void main(String[] args) {
		char[] operators = new char[] {'+', '-', '*', '/'};
		
		try
		{
			System.out.println("¿De qué forma trabajará?\n1-Números al azar.\n2-Números cargados por standard input.");
			switch(scanner.next())
			{
				case "1":
				{
					double a = getRandomDoubleBetweenRange(1, 100000);
					double b = getRandomDoubleBetweenRange(1, 100000);
					char S = operators[getRandomIntBetweenRange(1,10000)%4]; // RANDOMNUMBER%4 para que tome un valor del array operators 
					eval(a, b, S);
					break;
				}
				case "2":
				{
					double a = Double.parseDouble(scanner.next());
					double b = Double.parseDouble(scanner.next());
					char S = scanner.next().charAt(0);
					eval(a, b, S);
					break;
				}
				default:
				{
					System.out.println("Error al cargar los valores.");
					break;
				}
				
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}
	}

}
