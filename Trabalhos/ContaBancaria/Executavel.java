package Trabalhos.ContaBancaria;

import java.util.Scanner;

public class Executavel {

    private static void menu_principal(Banco banco) {

        Scanner input = new Scanner(System.in);

        int criar_conta      = 1;
        int selecionar_conta = 2;
        int remover_conta    = 3;
        int gerar_relatorio  = 4;

        System.out.println(
                "\nMENU DO BANCO" +
                "\nDigite uma das opções abaixo: " +
                "\n1 : Criar conta" +
                "\n2 : Selecionar conta" +
                "\n3 : Remover conta" +
                "\n4 : Gerar relatório" +
                "\n5 : Finalizar");

        int entrada_do_cliente = input.nextInt();

        if(entrada_do_cliente == criar_conta) {

            menu_criar_conta(banco);
        }
        else if(entrada_do_cliente == selecionar_conta) {

            menu_selecionar_conta(banco);
        }
        else if(entrada_do_cliente == remover_conta) {

            remover_conta(banco);
        }
        else if(entrada_do_cliente == gerar_relatorio) {

            banco.mostrarDados();
            menu_principal(banco);
        }
    }

    private static void menu_criar_conta(Banco banco) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tipo de conta:" +
                           "\n1 : Conta Poupança" +
                           "\n2 : Conta Corrente");

        int entrada_do_cliente = input.nextInt();

        String numero_da_conta = criar_conta_entrada(entrada_do_cliente, banco);

        if(banco.procurarConta(numero_da_conta) != null) {

            System.out.println("Conta criada com sucesso.");
            menu_principal(banco);
        }
        else System.out.println("Houve erro ao criar a conta.");
        menu_principal(banco);
    }

    private static String criar_conta_entrada(int entrada_do_cliente, Banco banco) {

        Scanner input = new Scanner(System.in);

        int conta_poupanca = 1;
        int conta_corrente = 2;

        if(entrada_do_cliente == conta_corrente) {

            System.out.println("Digite o número da conta: ");
            String numero_da_conta = input.next();

            System.out.println("Digite o saldo da conta: ");
            double saldo_da_conta = input.nextDouble();

            ContaCorrente conta = new ContaCorrente(numero_da_conta, saldo_da_conta);
            banco.inserir(conta);

            return numero_da_conta;
        }
        else if(entrada_do_cliente == conta_poupanca) {

            System.out.println("Digite o número da conta: ");
            String numero_da_conta = input.next();

            System.out.println("Digite o saldo da conta: ");
            double saldo_da_conta = input.nextDouble();
            ContaPoupanca conta = new ContaPoupanca(numero_da_conta, saldo_da_conta);
            banco.inserir(conta);

            return numero_da_conta;
        }
        else {
            System.out.println("Erro ao encontrar o tipo de conta digitado.");
            menu_principal(banco);

            return null;
        }
    }

    private static void menu_selecionar_conta(Banco banco) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o número da conta: ");
        String numeroDaConta = input.next();

        int depositar       = 1;
        int sacar           = 2;
        int transferir      = 3;
        int gerar_relatorio = 4;
        int voltar          = 5;

        if(banco.procurarConta(numeroDaConta) != null) {

            System.out.println("Digite uma das opcões abaixo:" +
                               "\n1 : Depositar" +
                               "\n2 : Sacar" +
                               "\n3 : Tranferir" +
                               "\n4 : Gerar relatório" +
                               "\n5 : Voltar");

            int entrada_do_cliente = input.nextInt();

            if(entrada_do_cliente == depositar) {

                System.out.println("Digite a quantia desejada: ");
                double quantia = input.nextDouble();
                banco.procurarConta(numeroDaConta).depositar(quantia);

                System.out.println("A quantia foi depositada.");
                menu_principal(banco);
            }
            else if(entrada_do_cliente == sacar) {

                System.out.println("Digite a quantia desejada: ");
                double quantia = input.nextDouble();
                banco.procurarConta(numeroDaConta).sacar(quantia);

                System.out.println("A quantia foi sacada.");
                menu_principal(banco);
            }
            else if(entrada_do_cliente == transferir) {

                System.out.println("Digite o numero da conta que vai receber a tranferência: ");
                String conta_receptora = input.next();

                if(banco.procurarConta(conta_receptora) != null) {

                    System.out.println("Digite a quantia: ");
                    double quantia = input.nextDouble();
                    banco.procurarConta(numeroDaConta).transferir(quantia, banco.procurarConta(conta_receptora));

                    System.out.println("A quantia foi tranferida.");
                    menu_principal(banco);
                }
                else {
                    System.out.println("Esta conta não foi encontrada.");
                    menu_principal(banco);
                }
            }
            else if(entrada_do_cliente == gerar_relatorio) {
                banco.procurarConta(numeroDaConta).mostrarDados();
                menu_principal(banco);
            }
            else if(entrada_do_cliente == voltar) {
                menu_principal(banco);
            }
        }
        else {
            System.out.println("Conta não encontrada.");
            menu_principal(banco);
        }
    }

    private static void remover_conta(Banco banco) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o número da conta: ");
        String conta = input.next();

        if(banco.procurarConta(conta) != null) {
            banco.remover(banco.procurarConta(conta));

            if(banco.procurarConta(conta) == null) {

                System.out.println("Conta removida.");
                menu_principal(banco);
            }
            else {
                System.out.println("Houve um erro na remoção.");
                menu_principal(banco);
            }
        }
        else {
            System.out.println("Conta não encontrada.");
            menu_principal(banco);
        }
    }

    public static void main(String[] args) {

        Banco banco = new Banco();
        menu_principal(banco);
    }
}
