package dgf;

import java.util.Scanner;

public class Testeaviao {

	public static void main(String[] args) {
		
		String modeloDigitado = null,paisDigitado = null;
		int anoDigitado = 0;
		
		Avião av1 = new Avião(modeloDigitado,paisDigitado,anoDigitado);
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o modelo:");
		modeloDigitado = ler.next();
		
		System.out.println("Digite o pais de fabricação:");
		paisDigitado = ler.next();
		
		System.out.println("Digite o ano de fabricação: ");
		anoDigitado = ler.nextInt();
		
		av1.setAno(anoDigitado);
		av1.setModelo(modeloDigitado);
		av1.setPais(paisDigitado);
		
		av1.imprimirinfo();
		

	}

}
