programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
	real p1,p2,p3,p4,p12,p22,p32,p42

	escreva("Insira P1: ")
	leia(p1)
	escreva("Insira P2: ")
	leia(p2)
	escreva("Insira P3: ")
	leia(p3)
	escreva("Insira P4: ")
	leia(p4)

	limpa()

	p12 = mat.potencia(p1,2)
	p22 = mat.potencia(p2,2)
	p32 = mat.potencia(p3,2)
	p42 = mat.potencia(p4,2)

		
		se (p32>=1000)
	{
		escreva("Valor do quadrado do terceiro numero inserdo é ",p32)
	}
	
		senao 
		{
		escreva("\nValor do quadrado do numero ",p1," é ",p12)
		escreva("\nValor do quadrado do numero ",p2," é ",p22)
		escreva("\nValor do quadrado do numero ",p3," é ",p32)
		escreva("\nValor do quadrado do numero ",p4," é ",p42)
		}
	}
}
	
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 700; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */