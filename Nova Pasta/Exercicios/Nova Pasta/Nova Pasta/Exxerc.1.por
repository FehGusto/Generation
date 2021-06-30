programa
{	
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		
	real sal,fil,medsal,medfil,msal=0,persal=0,medsalto=0,medfilto=0
	inteiro x	
	

	para(x=1;x<=20;x++)
	{
	escreva("Insira valor de seu salário: ")
	leia(sal)
	escreva("\nInsira numéro de filhos: ")
	leia(fil)

	medsalto = medsalto + sal
	medfilto = medfilto + fil

	se(sal<=100)
	{
	persal=persal+1
	}
	se(sal> msal){
			msal = sal			
			}senao{
				sal = 0
			}
	limpa()
	}
	medsalto = medsalto / 20
	medfilto = medfilto / 20
	persal = persal / 20 * 1000

	escreva("Média de salário da população é de ",medsalto)
	escreva("\nMédia de filhos da população é de ",medfilto)
	escreva("\nPercentual de pessoas com salário com até 100 reais ",persal,"%")
	escreva("\nMaior salario é de R$",msal)
	
	}

	

	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 395; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */