public class SomethingWorthNoticing$$ {
    public static void main(String[] args){

        System.out.println("输出时“+”的作用问题（连接或求和）");
        System.out.println(1 + 2);
        System.out.println("smw" + 1 + 2);
        System.out.println();

        System.out.println("括号的存在与否对于结果的影响");
        System.out.println((double)1/2);//先将1转成1.0，再计算1.0/2
        System.out.println((double)(1/2));//先计算1/2，结果为0，再将0转成0.0
        System.out.println();

        System.out.println("在计算除法时，容易因为忽略数字类型而出错");
        double a = Math.pow(16,1/2);//(1 / 2) 整型除整型，计算结果还是整型，只剩下0
        double b = Math.pow(16,1.0/2);//(1.0 / 2)结果为双精度浮点数，计算结果正确
        System.out.println(a);
        System.out.println(b);
    }
}
