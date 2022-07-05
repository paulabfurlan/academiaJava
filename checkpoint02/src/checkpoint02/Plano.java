package checkpoint02;

public class Plano 
{
	private int qtdDias;
	private double valor;
	private int tempoFidelidade;
	private boolean status;
	
	public Plano(int qtdDias, double valor, int tempoFidelidade, boolean status) 
	{
		this.qtdDias = qtdDias;
		this.valor = valor;
		this.tempoFidelidade = tempoFidelidade;
		this.status = status;
	}

	public int getQtdDias() 
	{
		return this.qtdDias;
	}

	public void setQtdDias(int qtdDias) 
	{
		this.qtdDias = qtdDias;
	}

	public double getValor() 
	{
		return this.valor;
	}

	public void setValor(double valor) 
	{
		this.valor = valor;
	}

	public int getTempoFidelidade() 
	{
		return this.tempoFidelidade;
	}

	public void setTempoFidelidade(int tempoFidelidade) 
	{
		this.tempoFidelidade = tempoFidelidade;
	}

	public boolean getStatus() 
	{
		return this.status;
	}

	public void setStatus(boolean status) 
	{
		this.status = status;
	}

}
