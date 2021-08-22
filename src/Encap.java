import java.text.SimpleDateFormat;
import java.util.Date;

public class Encap {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM");
        System.out.println("Current Month in MMMM Format : " + simpleDateFormat.format(date));
    }
}
