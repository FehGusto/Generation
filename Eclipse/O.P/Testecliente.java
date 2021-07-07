package dgf;

import java.util.Scanner;

public class Testecliente {

	public static void main(String[] args) {
		
		String nomeDigitado = null,filialDigitada = null;
		int idadeDigitada=0;
	
		Cliente c1 = new Cliente(nomeDigitado,filialDigitada, idadeDigitada);
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nomeDigitado = ler.nextLine();
		
		System.out.println("Digite sua idade: ");
		idadeDigitada = ler.nextInt();
		
		System.out.println("Digite a filial: ");
		filialDigitada = ler.next();
	
		c1.setNomeCliente(nomeDigitado);
		c1.setNomeFilial(filialDigitada);
		c1.setIdade(idadeDigitada);
		
		
		c1.imprimirInfo();
	}

}
