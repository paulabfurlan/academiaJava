package checkpoint02;

public class Instrutor extends Funcionario implements Pagamento
{
	private double adicDomingo;
	private int horasDomingo;
	private double valorHora;
	
	public Instrutor(String nome, int matricula, double qtdHoras, double valorHora, double adicDomingo, int horasDomingo) throws RangeException
	{
		super(nome, matricula, qtdHoras);
		this.horasDomingo = horasDomingo;
		this.valorHora = valorHora;

		if((adicDomingo >= 1.0) || (adicDomingo < 0.0))
			throw new RangeException("O adicional é um valor percentual, então precisa ser um valor entre 0 e 1");
		else
			this.adicDomingo = adicDomingo;
	}

	@Override
	public double calcularPagamento() 
	{
		return (double)super.getQtdHoras() * this.valorHora + (1.0 + this.adicDomingo) * (double)this.horasDomingo * this.valorHora;
	}
	
	public void regHorasDomingo(int horasDomingo) 
	{
		this.horasDomingo += horasDomingo;
	}

	public double getAdicDomingo() 
	{
		return this.adicDomingo;
	}

	public void setAdicDomingo(double adicDomingo) 
	{
		this.adicDomingo = adicDomingo;
	}

	public int getHorasDomingo() 
	{
		return this.horasDomingo;
	}

	public void setHorasDomingo(int horasDomingo) 
	{
		this.horasDomingo = horasDomingo;
	}

	public double getValorHora() 
	{
		return valorHora;
	}

	public void setValorHora(double valorHora) 
	{
		this.valorHora = valorHora;
	}
}
