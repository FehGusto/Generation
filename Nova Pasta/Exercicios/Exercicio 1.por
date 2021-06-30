programa
{
	
	funcao inicio()
	{
		inteiro totaldias,anosin,mesesin,diasin,diasano,diasmes,diasd

 		escreva("\nEntre com o total de anos de vividos: ")
		leia(anosin)
		escreva("\nEntre com o total de meses de vividos: ")
		leia(mesesin)
		escreva("\nEntre com o total de dias de vividos: ")
		leia(diasin)
		
		
		diasano = anosin*365
		diasmes = mesesin*30
		diasd = diasin
		totaldias = diasd+diasmes+diasano
 
		

		escreva("Total dias vividos é de ",totaldias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 417; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */