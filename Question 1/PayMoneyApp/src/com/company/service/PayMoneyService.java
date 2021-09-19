package com.company.service;

import java.util.Scanner;

public class PayMoneyService {
    private int NUM_TRANSACTIONS, NUM_TARGETS, TARGET ;
    private int[] transactions;
    Scanner sc = new Scanner(System.in);

    public void implementPayMoney() {
        System.out.println("Enter the size of transaction array");
        NUM_TRANSACTIONS = sc.nextInt();
        transactions = new int[NUM_TRANSACTIONS];

        System.out.println("Enter the values of array");
        getTransactions();

        System.out.println("Enter the total no of targets that needs to be achieved");
        NUM_TARGETS = sc.nextInt();
        getTargets();
    }

    private void getTransactions() {
        for (int i = 0; i < NUM_TRANSACTIONS; i++) {
            transactions[i] = sc.nextInt();
        }
    }

    private void getTargets() {
        while (NUM_TARGETS != 0) {
            System.out.println();
            System.out.println("Enter the value of target");
            TARGET = sc.nextInt();
            checkTarget();
            NUM_TARGETS--;
        }
    }

    private void checkTarget() {
        long sum = 0;

        for (int j = 0; j < transactions.length; j++) {
            sum += transactions[j];
            if (sum >= TARGET) {
                System.out.println("Target achieved after " + (j + 1) + " transactions");
                break;
            }
        }

        if (sum < TARGET) {
            System.out.println("Given target is not achieved");
        }
    }

}
