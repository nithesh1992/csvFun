import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Nithesh on 8/21/2016.
 */
public class csvAccess {
    public static void main(String[] args) throws  IOException {

        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader("data.csv"));
            String[] line;
            while ((line = reader.readNext()) != null) {
                System.out.println("Col-1: = " + line[0] + ", Col-2: " + line[1] + " , Col-3: " + line[2] + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
