package com.source.time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/**
 * @Author LiuYang
 * @Date 2019/9/23/023  9:34
 * @Version 1.0
 **/
public class TimeDemo02 {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        System.out.printf("year:%s,month:%s,day:%s \n",ldt.getYear(),ldt.getMonthValue(),ldt.getDayOfMonth());

        //创建指定日期
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt1=LocalDateTime.of(2019,9,22,8,23,55);
        System.out.println(ldt1.format(dtf));

        System.out.println(ldt.equals(ldt1));

        /**
         * 检查生日日期
         */
        LocalDate today=LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(2010, 9, 23);
        MonthDay birthday = MonthDay.of(dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth());
        MonthDay currentMonthDay = MonthDay.from(today);


        if(currentMonthDay.equals(birthday)){
            System.out.println("Many Many happy returns of the day !!");
        }else {
            System.out.println("Sorry, today is not your birthday");
        }


        //获取当前时间
        DateTimeFormatter patern=DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        LocalTime lt=LocalTime.now();
        System.out.println(ldt.format(patern));

        //获取当前时间下周日期
        LocalDate localDate=LocalDate.now();
        LocalDate localDate1=localDate.plus(1, ChronoUnit.WEEKS);
        System.out.println(localDate1);

        /**
         * 获取美国时区
         */
        ZoneId america = ZoneId.of("America/New_York");
        LocalDateTime localtDateAndTime = LocalDateTime.now();
        ZonedDateTime dateAndTimeInNewYork  = ZonedDateTime.of(localtDateAndTime, america );
        System.out.println("Current date and time in a particular timezone : " + dateAndTimeInNewYork);

        //计算两个日期相差的天数
        Period period=Period.between(ldt.toLocalDate(),ldt1.toLocalDate());
        System.out.println("Month:"+period.getMonths()+"  day:"+period.getDays());
    }
}
