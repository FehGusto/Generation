package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colecoes {

	public static void main(String[] args) {
		int controle;
		
		List<String> estoqueFruta = new ArrayList();
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("\n(1)Inserir\n(2)Remover \n(3)Corrigir\n(4)Lista Atualizada\n(0) Sair");
			System.out.println("\nEscolha Opção: ");
			
			controle = ler.nextInt();
			
			switch(controle)
			{
			
			case 1:
				ler.nextLine();
				System.out.println("Digite a fruta: ");
				String fruta = ler.next();
				estoqueFruta.add(fruta);
				break;
			
			case 2:
				ler.nextLine();
				System.out.println("Qual remover? ");
				String fruta1 = ler.nextLine();
				if(estoqueFruta.contains(fruta1));
				{
					estoqueFruta.remove(fruta1);
				}
				System.out.println(estoqueFruta);
				break;
			
			case 3:
				ler.nextLine();
				System.out.println("Digite fruta para correção:");
				String corrigir = ler.nextLine();
				System.out.println("Digite nome correto:");
				String correto = ler.nextLine();
				
				if(estoqueFruta.contains(corrigir));
				{
					estoqueFruta.remove(corrigir);
					estoqueFruta.add(correto);
				}
				break;
			
			case 4:
				System.out.println("Estoque Atualizado");
				System.out.println(estoqueFruta);
			}
			
	
		}
		while (controle!=0);
	}
}


