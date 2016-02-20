/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author usuario
 */
public class Account 
{
    java.util.Scanner read = new java.util.Scanner(System.in);
    private String Number;
    private int accessCode;
    private String Owner;
    private double balance; 
    public Account()
    {

    }
    public void consign (double moneyToConsign)
    {
        this.balance = this.balance+moneyToConsign;
        System.out.println(moneyToConsign + "have been consigned to " + Owner + " new balance is: " + this.balance);
    }
    public void retire (double moneyToRetire)
    {
        this.balance = this.balance-moneyToRetire;
        System.out.println(moneyToRetire + "have been retired from " + Owner + " new balance is: " + this.balance);
    }
    public void changeAccessCode (int newAccessCode)
    {
        this.accessCode = newAccessCode;
        System.out.println(this.Owner + " code acess has been changed to " + newAccessCode);
    }
    public void checkBalance ()
    {
        System.out.println(this.Owner + " balance is:  " + this.balance);
    }
        public double Balance ()
    {
        return this.balance;
    }
    public String showOwner ()
    {
        return this.Owner;
    }
    public void createAccount()
    {
        String number;
        int accessCode; 
        String owner;
        double balance;
        System.out.println("You´re about to create an account. Enter the information of the account below.");
        System.out.println("Enter the number of the account.");
        number = read.nextLine();
        System.out.println("The number " + number + " is now the account's number.");
        System.out.println("Enter the access code of the account.");
        accessCode = read.nextInt();
        System.out.println("The number " + accessCode + " is now the account's access code.");
        System.out.println("Enter the owner of the account.");
        owner = read.nextLine();
        System.out.println("The owner " + owner + " is now the account's owner.");
        System.out.println("Enter the balance of the account.");
        balance = read.nextDouble();
        System.out.println("The number " + balance + " is the new balance.");
        this.Number = number;
        this.accessCode = accessCode;
        this.Owner = owner;
        this.balance = balance;
        System.out.println("The account was succefully created");
    }
    public void printAccount()
    {
        System.out.println("Account's Information:  ");
        System.out.println("Number: " + this.Number);
        System.out.println("Access code: " + this.accessCode);
        System.out.println("Owner: " + this.Owner);
        System.out.println("Balance: " + this.balance);     
        
    }
}
