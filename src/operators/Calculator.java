package operators;


import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("enter second number : ");
        int num2 = sc.nextInt();
        Operations obj = new Operations();
        System.out.print("choose the operations(+ , - , * , / , %) :");
        String oper = sc.next();

        if (oper != "+" || oper != "-" || oper != "*" || oper != "/" || oper != "%") {
            System.out.println("wrong opeartion input ");
            return;
        }

        switch (oper) {
            case "+":
                System.out.println("result : " + obj.add(num1, num2));
                break;
            case "-":
                System.out.println("result : " + obj.sub(num1, num2));
                break;
            case "*":
                System.out.println("result : " + obj.mult(num1, num2));
                break;
            case "/":
                System.out.println("result : " + obj.div(num1, num2));
                break;
            case "%":
                System.out.println("result : " + obj.mod(num1, num2));
                break;
            default:
                System.out.println("Please choose operations wisely");
        }
    }

}

class Operations {
    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public int sub(int number1, int number2) {
        return number1 - number2;
    }

    public int mult(int number1, int number2) {
        return number1 * number2;
    }

    public float div(int number1, int number2) {
        return number1 / number2;
    }

    public int mod(int number1, int number2) {
        return number1 % number2;
    }
}
