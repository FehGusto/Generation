package dgf;

public class Avi�o {
	
	private String modelo;
	private String pais;
	private int ano;
	
	public Avi�o(String modelo, String pais, int ano)
	{
		this.modelo = modelo;
		this.pais = pais;
		this.ano = ano;
	}
	public void imprimirinfo()
	{
		System.out.println("Modelo do avi�o: "+modelo+"\nPais de farbica��o: "+pais+"\nAno de fabrica��o: "+ano);
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	

}
