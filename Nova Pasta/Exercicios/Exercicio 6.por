programa
{
     inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
	
		real x1,x2,y1,y2,d

		escreva("Insira coordenada X de P1 : ")
		leia(x1)
		escreva("Insira coordenada Y de P1 : ")
		leia(y1)
		escreva("Insira coordenada X de P2 : ")
		leia(x2)
		escreva("Insira coordenada Y de P2 : ")
		leia(y2)

		d = mat.raiz(((mat.potencia(x2-x1,2.0))+(mat.potencia(y2-y1,2.0))),2.0)
		
		escreva("\nDistancia entre pontos é de ",d," cm")

	

		

		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 463; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */