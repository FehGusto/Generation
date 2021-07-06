package dgf;

import java.util.Scanner;

public class Exec2d0607 {

	public static void main(String[] args) {
		
		float [] numeros = new float [6];
		float [] pares = new float [6];
		float [] impares = new float [6];
		int i, somadosPares = 0, quantidadeImpares=0;
		
		Scanner ler = new Scanner(System.in);
		
		
		for (i=0;i<6;i++)
		{
		
		System.out.println("Insira o numero desejado: ");
		numeros[i] = ler.nextFloat();
		
		if ( numeros[i] % 2 == 0 )
		{
			pares[i] = numeros[i];
			somadosPares = (int) (somadosPares + numeros[i]);
		}
		else 
		{
			impares[i] = numeros[i];
			quantidadeImpares++;
		}
		
		}
		{
		System.out.println("Numeros pares foram: ");
		for (i=0;i<6;i++)
			if (pares[i]>0)
		System.out.println(pares[i]);
		}
		{
		System.out.println("Numeros impares foram: ");
		for (i=0;i<6;i++)
			if (impares[i]>0)
				System.out.println(impares[i]);
		}
		System.out.println("Soma de numeros pares foi "+somadosPares+".");
		System.out.println("Quantidade de numeros impares foram "+quantidadeImpares+".");

	}

}
