programa
{
	
	funcao inicio()
	{
	
	inteiro j,x=0
	
	escreva("Insira numero a ser calculado: ")
	leia(j)
	limpa()
	escreva("Resultados obtidos foram: ")
	enquanto(j<=100)
	{
	j = j * 3
	x = x + 1
	escreva("\n",j)
	}
	escreva("\nForam feitas, ",x," multiplicações")
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 155; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */