package Provas.AP2.br.ufc.quixada.si.view;

import Provas.AP2.br.ufc.quixada.si.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class Principal {

    private static List<Pessoa>    pessoas    = new ArrayList<>();
    private static List<Operadora> operadoras = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        Scanner read = new Scanner(in);

        while(true) {
            System.out.print("Ana Saúde" +
                    "\n1: Cadastrar Operadora    2: Cadastrar Cliente" +
                    "\n3: Cadastrar Funcionário    4: Cadastrar Contrato    0: Sair" +
                    "\nDigite uma das opções: ");
            int entradaPrincipal = read.nextInt();

            switch(entradaPrincipal) {
                case 1: {
                    System.out.print("Digite o código: ");
                    int codOperadora = read.nextInt();
                    System.out.print("Digite o nome: ");
                    read.nextLine();
                    String nome = read.nextLine();

                    Operadora operadora = new Operadora(codOperadora, nome, new ArrayList<>(), new ArrayList<>());
                    operadoras.add(operadora);
                }
                break;
                case 2: {
                    System.out.print("1: Pessoa Física    2: Pessoa Jurídica" +
                            "\nDigite uma das opções: ");
                    int entrada = read.nextInt();

                    read.nextLine();
                    System.out.print("Digite o nome: ");
                    String nome = read.nextLine();
                    System.out.print("Digite o endereço: ");
                    String endereco = read.nextLine();
                    System.out.print("Digite o cpf: ");
                    String cpf = read.nextLine();

                    if(entrada == 1) {
                        System.out.print("Digite a data de nascimento, ano - mês - dia, separado por um espaço: ");
                        LocalDate dataNascimento = LocalDate.of(read.nextInt(), read.nextInt(), read.nextInt());

                        Cliente cliente = new ClientePessoaFisica(nome, endereco, cpf, dataNascimento);
                        pessoas.add(cliente);
                    } else if(entrada == 2) {
                        System.out.print("Digite a data de abertura, ano - mês - dia, separado por um espaço: ");
                        LocalDate dataAbertura = LocalDate.of(read.nextInt(), read.nextInt(), read.nextInt());

                        Cliente cliente = new ClientePessoaJuridica(nome, endereco, cpf, dataAbertura);
                        pessoas.add(cliente);
                    }
                    break;
                }
                case 3: {
                    System.out.print("1: Vendedor    2: Serviços Gerais    3: Analista" +
                            "\nDigite uma opção: ");
                    int entrada = read.nextInt();
                    read.nextLine();
                    System.out.print("Digite o nome: ");
                    String nome = read.nextLine();
                    System.out.print("Digite o CPF: ");
                    String cpf = read.nextLine();
                    System.out.print("Digite a matrícula: ");
                    String matricula = read.nextLine();
                    System.out.print("Digite o salário: ");
                    float salario = read.nextFloat();

                    if(entrada == 1) {
                        Funcionario funcionario = new Vendedor(nome, cpf, matricula, salario);
                        pessoas.add(funcionario);
                    } else if(entrada == 2) {
                        Funcionario funcionario = new ServicosGerais(nome, cpf, matricula, salario);
                        pessoas.add(funcionario);
                    } else if(entrada == 3) {
                        Funcionario funcionario = new Analista(nome, cpf, matricula, salario);
                        pessoas.add(funcionario);
                    }

                    break;
                }
                case 4: {
                    System.out.print("Digite o código do contrato: ");
                    int codContrato = read.nextInt();
                    read.nextLine();
                    System.out.print("Digite o CPF do cliente: ");
                    String cpfCliente = read.nextLine();

                    System.out.print("Digite o CPF do vendedor: ");
                    String cpfVendedor = read.nextLine();

                    System.out.print("Digite a data de início, ano - mês - dia, separado por um espaço: ");
                    LocalDate dataInicio = LocalDate.of(read.nextInt(), read.nextInt(), read.nextInt());

                    System.out.print("Digite o valor do contrato: ");
                    float valorContrato = read.nextFloat();

                    System.out.print("Digite o código da operadora: ");
                    int codOperadora = read.nextInt();

                    Cliente cliente = new ClientePessoaFisica();
                    for(Pessoa c : pessoas) {
                        if(c instanceof ClientePessoaFisica) {
                            if(((ClientePessoaFisica) c).getCpf().equals(cpfCliente)) {
                                cliente = (ClientePessoaFisica) c;
                            }
                        }

                    }

                    Vendedor vendedor = new Vendedor();
                    for(Pessoa c : pessoas) {
                        if(c instanceof Vendedor) {
                            if(((Vendedor) c).getCpf().equals(cpfVendedor)) {
                                vendedor = (Vendedor) c;
                            }
                        }
                    }

                    Contrato contrato = new Contrato(codContrato, cliente, vendedor, dataInicio, valorContrato);
                    vendedor.realizarVenda(valorContrato);

                    Operadora operadora = new Operadora();
                    for(Operadora c : operadoras) {
                        if(c.getCodOperadora() == codOperadora) {
                            operadora = c;
                        }
                    }

                    read.nextLine();
                    System.out.print("Digite o CPF do analista: ");
                    String cpfAnalista = read.nextLine();

                    for(Pessoa d : pessoas) {
                        if(d instanceof Analista) {
                            if(((Analista) d).getCpf().equals(cpfAnalista)) {
                                ((Analista) d).processarContrato(operadora, contrato);
                            }
                        }
                    }

                    operadora.mostrarContratos();
                    System.out.println();
                    System.out.println(vendedor.getSalario());
                    break;
                }
                case 0:
                    return;
                default:
                    System.out.println("Inválido.");
            }
        }

    }
}
