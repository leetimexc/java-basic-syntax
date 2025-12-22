package com.cainiao.array;

import java.time.LocalDate;

public class DateTime {
    public static void main(String[] args) {

        // 获取当前日期
        LocalDate today = LocalDate.now();
        System.out.println("当前日期: " + today);

        // 创建特定日期
        LocalDate nationalDay = LocalDate.of(2025, 10, 1);
        System.out.println("国庆节: " + nationalDay);

        // 日期加减
        LocalDate tomorrow = today.plusDays(1);
        LocalDate nextMonth = today.plusMonths(1);
        LocalDate lastYear = today.minusYears(1);

        System.out.println("明天: " + tomorrow);
        System.out.println("下个月: " + nextMonth);
        System.out.println("去年: " + lastYear);
    }
}
