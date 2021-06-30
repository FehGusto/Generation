programa
{	
	inclua biblioteca Util
	
	funcao inicio()
	{
	inteiro vet[10],i,y=0,imed,id=0		
		
		para(i=0;i<10;i++)
		
		vet[i] = Util.sorteia(1,6)
	
		para(i=0;i<10;i++)
		{
			se(vet[i]==6)
			y++
		}
		para(i=0;i<10;i++)
		{
			id = id + vet[i]
		}
						
		para(i=0;i<10;i++)
		 escreva("\nValor da jogada foi ",vet[i])
		 escreva("\n")
		 imed = id / 10

	
		
		escreva("\nNo total o dado resultou em seu numero maximo, ",y," vez(es).")
		escreva("\nMédia dos resultados obtidos foi de: ",imed)

}
		

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 504; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */