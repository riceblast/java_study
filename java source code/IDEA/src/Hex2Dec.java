//java语言程序设计与数据结构：程序清单：6-8(P189)
import java.util.Scanner;
public class Hex2Dec {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("请输入一个16进制的数字");
        String hexString=input.nextLine();//以字符串的方式获取16进制数字
        int decValue=hexToDcimal(hexString.toUpperCase());
        System.out.println(decValue);
    }

    public static int hexToDcimal(String hexValue){
        int dec = 0;
        for(int i=0;i<hexValue.length();i++){
            char hexChar = hexValue.charAt(i);
            dec = dec*16 + hexCharToDec(hexChar);
        }
        return dec;
    }

    public static int hexCharToDec(char hexChar){
        if(hexChar>='A'&&hexChar<='F')
            return (hexChar-'A'+10);
        else{
            return (hexChar - '0');
        }
    }
}
