public class Program_3_1 {
    public static void main(String[] args){
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 10 % 10);

        System.out.print("What is " + number1 + " + "
        + number2 + "? ");

        java.util.Scanner input = new java.util.Scanner(System.in);
        int result = input.nextInt();

        System.out.print(number1 + " + " + number2 + " = "
        + result + " is " + (result == number1 + number2));
    }
}
