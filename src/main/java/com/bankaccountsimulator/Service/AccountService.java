package com.bankaccountsimulator.Service;

import com.bankaccountsimulator.Domain.AccountBank;

public class AccountService {

    // Método para realizar um depósito
    public void deposit(AccountBank account, double amount) {
        if (amount > 0) {
            account.setBalance(account.getBalance() + amount);
            System.out.printf("Depósito de %.2f realizado com sucesso. Saldo atual: %.2f%n", amount, account.getBalance());
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    // Método para realizar um saque
    public void withdraw(AccountBank account, double amount) {
        if (amount > 0) {
            if (account.getBalance() >= amount) {
                account.setBalance(account.getBalance() - amount);
                System.out.printf("Saque de %.2f realizado com sucesso. Saldo atual: %.2f%n", amount, account.getBalance());
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        } else {
            System.out.println("O valor do saque deve ser positivo.");
        }
    }

    // Método para exibir o saldo
    public void showBalance(AccountBank account) {
        System.out.printf("O saldo atual da conta é: %.2f%n", account.getBalance());
    }
}