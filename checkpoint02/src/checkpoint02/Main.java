package checkpoint02;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem-vindo ao sistema de gerenciamento da Academia Sport Performance!");
		System.out.println("Por favor, digite o endere�o desta sede:");
		String endereco = sc.nextLine();
		System.out.println("Digite agora a data de cria��o desta sede:");
		String data = sc.nextLine();
		Academia academia = new Academia(endereco, data);
		
		int op = 0;
		while(op != 8)
		{
			System.out.println("Menu de servi�os:");
			System.out.print("1 - Cadastrar novo aluno\n2 - Cadastrar novo funcionario\n3 - Cadastrar novo equipamento\n"
					+ "4 - Servi�os de Alunos\n5 - Servi�os de Funcionarios\n6 - Calcular balan�o do m�s\n7 - Servi�os de equipamentos\n"
					+ "8 - Sair\nEscolha uma op��o do menu acima: ");
			op = sc.nextInt();
			
			int auxI, auxI2, auxI3;
			double auxD, auxD2;
			String auxS, auxS2, auxS3;
			List<Aluno> alunos;
			List<Funcionario> funcionarios;
			List<Equipamento> equipamentos;
		    
			switch(op)
			{
				case 1:
					System.out.println("\n\n\n----------Cadastro de Alunos----------");
					System.out.println("Digite os seguintes dados do plano contratado:\nQtd de dias por m�s: ");
					auxI = sc.nextInt();
					System.out.println("Valor mensal: ");
					auxD = sc.nextDouble();
					System.out.println("Fidelidade em dias: ");
					auxI2 = sc.nextInt();
					Plano plano = new Plano(auxI, auxD, auxI2, false);
					
					System.out.println("Digite agora os seguintes dados do aluno:");
					System.out.print("Nome: ");
					auxS = sc.nextLine();
					auxS = sc.nextLine();
					System.out.print("CPF: ");
					auxS2 = sc.nextLine();
					try
					{
						Aluno aluno = new Aluno(auxS, auxS2, 0.0, plano);
						System.out.println("Aluno cadastrado com sucesso! Este aluno j� pagou a primeira mensalidade? (s/n)");
						auxS = sc.next();
						plano.setStatus(auxS.equals("s"));
						if(plano.getStatus())
						{
							aluno.pagar();
							aluno.setPlano(plano);
						}
						alunos = academia.getAlunos();
						alunos.add(aluno);
						academia.setAlunos(alunos);
					}
			        catch (RangeException e)
					{
			            System.err.println(e.getMessage());
			        }
					break;
					
				case 2:
					System.out.println("\n\n\n----------Cadastro de Funcionarios----------");
					System.out.println("Qual o tipo de funcion�rio?\n1 - Instrutor\n2 - Servi�os Gerais\n3 - Nutricionista");
					auxI = sc.nextInt();
					switch(auxI)
					{
						case 1:
							System.out.println("Digite os dados do instrutor abaixo:\nNome: ");
							auxS = sc.nextLine();
							auxS = sc.nextLine();
							System.out.println("Matr�cula: ");
							auxI2 = sc.nextInt();
							System.out.println("Valor da hora: ");
							auxD = sc.nextDouble();
							System.out.println("Percentual do adicional de Domingo: ");
							auxD2 = sc.nextDouble();
							
							try
							{
								Funcionario instrutor = new Instrutor(auxS, auxI2, 0.0, auxD, auxD2, 0);
								funcionarios = academia.getFuncionarios();
								funcionarios.add(instrutor);
								academia.setFuncionarios(funcionarios);
								System.out.println("Instrutor cadastrado com sucesso!");
							}
					        catch (RangeException e)
							{
					            System.err.println(e.getMessage());
					        }
							break;
							
						case 2:
							System.out.println("Digite os dados do colaborador abaixo:\nNome: ");
							auxS = sc.nextLine();
							auxS = sc.nextLine();
							System.out.println("Matr�cula: ");
							auxI2 = sc.nextInt();
							System.out.println("Salario: ");
							auxD = sc.nextDouble();
							
							Funcionario servGerais = new ServicosGerais(auxS, auxI2, 0.0, auxD);
							funcionarios = academia.getFuncionarios();
							funcionarios.add(servGerais);
							academia.setFuncionarios(funcionarios);
							System.out.println("Colaborador cadastrado com sucesso!");
							break;
							
						case 3:
							System.out.println("Digite os dados do nutricionista abaixo:\nNome: ");
							auxS = sc.nextLine();
							auxS = sc.nextLine();
							System.out.println("Matr�cula: ");
							auxI2 = sc.nextInt();
							System.out.println("Valor da hora: ");
							auxD = sc.nextDouble();
							
							Funcionario nutri = new Nutricionista(auxS, auxI2, 0.0, auxD);
							funcionarios = academia.getFuncionarios();
							funcionarios.add(nutri);
							academia.setFuncionarios(funcionarios);
							System.out.println("Nutricionista cadastrado com sucesso!");
							break;
					}
					break;
					
				case 3:
					System.out.println("\n\n\n----------Cadastro de Equipamentos----------");
					System.out.println("Qual o tipo de equipamento?\n1 - M�quina\n2 - Itens m�veis");
					auxI = sc.nextInt();
					switch(auxI)
					{
						case 1:
							System.out.println("Digite os dados da m�quina abaixo:\nNome: ");
							auxS = sc.nextLine();
							auxS = sc.nextLine();
							System.out.println("Data da compra: ");
							auxS2 = sc.nextLine();
							System.out.println("Tempo em dias para a pr�xima manuten��o: ");
							auxI2 = sc.nextInt();
							
							Equipamento maquina = new Maquina(auxS, auxS2, true, auxI2);
							equipamentos = academia.getEquipamentos();
							equipamentos.add(maquina);
							academia.setEquipamentos(equipamentos);
							System.out.println("M�quina cadastrada com sucesso!");
							break;
							
						case 2:
							System.out.println("Digite os dados do equipamento abaixo:\nNome: ");
							auxS = sc.nextLine();
							auxS = sc.nextLine();
							System.out.println("Data da compra: ");
							auxS2 = sc.nextLine();
							System.out.println("Finalidade (for�a/aer�bicos/misto): ");
							auxS3 = sc.nextLine();
							
							Equipamento movel = new Movel(auxS, auxS2, true, auxS3);
							equipamentos = academia.getEquipamentos();
							equipamentos.add(movel);
							academia.setEquipamentos(equipamentos);
							System.out.println("Equipamento cadastrado com sucesso!");
							break;
					}
					break;
					
				case 4:
					System.out.println("\n\n\n----------Servi�os de Alunos----------");
					System.out.println("1 - Listar alunos\n2 - Registrar frequ�ncia\n3 - Registrar pagamento");
					auxI = sc.nextInt();
					switch(auxI)
					{
						case 1:
							alunos = academia.getAlunos();
							for(int i = 0; i < alunos.size(); i++)
							{
								System.out.println(alunos.get(i).toString());
							}
							break;

						case 2:
							System.out.println("Digite o CPF do aluno para o registro: ");
							auxS = sc.next();
							System.out.println("Agora digite a quantidade de dias frequentados neste m�s: ");
							auxI2 = sc.nextInt();

							alunos = academia.getAlunos();
							for(Aluno aluno: alunos)
							{
								if(aluno.getCpf().equals(auxS))
								{
									aluno.regFrequencia(auxI2);
									System.out.println("Registro de frequ�ncia realizado para o aluno:\n" + aluno.toString());
								}
							}
							break;
							
						case 3:
							System.out.println("Digite o CPF do aluno para pagamento: ");
							auxS = sc.next();

							alunos = academia.getAlunos();
							for(Aluno aluno: alunos)
							{
								if(aluno.getCpf().equals(auxS))
								{
									aluno.pagar();
									System.out.println("Pagamento realizado pelo aluno:\n" + aluno.toString());
								}
							}
							break;
					}
					break;
					
				case 5:
					System.out.println("\n\n\n----------Servi�os de Funcionarios----------");
					System.out.println("1 - Listar funcionarios\n2 - Registrar frequ�ncia");
					auxI = sc.nextInt();
					switch(auxI)
					{
						case 1:
							funcionarios = academia.getFuncionarios();
							for(int i = 0; i < funcionarios.size(); i++)
							{
								System.out.println(funcionarios.get(i).toString());
							}
							break;
							
						case 2:
							System.out.println("Digite a matr�cula do funcionario: ");
							auxI2 = sc.nextInt();
							funcionarios = academia.getFuncionarios();
							for(Funcionario funcionario: funcionarios)
							{
								if(funcionario.getMatricula() == auxI2)
								{
									if(funcionario instanceof Instrutor)
									{
										System.out.println("Digite as horas trabalhadas no domingo: ");
										auxI3 = sc.nextInt();
										((Instrutor) funcionario).regHorasDomingo(auxI3);
										
										System.out.println("Digite as horas trabalhadas nos outros dias: ");
										auxD = sc.nextDouble();
										funcionario.regHoras(auxD);
									}
									else if(funcionario instanceof Nutricionista)
									{
										System.out.println("Digite as horas trabalhadas com desconto: ");
										auxI3 = sc.nextInt();
										System.out.println("Digite o percentual de desconto: ");
										auxD = sc.nextDouble();
										((Nutricionista) funcionario).regHorasDesconto(auxI3, auxD);
										
										System.out.println("Digite as horas trabalhadas sem desconto: ");
										auxD = sc.nextDouble();
										funcionario.regHoras(auxD);
									}
									else
									{
										System.out.println("Digite as horas trabalhadas: ");
										auxD = sc.nextDouble();
										funcionario.regHoras(auxD);
									}
								}
							}
							break;
					}
					
				case 6:
					System.out.println("\n\n\n----------Balan�o do m�s----------");
					System.out.println("O balan�o do m�s foi: " + academia.balancoMensal());
					break;
					
				case 7:
					System.out.println("\n\n\n----------Servi�os de equipamentos----------");
					System.out.println("1 - Listar equipamentos\n2 - Registrar status do equipamento");
					auxI = sc.nextInt();
					switch(auxI)
					{
						case 1:
							equipamentos = academia.getEquipamentos();
							for(int i = 0; i < equipamentos.size(); i++)
							{
								System.out.println(equipamentos.get(i).toString());
							}
							break;
							
						case 2:
							System.out.println("Qual o nome do equipamento?");
							auxS = sc.nextLine();
							auxS = sc.nextLine();
							System.out.println("Qual a data de compra do equipamento?");
							auxS2 = sc.nextLine();
							System.out.println("O equipamento est� funcionando (s/n)?");
							auxS3 = sc.nextLine();
							
							equipamentos = academia.getEquipamentos();
							for(Equipamento equipamento: equipamentos)
							{
								if(equipamento.getNome().toLowerCase().equals(auxS.toLowerCase()) && equipamento.getDataCompra().equals(auxS2))
								{
									if(auxS3.equals("s"))
										equipamento.setStatusFunc(true);
									else
										equipamento.setStatusFunc(false);
								}
							}
							break;
					}
					break;

			}
			System.out.println("\n\n\n\n");
		}
		
		System.out.println("\n\nSaindo...");
		System.out.println("Foi um prazer t�-lo aqui, volte sempre!");
		
		sc.close();
	}
}
