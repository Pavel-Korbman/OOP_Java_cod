package View;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;

public class Logger {
    public static void logger(String string) throws IOException {
        java.time.LocalDate localDate = java.time.LocalDate.now();
        java.time.LocalTime time = java.time.LocalTime.now();
        LocalTime timeres = LocalTime.of(time.getHour(),time.getMinute());
        FileWriter fw = new FileWriter("log.txt", true);
        fw.append(localDate.toString());
        fw.append(' ');
        fw.append(timeres.toString());
        fw.append(' ');
        fw.append(string);
        fw.append('\n');
        fw.flush();
    }
}
