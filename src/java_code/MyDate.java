package java_code;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by abner on 7/14/15.
 */
public class MyDate {
    public String whatDayToday(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss EE");
        return sdf.format(date);
    }

    public static void main(String[] args) {

        //java invoke Groovy code
        Song song =  new Song();
        song.setName("kobe");
        System.out.println(song.getName());
    }
}
