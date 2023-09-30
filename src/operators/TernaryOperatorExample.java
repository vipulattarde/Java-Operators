package operators;

import java.util.Scanner;

public class TernaryOperatorExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value:");
        int val = sc.nextInt();

        int x = val >= 5 ? val++ : val--;

        System.out.println(x);
    }
}
