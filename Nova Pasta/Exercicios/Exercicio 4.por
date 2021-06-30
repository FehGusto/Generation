programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real a,b,c,d,r,s
		
		escreva("Valor de A: ")
		leia(a)
		escreva("Valor de B: ")
		leia(b)
		escreva("Valor de C: ")
		leia(c)

		r = mat.potencia((a+b),2)
		s = mat.potencia((b+c),2)

		d = (r+s)/2

		escreva("Com os numeros inseridos resultado de D é ",d)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 336; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */