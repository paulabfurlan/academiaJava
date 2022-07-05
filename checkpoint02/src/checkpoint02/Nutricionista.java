package checkpoint02;

public class Nutricionista extends Funcionario implements Pagamento 
{
	private double valorHora;
	
	public Nutricionista(String nome, int matricula, double qtdHoras, double valorHora) 
	{
		super(nome, matricula, qtdHoras);
		this.valorHora = valorHora;
	}

	@Override
	public double calcularPagamento() {
		return super.getQtdHoras() * this.valorHora;
	}
	
	public void regHorasDesconto(int horas, double desconto)
	{
		double aux = (double)horas * desconto;
		aux += super.getQtdHoras();
		super.setQtdHoras(aux);
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
