import java.io.IOException;
import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public double getValue(String title) {
        System.out.printf("%s", title);
        return in.nextDouble();
    }

    public String getOperation(String title) {
        System.out.printf("%s", title);
        return in.next();
    }

    public void print(double data1, double data2, String title) throws IOException {
        if (data2>=0) {
            System.out.printf("%s %.3f +%.3fi\n", title, data1, data2);
            Logger.logger(title+data1+"+"+data2+"i");
        }else {
            System.out.printf("%s %.3f %.3fi\n", title, data1, data2);
            Logger.logger(title+data1+data2+"i");
        }

    }

}
