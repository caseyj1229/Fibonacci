import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What number in the Fibonacci Sequence do you want? Enter -1 to exit.");
        while(input.hasNextInt()) {
            int i = input.nextInt();

            if(i < 0){
                break;
            }

            if (i % 10 == 1) {
                System.out.println("The " + i + "st Fibonacci number is: " + fibonacci(i));
                System.out.println("What number in the Fibonacci Sequence do you want? Enter -1 to exit.");
            }
            else if (i % 10 == 2) {
                System.out.println("The " + i + "nd Fibonacci number is: " + fibonacci(i));
                System.out.println("What number in the Fibonacci Sequence do you want? Enter -1 to exit.");
            }
            else if (i % 10 == 3) {
                System.out.println("The " + i + "rd Fibonacci number is: " + fibonacci(i));
                System.out.println("What number in the Fibonacci Sequence do you want? Enter -1 to exit.");
            }
            else {
                System.out.println("The " + i + "th Fibonacci number is: " + fibonacci(i));
                System.out.println("What number in the Fibonacci Sequence do you want? Enter -1 to exit.");
            }

        }
    }

    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n==2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
