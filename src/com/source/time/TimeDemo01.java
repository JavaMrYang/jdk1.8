package com.source.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Author LiuYang
 * @Date 2019/9/23/023  9:14
 * @Version 1.0
 **/
public class TimeDemo01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println("当前年:"+localDateTime.getYear());
        System.out.println("当前小时数:"+localDateTime.getHour());
        /**
         * ldt.getMinute();获取分钟
         *
         * ldt.getHour();获取小时
         *
         * getDayOfMonth   获得月份天数(1-31)
         * getDayOfYear   获得年份天数(1-366)
         * getDayOfWeek   获得星期几(返回一个 DayOfWeek枚举值)
         * getMonth   获得月份, 返回一个Month枚举值
         * getMonthValue   获得月份(1-12)
         * getYear   获得年份
         */

        /**
         *isAfter()判断一个日期是否在指定日期之后  返回boolean 类型
         *
         * isBefore()判断一个日期是否在指定日期之前   返回boolean 类型
         *
         * isLeapYear()判断是否是闰年(这个是LocalDate类中的方法)  返回boolean类型
         */
        String time="2019-09-21 10:05:56";
        String patter="yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf=new SimpleDateFormat(patter);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern(patter);
        LocalDateTime ldt= LocalDateTime.parse(time,dtf);
        System.out.println(localDateTime.isAfter(ldt));;
        System.out.println(localDateTime.isBefore(ldt));
        System.out.println("判断是否是闰年:"+ldt.toLocalDate().isLeapYear());
        //减去年月日时分秒的方法：minus系列的方法   返回一个新的LocalDateTime对象
        LocalDateTime ldt1= ldt.minusYears(5).plusMonths(5);
        LocalDateTime ldt2=ldt.minusHours(1);
        System.out.println(ldt1.format(dtf));
        System.out.println(ldt2.format(dtf));
        //指定年月日时分秒的方法：  with系列
        System.out.println(ldt.withYear(2016).format(dtf));
    }
}
