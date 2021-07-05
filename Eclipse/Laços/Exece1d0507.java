package dgf;

import java.util.Scanner;

public class Exece1d0507 {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		int id, mv=0, mc=0;
		
		System.out.println("Insira sua idade ");
		id = ler.nextInt();
		
		while (id <= 99)
		{
			if (id <= 25) {
				mv = mv + 1;
			}
			else if(id >= 50) {
				mc = mc + 1;
			}
		System.out.println("Insira sua idade ");
		id = ler.nextInt();
		}
		
		System.out.println("Pessoas com menos de 25 anos é "+mv+". \nE pessoas com mais de 50 anos é "+mc);
	}	

}
