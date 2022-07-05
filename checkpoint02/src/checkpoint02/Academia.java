package checkpoint02;
import java.util.List;
import java.util.ArrayList;

public class Academia 
{
	private String endereco;
	private String dataCriacao;
	private List<Aluno> alunos;
	private List<Funcionario> funcionarios;
	private List<Equipamento> equipamentos;
	
	public Academia(String endereco, String dataCriacao)
	{
		this.endereco = endereco;
		this.dataCriacao = dataCriacao;
		this.alunos = new ArrayList<Aluno>();
		this.funcionarios = new ArrayList<Funcionario>();
		this.equipamentos = new ArrayList<Equipamento>();
	}

	public Academia(String endereco, String dataCriacao, List<Aluno> alunos, List<Funcionario> funcionarios,
			List<Equipamento> equipamentos) 
	{
		this.endereco = endereco;
		this.dataCriacao = dataCriacao;
		this.alunos = alunos;
		this.funcionarios = funcionarios;
		this.equipamentos = equipamentos;
	}

	public double balancoMensal() 
	{
		double gastos = 0.0;
		double ganhos = 0.0;
		
		for(int i = 0; i < this.funcionarios.size(); i++)
		{
			if(funcionarios.get(i) instanceof Instrutor)
				gastos += ((Instrutor)this.funcionarios.get(i)).calcularPagamento();
			else if(funcionarios.get(i) instanceof Nutricionista)
				gastos += ((Nutricionista)this.funcionarios.get(i)).calcularPagamento();
			else
				gastos += ((ServicosGerais)this.funcionarios.get(i)).getSalario();
		}
		
		for(int i = 0; i < this.alunos.size(); i++)
		{
			if(this.alunos.get(i).getPlano().getStatus())
				ganhos += this.alunos.get(i).getPlano().getValor();
		}
		
		return ganhos - gastos;
	}

	public String getEndereco() 
	{
		return this.endereco;
	}

	public void setEndereco(String endereco) 
	{
		this.endereco = endereco;
	}

	public String getDataCriacao() 
	{
		return this.dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) 
	{
		this.dataCriacao = dataCriacao;
	}

	public List<Aluno> getAlunos() 
	{
		return this.alunos;
	}

	public void setAlunos(List<Aluno> alunos) 
	{
		this.alunos = alunos;
	}

	public List<Funcionario> getFuncionarios() 
	{
		return this.funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) 
	{
		this.funcionarios = funcionarios;
	}

	public List<Equipamento> getEquipamentos() 
	{
		return this.equipamentos;
	}

	public void setEquipamentos(List<Equipamento> equipamentos) 
	{
		this.equipamentos = equipamentos;
	}

}
