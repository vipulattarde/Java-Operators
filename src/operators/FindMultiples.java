package operators;
import java.util.Scanner;
public class FindMultiples {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int number=sc.nextInt();
        for (int i = 2; i <=number/2; i++) {
            if(number%i==0){
                System.out.println(number+" Is a multiple of "+i);
            }

        }


    }
}
