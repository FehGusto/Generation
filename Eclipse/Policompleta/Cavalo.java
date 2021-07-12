package New;

public class Cavalo extends Animal{
	private String som1;

	public String getSom1() {
		return som1;
	}

	public void setSom1(String som1) {
		this.som1 = som1;
	}
	public String getnome()
	{
		return "Nome animal: "+super.getNome()+"\nMovimento eveasivo: "+super.getMovimentoEvasivo()+"\nIdade: "+super.getIdade()
		+"Som emititido: "+this.getSom1();
	
	}	

}
