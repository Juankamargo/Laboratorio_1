/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Juan Carlos Camargo Lizarazo
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int n ;
        java.util.Scanner read = new java.util.Scanner(System.in);
        System.out.println("Enter the number of accounts.");
        n = read.nextInt();
        Account[] accounts;
        accounts = new Account[n];
        for(int i=1;i<=n;i++)
        {
            accounts[i] = new Account();
            System.out.println("Creating account number "+ i);
            accounts[i].createAccount();
        }
        System.out.println("You´re done creating the accounts.");
        
        while(1<2)
        {
        System.out.println("Select an account to make an operation.");
        int se;
        for(int i=1;i<=n;i++)
        {
            System.out.println("Account's owner: " + accounts[i].showOwner());
        }
        se = read.nextInt();
        System.out.println("Select an operation.");
        System.out.println("1.  Consign money");
        System.out.println("2.  Retire money");
        System.out.println("3.  Change access code");
        System.out.println("4.  Check info of an account");
        
        switch(se)
        {
            case 1:
                    {
                        System.out.println("Enter the money to consign: ");
                        double money;
                        money = read.nextDouble();
                        accounts[se].consign(money);
                        System.out.println("New balance:  " + accounts[1].Balance());
                        break;
                    }
            case 2:
                    {
                        System.out.println("Enter the money to retire: ");
                        double money ;
                        money = read.nextDouble();
                        accounts[se].retire(money);
                        System.out.println("New balance:  " + accounts[1].Balance());
                        break;
                    }
            case 3:
                    {
                        System.out.println("Enter the new access code: ");
                        int money ;
                        money = read.nextInt();
                        accounts[se].changeAccessCode(money);
                        System.out.println("Access code changed correctly.");
                        break;
                    }
            case 4:
                    {
                        accounts[se].printAccount();
                        break;
                    }
            default:
            {
                System.out.println("Enter a valid option.");
            }
            
            }
        }
    }
}
