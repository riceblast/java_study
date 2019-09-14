import java.util.Scanner;
public class Program_3_3 {
    public static void main(String[] args){
        int number1,number2;
        //产生随机数
        number1 = (int)(Math.random() * 10);
        number2 = (int)(Math.random() * 10);

        if(number1 < number2){
            int temp;
            temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.print("What is " +
                number1 + " - " + number2 + " ? ");

        //新建Scanner对象，获取输入
        Scanner input = new Scanner(System.in);

        int result = input.nextInt();

        if(result == (number1 - number2)){
            System.out.println("Right");
        }
        else{
            System.out.println("闸总");
        }

    }//main
}
