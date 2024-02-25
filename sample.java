import java.util.Scanner;

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY;
}

public class sample{
    Day day;
    //constructor
    public sample(Day day){
        this.day = day;
    }
    //Prints a line about Day using switch
    public void dayIsLike(){
        switch (day){
            case MONDAY:
            System.out.println("MONDAYS ARE BAD.");
            break;
            case FRIDAY:
            System.out.println("Fridays are better.");
            break;
            case SATURDAY:
            case SUNDAY:
            System.out.println("Weekends are best");
            break;
            default:
            System.out.println("Midweek days are so-so");
            break;
        }
    }
    public static void main(String[] args) {
        String str = "MONDAY";
        sample t1 = new sample(Day.valueOf(str));
        t1.dayIsLike(); 
    }
}