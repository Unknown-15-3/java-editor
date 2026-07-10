package lesson12;

import java.util.Scanner;

public class cbs {
    public static void main(String[] args) {
        boolean infiniteloop = true;
        double[] accountBalance = new double[1000];
        String[] accountName = new String[1000];

        int option, size = 100;

        while(infiniteloop){
            System.out.println("welcome to codingal banking services");
            System.out.println("Banking Menu:");
            System.out.println("Select any one option from below:");
            System.out.println("1. Add customer");
            System.out.println("2. Change customer name");
            System.out.println("3. Update account balance");
            System.out.println("4. check account balance");
            System.out.println("5. summary of accounts");
            System.out.println("6. Exit");

            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            if (option == 1){
                System.out.println("\n add customer names \n menu ->");
                sc.nextLine();
                System.out.println("\n Ender customer name: ");
                String name = sc.nextLine();
                accountName[size] = name;
                System.out.println("\n Enter opening balance account: ");
                double balance = sc.nextDouble();
                accountBalance[size] = balance;
                System.out.println("Account created succesfully \n");
                System.out.println("Account details: \n");
                System.out.println("Account number: " + size);
                System.out.println("Customer name: " + accountName[size]);
                System.out.println("Account balance: " + accountBalance[size] + "Rs \n");
                System.out.println("--------------------------------------------");

                size = size + 1;
            } else if ( option == 2); 
            System.out.println("\n Change Customer Name \n menu ->");
            System.out.println("enter your account number: ");
            int accountIndex;
            String temp;

            accountIndex = sc.nextInt();
            sc.nextLine();

            if (accountIndex > size){
                System.out.println("account does not exist");
                System.out.println("Terminating_____");
            } else{
                temp = accountName[accountIndex];
                System.out.println("Enter your new name:");
                String name = sc.nextLine();
                accountName[accountIndex] = name;
                System.out.println("Customer name updated successfully." + temp +  "to " + name + "\n");
            }
        System.out.println("--------------------------------------------");
            } else if (option == 3){
                System.out.println("\n check account balance \n menu ->");
                System.out.println("enter your account number: ");
                int accountIndex = sc.nextInt();
                sc.nextLine();

                if (accountIndex >= size){
                    System.out.println("account does not exist");
                    System.out.println("Terminating_____");
                } else{
                    System.out.println("Account balance: " + accountBalance[accountIndex] + "Rs \n");
                }
            }
        }
    }
}


