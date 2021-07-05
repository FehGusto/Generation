package dgf;

import java.util.Scanner;

public class Exec5d0507 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int x ,xt=0;
		
		System.out.println("insrira um numero ");
		x = ler.nextInt();
		do
		{
					
			xt = xt + x;
			
			System.out.println("insrira um numero ");
			x = ler.nextInt();
		
		}while (x>=1);
		
		System.out.println("Total da soma é de "+xt);
	}
}
