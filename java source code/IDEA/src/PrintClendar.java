//java程序语言设计与数据结构P198
import java.util.Scanner;
public class PrintClendar {
    public static void main(String[] args){
        //新建Scanner对象以获取输入
        Scanner input = new Scanner(System.in);
        //提示用户输入
        System.out.print("请输入年份：");
        int year = input.nextInt();
        System.out.print("请输入月份：");
        int month= input.nextInt();

        //打印输出日历
        printMonth(year,month);
    }

    //打印输出日历
    public static void printMonth(int year,int month){
        printMonthTitle(year,month);//打印表头
        System.out.println("");
        printMonthBody(year,month);//打印表体
    }

    //打印日历头
    public static void printMonthTitle(int year,int month){
        String monthName = getMonthName(month);
        System.out.println("       " + year + "     " + monthName);
        System.out.print("------------------------------");
    }

    //获取月份名称
    public static String getMonthName(int month){
        String monthName ="";
        switch(month){
            case 1: monthName = "January";break;
            case 2:monthName = "February";break;
            case 3:monthName =  "March";break;
            case 4:monthName = "April";break;
            case 5:monthName = "May";break;
            case 6:monthName = "June";break;
            case 7:monthName =  "July";break;
            case 8:monthName = "August";break;
            case 9:monthName = "September";break;
            case 10:monthName = "October";break;
            case 11:monthName = "November";break;
            case 12:monthName = "December";break;
        }
        return monthName;
    }

    //打印日历体
    public static void printMonthBody(int year,int month) {
        for(int i = 0;i <= 6;i+=1){//将表体第一行打印好
            String dayName = getDayName(i);
            System.out.print(" " + dayName);
        }
        System.out.println("");

        int weekDay = getStartDay(year,month);//本月头一天是星期几
        int numberOfDays = getNumberOfDaysInMonth(year,month);

        //先把本月第一天前的空格输出
        for(int i = 0;i < weekDay;i += 1)
            System.out.print("    ");

            //dayCount用于记录当前是本月的第几天
            for(int dayCount = 1;dayCount <= numberOfDays;dayCount += 1){
                System.out.printf("%4d",dayCount);
                //判断是否是星期天，若是，则使用println，同时将weekday置为0
                if(weekDay == 6) {
                    System.out.println("");
                    weekDay = -1;
                }
                weekDay += 1;
            }
    }

    //获取该月第一天的星期数
    public static int getStartDay(int year,int month){
        int weekDay = ((getTotalNumberOfDays(year,month)+3) % 7) ;
        return weekDay;
    }

    //获取总日子数，获取从1800年1月1日至该月头一天的天数总和
    public static int getTotalNumberOfDays(int year,int month){
        //先计算1800.1.1到year.1.1Y有多少天
        int totalDaysOfYear = 0;
        for(int yearCount = 1800;yearCount < year;yearCount+=1){
            if(isLeapYear(yearCount))//如果是闰年，则一年加366
                totalDaysOfYear += 366;
            else//如是平年则加365
                totalDaysOfYear +=365;
        }
        //然后计算从year.1.1到该月的头一天的天数
        int totalDaysOfMonth = 0;
            for(int monthCount = 1;monthCount < month;monthCount +=1)
                totalDaysOfMonth += getNumberOfDaysInMonth(year,monthCount);
        return (totalDaysOfYear + totalDaysOfMonth);
    }

    //获取每个月的天数，通过输入年数和月份，返回该年该月的天数
    public static int getNumberOfDaysInMonth(int year,int month){
        switch(month){
            case 1:;
            case 3:;
            case 5:;
            case 7:;
            case 8:;
            case 10:;
            case 12: return 31;

            case 4:;
            case 6:;
            case 9:;
            case 11:return 30;

            //这里只能使用default，而不能用case2，如果case2，该方法可能没有返回值
            default:{
                if(isLeapYear(year))
                    return 29;
                else
                    return 28;
            }
        }
    }

    //判断某一年是否是闰年
    public static boolean isLeapYear(int year){
        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
            return  true;
        else return false;
    }

    public static String getDayName(int day){
        String dayName = "";
        switch (day){
            case 0:dayName = "Sun";break;
            case 1:dayName = "Mon";break;
            case 2:dayName = "Tue";break;
            case 3:dayName = "Wed";break;
            case 4:dayName = "Thu";break;
            case 5:dayName = "Fri";break;
            case 6:dayName = "Sat";break;
        }
        return dayName;
    }
}
