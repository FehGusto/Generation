package New;

public class TesteAnimal {
	public static void main (String args[])
	{
		Cachorro dog = new Cachorro();
		dog.setNome("Vira lata");
		dog.setIdade(15);
		dog.setMovimentoEvasivo("Correr");
		dog.setSom("Latir");
		
		Cavalo cav = new Cavalo();
		cav.setNome("Puro sangue ingles");
		cav.setIdade(20);
		cav.setMovimentoEvasivo("Correr");
		cav.setSom1("Relinchar");
		
		Preguica preg = new Preguica();
		preg.setNome("Preguiça Real");
		preg.setIdade(5);
		preg.setMovimentoEvasivo("Subir em arvore");
		preg.setSom2("Desconhecido");
		
		Animal[] anim = new Animal[3];
		anim[0] = dog;
		anim[1] = cav;
		anim[2] = preg;
		
		for(Animal anima:anim)
		{
			System.out.println(anima.getNome());
				
	}
	
	}
}
