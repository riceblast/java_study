public class ShowCurrentTime$$ {
    public static void main(String[] args){
        long totalMilliseconds = System.currentTimeMillis();
        //System.out.println(totalMilliseconds);

        //计算秒
        /*这里为什么用long，而不用double？或者说为什么要
        *除1000，而不是1000.0。假设最后三位是355，
        *如果用double,后面的计算会有无穷的麻烦，同时逻辑上也不对，
        * 而如果用long或者（int等等），后三位被舍去，结果就相当于
        * 现在是x秒355毫秒，如果我们不看毫秒，结果就是x秒，这是符合
        * 我们的逻辑的，毕竟我们不会说x.355秒。
         */
        //这里totalMilliseconds/1000是整数相除，故结果还是整数，不涉及类型转换
        long totalSeconds = totalMilliseconds / 1000;

        /*总秒数关于60的余数就是当前时间(相当于n分钟即n个60秒过去了，
        剩下的，不足60s的就是现在是对于00：00：00的秒数，即当前秒数）
         */
        long currentSecond = totalSeconds % 60;

        //计算分钟
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        //计算小时
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        /*最后计算所得的时间是和GMT的00：00：00的相比，故北京时间应
        加上八小时时差
         */
        System.out.print("现在是 北京时间" + (currentHour + 8) +
                ":" + currentMinute + ":" + currentSecond);

    }
}
