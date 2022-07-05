package checkpoint02;

public class ServicosGerais extends Funcionario 
{
	private double salario;
	
	public ServicosGerais(String nome, int matricula, double qtdHoras, double salario) 
	{
		super(nome, matricula, qtdHoras);
		this.salario = salario;
	}

	public double getSalario() 
	{
		return salario;
	}

	public void setSalario(double salario) 
	{
		this.salario = salario;
	}
}
