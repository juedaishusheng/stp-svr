package com.el.util;

import java.util.Calendar;
import java.util.Random;

/**
 * Created by Kitty on 2016/8/12.
 */
public class DocNoUtil {
    public synchronized static String getNum() {
        StringBuffer sb = new StringBuffer();
        Calendar c = Calendar.getInstance();
        String year = String.valueOf(c.get(Calendar.YEAR));
        String month = String.valueOf(c.get(Calendar.MONTH)+1);
        month = String.format("%02d", Long.parseLong(month));
        String date = String.valueOf(c.get(Calendar.DATE));
        date = String.format("%02d", Long.parseLong(date));
        sb.append(year);
        sb.append(month);
        sb.append(date);
        /*sb.append(getLastSixNum());*/
        return sb.toString();
    }

    public static String getLastSixNum() {
        int count = 0;
        char str[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        StringBuffer pwd = new StringBuffer("");
        Random r = new Random();
        while (count < 6) {
            int i = Math.abs(r.nextInt(10));
            if (i >= 0 && i < str.length) {
                pwd.append(str[i]);
                count++;
            }
        }
        return pwd.toString();
    }
}
