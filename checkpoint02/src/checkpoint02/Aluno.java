package checkpoint02;

public class Aluno 
{
	private String nome;
	private String cpf;
	private double freqPerc;
	private Plano plano;

	public Aluno(String nome, String cpf, double freqPerc, Plano plano) throws RangeException
	{
		this.nome = nome;
		this.freqPerc = freqPerc;
		this.plano = plano;
		
		if(cpf.length() != 11)
			throw new RangeException("O CPF deve conter apenas numeros e seu tamanho é 11");
		else
			this.cpf = cpf;
	}

	public boolean regFrequencia(int qtdDias) 
	{
		double aux = (double)qtdDias / (double)this.plano.getQtdDias();
		
		if((aux + this.freqPerc) <= 1.0)
		{
			this.freqPerc += aux;
			return true;
		}
		else
		{
			return false;
		}
	}

	public void pagar() 
	{
		int aux = this.plano.getTempoFidelidade();
		this.plano.setStatus(true);
		this.plano.setTempoFidelidade(aux - 30);
	}
	
	@Override
	public String toString()
	{
		if(this.plano.getStatus())
			return "Nome: " + this.nome + "\nCPF: " + this.cpf + "\nSituação pagamento: em dia\n";
		else
			return "Nome: " + this.nome + "\nCPF: " + this.cpf + "\nSituação pagamento: inadimplente\n";
	}

	public String getNome() 
	{
		return this.nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getCpf() 
	{
		return this.cpf;
	}

	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}

	public double getFreqPerc() 
	{
		return this.freqPerc;
	}

	public void setFreqPerc(double freqPerc) 
	{
		this.freqPerc = freqPerc;
	}

	public Plano getPlano() 
	{
		return this.plano;
	}

	public void setPlano(Plano plano) 
	{
		this.plano = plano;
	}

}
