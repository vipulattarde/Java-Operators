package operators;

import java.util.Scanner;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Age:");
        int age=sc.nextInt();
        int costOfTicket=3000;
        if (age<5||age>60) {
            costOfTicket=costOfTicket/2;
        System.out.println("Traveller is eligible for half ticket : "+costOfTicket);
        }
        else if (age>=5&&age<=60){
        System.out.println("Ticket cost: "+costOfTicket);
        }

    }
}
