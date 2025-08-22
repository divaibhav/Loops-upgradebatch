import java.util.Scanner;

public class MenuDrivenAction {
    //press 1 for addition
    //press 2 for substraction
    //press 3 for division
    //press 4 for multiplication
    //press 5 to exit
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Choose from the below option");
            System.out.println("press 1 for addition");
            System.out.println("press 2 for substraction");
            System.out.println("press 3 for division");
            System.out.println("press 4 for multiplication");
            System.out.println("press 5 to exit");

            option = scanner.nextInt();
            if(option >= 1 && option <=4) {
                System.out.println("Enter number1");
                int number1 = scanner.nextInt();
                System.out.println("Enter number2");
                int number2 = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Addition done");

                        break;
                    case 2:
                        System.out.println("Substraction done");
                        break;
                    case 3:
                        if(number2 == 0){
                            System.out.println("Number 2 cannot be zero for division\n\n\n\n\n");
                            continue;

                        }
                        int result = number1 / number2;
                        System.out.println("result = " + result);
                        break;
                    case 4:
                        System.out.println("Multiplication done");
                        break;

                }

            } else if(option !=5){
                System.out.println("Invalid option, select valid options or press 5 to exit");
            }
        } while(option != 5);
    }
}
