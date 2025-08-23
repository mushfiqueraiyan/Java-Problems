import java.util.*;

class AtmWithdrawal {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
       
       System.out.print("Enter the amount of balance: ");
       int balance = inp.nextInt();
       
       System.out.print("Enter the number of withdrawal attempts: ");
       int n = inp.nextInt();
       
       int[] amount = new int[n];
       
       for(int i = 0; i < n; i++){
           System.out.print("Enter the attempt " + i + ": ");
           amount[i] = inp.nextInt();
           
           if(amount[i] > balance){
               System.out.println("Unsufficient Balance");
           }
           else if(amount[i] % 5 == 0){
               if( amount[i] <= balance){
                   balance = balance - amount[i];
               System.out.println("Withdrawal Successful amount remainin: "+ balance);
               }
           }
           else{
               System.out.print("Invalid Request");
           }
       }
       System.out.println("Final balance: " + balance);
    }
}