package checkpoint02;

public class Maquina extends Equipamento 
{
	private int prazoManutencao;

	public Maquina(String nome, String dataCompra, boolean statusFunc, int prazoManutencao) 
	{
		super(nome, dataCompra, statusFunc);
		this.prazoManutencao = prazoManutencao;
	}

	@Override
	public void regStatus(boolean status) 
	{
		super.setStatusFunc(status);
		
		if(status == false)
			this.prazoManutencao = 0;
	}

	public int getPrazoManutencao() 
	{
		return this.prazoManutencao;
	}

	public void setPrazoManutencao(int prazoManutencao) 
	{
		this.prazoManutencao = prazoManutencao;
	}

}
