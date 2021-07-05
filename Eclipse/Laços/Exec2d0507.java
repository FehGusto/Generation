package dgf;

import java.util.Scanner;

public class Exec2d0507 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int x, im=0, pr=0;
						
		for ( int i = 1; i <= 10; i++ ) {
			System.out.println("Insira numero desejado: ");
			x = ler.nextInt();
			if ( x % 2 == 0 )
			
			pr = pr + 1;
			
			else 
			
				im = im + 1;
		}
		System.out.println("Foram "+pr+" numeros pares digitados e "+im+" numeros impares.");
			
	}
}
