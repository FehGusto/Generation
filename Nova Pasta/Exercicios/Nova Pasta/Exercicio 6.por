programa
{
	
	funcao inicio()
	{
	inteiro id

	escreva("Por favor insira sua idade ")
	leia(id)
	limpa()

	se (id>=5 e id<=7)
	{
		escreva("Nadador de categoria Infantil A")
		}
		senao se (id>=8 e id<=11)
		{
			escreva("Nadador de categoria Infantil B")
		}
		senao se (id>=12 e id<=13)
		{
			escreva("Nadador de categoria Juvenil A")	
		}
		senao se (id>=14 e id<=17)
		{
			escreva("Nadador de categoria Juvenil B")	
		}
		senao se (id>=18 e id<=55)
		{
			escreva("Nadador de categoria Adulto")
		}
		senao se (id>=55 e id<=120)
		{
			escreva("Nadador de categoria Senior")
		}
		senao
		{
			escreva("Por favor insira uma idade válida")
		}

			}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 647; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */