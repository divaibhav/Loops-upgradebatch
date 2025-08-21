import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for multiplication table");
        int number = scanner.nextInt();
        int multiplier = 1;
        do{
           
            System.out.println(number + " * " + multiplier + " = " + number * multiplier);
            multiplier ++;
        }while (multiplier <= 10);

    }
}
