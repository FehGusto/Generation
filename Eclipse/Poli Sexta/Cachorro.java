package New;

public class Cachorro extends Animal{
	private String som;

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	public String getnome()
	{
		return "Nome animal: "+super.getNome()+"\nMovimento eveasivo: "+super.getMovimentoEvasivo()+"\nIdade: "+super.getIdade()
		+"Som emititido: "+this.getSom();
	}
	
	
	
	
	
	


	

}
