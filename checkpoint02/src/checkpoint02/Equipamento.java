package checkpoint02;

public abstract class Equipamento 
{
	private String nome;
	private String dataCompra;
	private boolean statusFunc;
	
	public Equipamento(String nome, String dataCompra, boolean statusFunc) 
	{
		this.nome = nome;
		this.dataCompra = dataCompra;
		this.statusFunc = statusFunc;
	}

	public void regStatus(boolean status) 
	{
		this.statusFunc = status;
	}
	
	@Override
	public String toString()
	{
		if(this.statusFunc)
			return "Equipamento: " + this.nome + "\nData de compra: " + this.dataCompra + "\nSituação: em uso\n";
		else
			return "Equipamento: " + this.nome + "\nData de compra: " + this.dataCompra + "\nSituação: quebrado\n";
	}

	public String getNome() 
	{
		return this.nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getDataCompra() 
	{
		return this.dataCompra;
	}

	public void setDataCompra(String dataCompra) 
	{
		this.dataCompra = dataCompra;
	}

	public boolean isStatusFunc() 
	{
		return this.statusFunc;
	}

	public void setStatusFunc(boolean statusFunc) 
	{
		this.statusFunc = statusFunc;
	}
}
