package New;

public class Preguica extends Animal {
	private String som2;

	public String getSom2() {
		return som2;
	}

	public void setSom2(String som2) {
		this.som2 = som2;
	}
	
	public String getnome()
	{
		return "Nome animal: "+super.getNome()+"\nMovimento eveasivo: "+super.getMovimentoEvasivo()+"\nIdade: "+super.getIdade()
		+"Som emititido: "+this.getSom2();
		
	}

}
