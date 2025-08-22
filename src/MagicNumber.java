import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magicNumber;
        int attempts = 0;

        do{
            System.out.println("enter magic number");
            magicNumber = scanner.nextInt();
            attempts ++;
            if(attempts == 3){
                System.out.println("Hint : Magic Number is single digit highest number");
            }
            if(magicNumber == 9){
                System.out.println("Hurray!!!!!!!!!");
            }
            if (attempts == 6){
                System.out.println("Attempts exhausted Exiting.........");
                break;
            }

        } while ( magicNumber != 9);
    }
}
