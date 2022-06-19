//****************************************************************Account.java**************************************************************************************

public class Account{
    private int accountId;
    private String accountType;
    private int balance;
    public int getAccountId(){
        return accountId;
    }
    public String getAccountType(){
        return accountType;
    }
    public int getBalance(){
        return balance;
    }
    public void setAccountId(int id){
        accountId = id;
    }
    public void setAccountType(String s){
        accountType = s;
    }
    public void setBalance(int b){
        balance = b;
    }
    public boolean withdraw(int w){
        if(getBalance() < w){
            System.out.println("Sorry!!! No enough balance");
            return false;
        }
        else{
            System.out.println("Balance amount after withdraw: "+(getBalance()+w));
            return true;
        }
    }
}


















//*************************************************************************AccountDetails.java***********************************************************************

import java.util.Scanner;

public class AccountDetails{
    public static Account getAccountDetails(){
        Account acc = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account id:");
        acc.setAccountId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter account type:");
        acc.setAccountType(sc.nextLine());
        int b;
        do{
            System.out.println("Enter balance");
            acc.setBalance(sc.nextInt());
            b=acc.getBalance();
            if(b <= 0)
            System.out.println("Balance should be positive");
        }
        while(b <= 0);
        return acc;
    }
    public static int getWithdrawAmount(){
        Scanner sc = new Scanner(System.in);
        int w;
        do{
            System.out.println("Enter amount to be withdrawn:");
            w = sc.nextInt();
            if(w <= 0)
            System.out.println("Amount should be positive");
        }
        while(w <= 0);
        return w;
    }
    public static void main(String[] args){
        Account accObj = new Account();
        accObj = getAccountDetails();
        int c = getWithdrawAmount();
        accObj.withdraw(c);
    }
}
