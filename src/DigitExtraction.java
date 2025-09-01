public class DigitExtraction {
    public static void main(String[] args) {
        int number = 123;
        while (number > 0){
            int digit = number % 10;
            System.out.println(digit);
            number = number / 10;
        }

        System.out.println(sumOfDigits(12345));
    }
    public static int sumOfDigits(int number){
        int sum = 0;
        while(number > 0){
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }
}
//12345
//15
