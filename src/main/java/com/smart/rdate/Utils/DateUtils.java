package com.smart.rdate.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public static Date getDate(String str){

        Date parse = null;
        try {
            parse = simpleDateFormat.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parse;
    }
    public static String getString(Date date){
        String format = simpleDateFormat.format(date);
        return format;
    }
}
