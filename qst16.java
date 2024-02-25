/*Write a java program to display the current date and time in any format */

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class qst16 {
    public static void main(String[] args) {

        DateTimeFormatter variable1= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime currentDateTime = LocalDateTime.now();
        String formattedDateTime = currentDateTime.format(variable1);
       System.out.println("The Current Date and time is" + formattedDateTime); 
    }
}
