package dgf;

import java.util.Scanner;

public class Exec03d0607 {
	
	public static void main(String[] args) {
		
		float [][] valor= new float [3][3];
		int x=0,linha=0,coluna=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("Entre com o numero: ");
				valor[linha][coluna] = ler.nextFloat();
				
				if(valor[linha][coluna]>10)
				{
					x++;
				}
				
			}
		}
		System.out.println("A quantidade de numeros maiores que 10 são "+x+".");
	
	}
	

}
