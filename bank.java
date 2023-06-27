package banking system;

import java.util.*;

// Compiler version JDK 11.0.2

class bank{
        String name;
        int account_number;
        float amount;
     void insert(String  n,int a,float a1){
      
      name=n;
      account_number=a;
      amount=a1;
      }
      void deposit(float a1){
        amount=amount+a1;
        System.out.println(a1+":deposit");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }
        void withdraw(float a1){
          if(amount<a1){
            System.out.println("insufficent balance");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            }else{
              amount=amount-a1;
              System.out.println(a1+":withdrwn");
              System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
              }
             
              }
                void checkBalance(){
                  System.out.println("persent balance in your bank:"+amount);
                  System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
              }
              void display(){
                System.out.println("name="+name);
                System.out.println("Acconunt number="+account_number);
                System.out.println("amount="+amount);
System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");                
          }
         
         
   public static void main(String args[])
   {
    System.out.println("Hello, Dcoder!");
    Scanner sc=new Scanner(System.in);
   
   
    bank b=new bank();
   
    System.out.println("give details of account holder:\n");
    System.out.println("                    *******                 ");
   System.out.println("Name of account holder:");
    String n=sc.nextLine();
   System.out.println("Account number of holder:");
    int a=sc.nextInt();
    b.insert(n,a,10000);
    b.display();
    System.out.println("**************************************************");
    System.out.println("press 1 for deposit money in account");
    System.out.println("**************************************************");
     System.out.println("press 2 for withdraw");
     System.out.println("**************************************************");
   
    System.out.println("press 3 for check balance ");
    System.out.println("***********************************************************");

   
    int userInput=sc.nextInt();
   
    if(userInput==1){
      System.out.println(" amount for deposit");
      int q=sc.nextInt();
      b.deposit(q);
      b.display();
   
    }
    else if(userInput==2){
      System.out.println("give amount you withdraw");
      int w=sc.nextInt();
      b.withdraw(w);
      b.display();
      }
      else if(userInput==3){
        b.checkBalance();
        }
        else{
      System.out.println("invalid");
  
   }
   }
}