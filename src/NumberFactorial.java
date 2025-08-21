import java.util.Scanner;

public class NumberFactorial {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int factorial = 1;
        while(number > 0){
            factorial = factorial * number;
            number --;
        }
        System.out.println("factorial = " + factorial);
    }
}
