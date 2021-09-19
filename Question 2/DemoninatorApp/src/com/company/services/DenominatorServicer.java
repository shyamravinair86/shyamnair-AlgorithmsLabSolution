package com.company.services;

import java.util.Scanner;

public class DenominatorServicer {
    int NUM_DENOMINATORS, amount;
    int[] denominators, currencyCounter;
    Scanner sc = new Scanner(System.in);

    public void denominatorImplementor() {
        System.out.println("Enter the size of currency denominations");
        NUM_DENOMINATORS = sc.nextInt();

        denominators = new int[NUM_DENOMINATORS];
        getCurrencies();

        System.out.println();
        System.out.println("Enter the amount you want to pay");
        amount = sc.nextInt();
        sc.close();

        findDenominations();
    }

    private void getCurrencies() {
        System.out.println();
        System.out.println("Enter the currency denominations value");
        for (int i = 0; i < NUM_DENOMINATORS; i++) {
            denominators[i] = sc.nextInt();
        }
    }

    private void findDenominations() {
        SortingServicer.sort(denominators, 0, denominators.length - 1);

        currencyCounter = new int[NUM_DENOMINATORS];

        for (int i = 0; i < NUM_DENOMINATORS; i++) {
            if(amount >= denominators[i]) {
                currencyCounter[i] = amount / denominators[i];
                amount -= currencyCounter[i] * denominators[i];
            }
        }

        printDenominations();
    }

    private void printDenominations() {
        System.out.println();
        System.out.println("Your payment approach in order to give min no of notes will be");
        for (int i = 0; i < NUM_DENOMINATORS; i++) {
            if (currencyCounter[i] != 0) {
                System.out.println(denominators[i] + " : " + currencyCounter[i]);
            }
        }
    }




}
