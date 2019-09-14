import java.util.Scanner;
public class ComputeArea {
    public static void main(String[] args){
        //首先建立double类型的变量用于存储半径和计算结果
        double radius;
        double area;

        //新建Scanner类对象，用于获取输入
        Scanner input = new Scanner(System.in);

        System.out.print("enter a number: ");
        radius = input.nextDouble();

        area = radius * radius * 3.14;

        //输出结果
        System.out.print("the area for the radius " + radius +
                " is " + area);
    }

}
