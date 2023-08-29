package 날짜와시간;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
Date() : 운영체제로부터 날짜와 시간 정보를 가져와 원하는 포멧형태로 출력, 객체를 생성해야 함.
         자바의 java.util 패키지에 포함되어 있어 import를 해야 함.

*/
public class DateAndCal {
    public static void main(String[] args) {

        Date now = new Date();
        System.out.println(now);

        // yyyy : 년도를 4자리로 표시
        // yy : 년도를 2자리로 표시
        // MM : 월을 표시 (대문자임에 유의, 월이 2자리로 표시 됨)
        // mm : 시분초의 분을 나타냄
        // HH : 24시간제
        // hh : 12시간제

//        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
//        f1 = new SimpleDateFormat("yyyy-MM-dd");
//        f2 = new SimpleDateFormat("yy/MM/dd");
//        f3 = new SimpleDateFormat("yyyy년 MM월 dd일");
//        f4 = new SimpleDateFormat("HH:mm:ss");
//        f5 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        f6 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날 입니다.");
//        f7 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다.");
//
//        System.out.println(f1.format(now));
//        System.out.println(f2.format(now));
//        System.out.println(f3.format(now));
//        System.out.println(f4.format(now));
//        System.out.println(f5.format(now));
//        System.out.println(f6.format(now));
//        System.out.println(f7.format(now));

//        // 원하는 포멧으로 변경하기
//        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");      // 연, 월, 일
//        System.out.println(sdf.format(now));

        Calendar cal = Calendar.getInstance();      // 운영체제로부터 시간을 가져옴
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)+1); // index임을 유의해야 함
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));  // 주에서 몇번째 날인지
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.AM_PM));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));

        // Calender 클래스로 yyyy년 MM월 dd일 HH시 mm분 ss초 포맷과 동일하게 출력 하기

//        System.out.print(cal.get(Calendar.YEAR) + "년 ");
//        System.out.print(cal.get(Calendar.MONTH)+1 + "월 ");
//        System.out.print(cal.get(Calendar.DAY_OF_MONTH) + "일 ");
//        System.out.print(cal.get(Calendar.HOUR) + "시 ");
//        System.out.print(cal.get(Calendar.MINUTE) + "분 ");
//        System.out.print(cal.get(Calendar.SECOND) + "초 ");

        Calendar date = Calendar.getInstance();
        int year = date.get(Calendar.YEAR);
        int mon = date.get(Calendar.MONTH) + 1;
        int day = date.get(Calendar.DAY_OF_MONTH);
        int isPm = date.get(Calendar.AM_PM);
        int hour = date.get(Calendar.HOUR);
        int min = date.get(Calendar.MINUTE);
        int sec = date.get(Calendar.SECOND);
        if(isPm == 1) hour += 12;
        System.out.printf("%d년 %02d월 %02d일 %02d시 %02d분 %02d초 \n", year, mon, day, hour, min, sec);




    }
}
