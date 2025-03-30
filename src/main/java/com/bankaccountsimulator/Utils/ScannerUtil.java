package com.bankaccountsimulator.Utils;

import java.util.Scanner;

public class ScannerUtil {

    // Método para ler um número inteiro
    public static int readInt(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número válido.");
            }
        }
    }

    // Método para ler uma string
    public static String readString(Scanner scanner) {
        return scanner.nextLine().trim();
    }

    // Método para ler um número decimal (double)
    public static double readDouble(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine().replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um valor decimal válido.");
            }
        }
    }
}