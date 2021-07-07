package dgf;

public class Cliente {
	
	private String nomeCliente;
	private String nomeFilial;
	private int idade;
			
	public Cliente (String nomeCliente,String nomeFilial,int idade)
	{
		this.nomeCliente = nomeCliente;
		this.nomeFilial = nomeFilial;
		this.idade = idade;
	}
	public Cliente(String nomeCliente,int idade)
	{
		this.nomeCliente = nomeCliente;
		this.idade = idade;
	}
	public void imprimirInfo()
	{
		System.out.println("Nome: "+nomeCliente+"\nIdade: "+idade+"\nFilial: "+nomeFilial);
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNomeFilial() {
		return nomeFilial;
	}
	public void setNomeFilial(String nomeFilial) {
		this.nomeFilial = nomeFilial;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	

}
