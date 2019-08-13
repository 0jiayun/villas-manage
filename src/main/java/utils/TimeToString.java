package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeToString {
    public static String getNowTimeString(){
        SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatStr2 =formatter2.format(new Date());

        return formatStr2;

    }
}
