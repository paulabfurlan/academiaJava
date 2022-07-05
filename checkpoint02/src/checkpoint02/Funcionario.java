package checkpoint02;

public abstract class Funcionario 
{
	private String nome;
	private int matricula;
	private double qtdHoras;

	public Funcionario(String nome, int matricula, double qtdHoras) 
	{
		this.nome = nome;
		this.matricula = matricula;
		this.qtdHoras = qtdHoras;
	}

	public void regHoras(double horas) 
	{
		this.qtdHoras += horas;
	}
	
	@Override
	public String toString()
	{
		return "Nome: " + this.nome + "\nMatricula: " + this.matricula + "\n\n";
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public int getMatricula() 
	{
		return matricula;
	}

	public void setMatricula(int matricula) 
	{
		this.matricula = matricula;
	}

	public double getQtdHoras() 
	{
		return qtdHoras;
	}

	public void setQtdHoras(double qtdHoras) 
	{
		this.qtdHoras = qtdHoras;
	}
	
	
}
