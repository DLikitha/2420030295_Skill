package myproject;
import java.util.*;
public class calenderclass {
    public static void main(String[]args) {
    	Calendar c = Calendar.getInstance();
    	Date d = c.getTime();
    	System.out.println(d);
    	c.set(2023,c.JANUARY,10);
    	int year = c.getWeekYear();
    	System.out.println(year);
    	int h = c.getFirstDayOfWeek();
    	System.out.println(h);
    	int time = c.getWeeksInWeekYear();
    	System.out.println(time);
    }
    
}
