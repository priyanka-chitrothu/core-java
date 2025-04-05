package stringExamples;

// To get current in reverse order

import net.bytebuddy.asm.Advice;

import javax.swing.text.DateFormatter;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime {
    public static void main(String[] args){
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter Formatter= DateTimeFormatter.ofPattern("HH:mm:ss");
        String timeString = currentTime.format(Formatter);

        String reversedTime = new StringBuffer(timeString).reverse().toString();
        System.out.println(timeString);
        System.out.println(reversedTime);

    }
}
