import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Ingresa el primer punto");
	
	int primerPunto = input.nextInt();
	
	System.out.println("Ingresa el segundo punto");
	
	int segundoPunto = input.nextInt();
	
	if (primerPunto>0) {
		
		if (segundoPunto>0) {
			
			System.out.println("Esta en el primer cuadrante");
			
		}
		
		else if (segundoPunto<0) {
			
			System.out.println("Esta en el cuarto cuadrante");
			
		}
		
	}
	
	else if (primerPunto<0) {
		
		if (segundoPunto<0) {
			
			System.out.println("Esta en el tercer cuadrante");
			
		}
		
		else if (segundoPunto>0) {
			
			System.out.println("Esta en el segundo cuadrante");
		
		}	
		
	}
	
	if (primerPunto == 0) {
		
		if (segundoPunto == 0) {
			
			System.out.println("Esta en el origen de coordenadas");
			
		}
		
		else if (segundoPunto > 0) {
			
			System.out.println("Esta en el eje positivo de las Y");
			
		}
		
		else if (segundoPunto < 0) {
			
			System.out.println("Esta en el eje negativo de las Y");
			
		}
		
	}
	
	else if (primerPunto>0) {
		
		if (segundoPunto == 0) {
			
			System.out.println("Esta en el eje positivo de las X");
			
		}
		
	}
	
	else if (primerPunto<0) {
		
		if (segundoPunto == 0) {
			
			System.out.println("Esta en el negativo de las X");
			
		}
	}
	

    }	
	
	
}
