package Exercícios.ContaBancaria;

import java.util.Scanner;

public class Exec {

    public static void main( String[] args ) {

        Scanner input = new Scanner( System.in );

        Banco Inter = new Banco();

        while (true) {

            System.out.println(
                    "\nPesquisa de banco:" +
                    "\n1 : Criar conta" +
                    "\n2 : Selecionar conta" +
                    "\n3 : Remover conta" +
                    "\n4 : Gerar relatório" +
                    "\n5 : Finalizar" );

            int controle = input.nextInt();

            switch ( controle ) {

                case 1:

                    System.out.println( "Que tipo de conta?" +
                                        "\n1 : Conta Poupança" +
                                        "\n2 : Conta Corrente" );

                    int controleConta = input.nextInt();

                    if (controleConta == 1) {

                        System.out.println( "Inclua numero da conta: " );
                        String numeroDaConta = input.next();

                        System.out.println( "Inclua saldo: " );
                        double saldo = input.nextDouble();
                        ContaBancaria conta = new ContaPoupanca( numeroDaConta , saldo );
                        Inter.inserir( conta );

                        System.out.println( "\nCom sucesso." );
                    }

                    else if (controleConta == 2) {

                        System.out.println( "Inclua número da conta: " );
                        String numeroDaConta = input.next();

                        System.out.println( "Inclua saldo: " );
                        double saldo = input.nextDouble();

                        ContaBancaria conta = new ContaCorrente( numeroDaConta , saldo );
                        Inter.inserir( conta );
                        System.out.println( "\nCom sucesso." );
                    }

                    break;

                case 2:

                    System.out.println( "Informe o número da conta: " );
                    String numeroDaConta = input.next();

                    if (Inter.procurarConta( numeroDaConta ) != null) {

                        System.out.println( "O que deseja:" +
                                            "\n1 : Depositar" +
                                            "\n2 : Sacar" +
                                            "\n3 : Tranferir" +
                                            "\n4 : Gerar relatório" +
                                            "\n5 : Voltar" );

                        int controle2 = input.nextInt();

                        if (controle2 == 1) {

                            System.out.println( "Digite a quantia desejada: " );
                            double quantia = input.nextDouble();
                            Inter.procurarConta( numeroDaConta ).depositar( quantia );
                        }

                        else if (controle2 == 2) {

                            System.out.println( "Digite a quantia desejada: " );
                            double quantia = input.nextDouble();
                            Inter.procurarConta( numeroDaConta ).sacar( quantia );
                        }

                        else if (controle2 == 3) {

                            System.out.println( "Digite o numero de outra conta: " );
                            String outraConta = input.next();

                            if (Inter.procurarConta( outraConta ) != null) {
                                System.out.println( "Digite a quantia: " );
                                double quantia = input.nextDouble();
                                Inter.procurarConta( numeroDaConta ).transferir( quantia , Inter.procurarConta( outraConta ) );
                            }

                            else System.out.println( "Esta conta não foi encontrada." );
                        }

                        else if (controle2 == 4) {
                            Inter.procurarConta( numeroDaConta ).mostrarDados();
                        }

                        else if (controle2 == 5) {
                            continue;
                        }
                    }

                    else System.out.println( "Conta não encontrada." );

                    break;

                case 3:

                    System.out.println( "Informe o número da conta: " );
                    String conta = input.next();

                    if (Inter.procurarConta( conta ) != null) {
                        Inter.remover( Inter.procurarConta( conta ) );
                        System.out.println( "Sucesso na remoção." );
                    }

                    else System.out.println( "Conta não encontrada." );

                    break;

                case 4:

                    Inter.mostrarDados();

                    break;

                case 5:

                    return;
            }
        }
    }
}
