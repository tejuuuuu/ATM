import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {


        int balance=10;

        Scanner sc = new Scanner(System.in);

        System.out.println("press 1 for balance enquiry");
        System.out.println("press 2 for cash withdraw");
        System.out.println("press 3 for cash Deposit");

        int input=sc.nextInt();

        if(input==1){
            checkBalance(balance);
        } else if (input==2) {
            System.out.print("Enter amount :");
            int amount=sc.nextInt();
            withdraw(balance,amount);
        } else if (input==3) {
            System.out.print("Enter amount :");
            int amount=sc.nextInt();
            deposit(balance,amount);
        }

    }

     static void deposit(int balance,int amount) {

        balance+=amount;
         System.out.println("Your curent balance is :" + balance);
    }

    static void withdraw(int balance,int amount) {

        balance-=amount;
         System.out.println("Your curent balance is :" + balance);

    }

    static void checkBalance(int balance){

        System.out.print("Your balance is rs " + balance);
    }


}
