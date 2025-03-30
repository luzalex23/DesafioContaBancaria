package com.bankaccountsimulator.Application;

import com.bankaccountsimulator.Domain.AccountBank;
import com.bankaccountsimulator.Service.AccountService;
import com.bankaccountsimulator.Utils.ScannerUtil;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coleta de dados para criar uma conta bancária
        System.out.println("Bem-vindo ao Simulador de Banco!");
        System.out.println("Por favor, digite o número da Conta:");
        int number = ScannerUtil.readInt(scanner);

        System.out.println("Por favor, digite o número da Agência:");
        String agency = ScannerUtil.readString(scanner);

        System.out.println("Por favor, digite o nome do Cliente:");
        String clientName = ScannerUtil.readString(scanner);

        System.out.println("Por favor, digite o saldo inicial:");
        double balance = ScannerUtil.readDouble(scanner);

        // Criação da conta e do serviço
        AccountBank account = new AccountBank(number, agency, clientName, balance);
        AccountService service = new AccountService();

        System.out.printf("\nConta criada com sucesso! Olá %s, obrigado por criar uma conta em nosso banco.%n",
                account.getClientName());

        // Menu de operações
        int option;
        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Depósito");
            System.out.println("2. Saque");
            System.out.println("3. Exibir Saldo");
            System.out.println("0. Sair");
            option = ScannerUtil.readInt(scanner);

            switch (option) {
                case 1:
                    System.out.println("Digite o valor do depósito:");
                    double depositAmount = ScannerUtil.readDouble(scanner);
                    service.deposit(account, depositAmount);
                    break;

                case 2:
                    System.out.println("Digite o valor do saque:");
                    double withdrawAmount = ScannerUtil.readDouble(scanner);
                    service.withdraw(account, withdrawAmount);
                    break;

                case 3:
                    service.showBalance(account);
                    break;

                case 0:
                    System.out.println("Obrigado por usar o simulador de banco. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 0);
    }
}