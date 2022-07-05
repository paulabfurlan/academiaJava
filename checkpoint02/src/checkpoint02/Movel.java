package checkpoint02;

public class Movel extends Equipamento {
	private String finalidade;

	public Movel(String nome, String dataCompra, boolean statusFunc, String finalidade) {
		super(nome, dataCompra, statusFunc);
		this.finalidade = finalidade;
	}

	public String getFinalidade() 
	{
		return finalidade;
	}

	public void setFinalidade(String finalidade) 
	{
		this.finalidade = finalidade;
	}
}
