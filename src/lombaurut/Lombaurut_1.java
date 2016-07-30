package lombaurut;

import com.mkdika.Xutil;
import java.io.IOException;
import java.util.Arrays;

public class Lombaurut_1 {
    public static void main(String[] args) throws IOException {

        // Baca text file, masukan isi text file kedalam variable array.       
        int[] x = Xutil.readTxtFileToArray("random.dat");
        if (x == null || x.length <= 0) {
            System.out.println("Error read text file. try again.");
            return;
        }else {
            System.out.println("Array Length: " + x.length);
        }
        
        long start = Xutil.getTime();
        // BEGIN - YOUR CODE HERE
        // =====================================================================

        // Baseline Example - Used Bubble Sort Algorithm
           Arrays.sort(x);
        // =====================================================================
        // END
        long end = Xutil.getTime();

        System.out.println("Total execution time (nano sec): " + Xutil.executionTime(start, end));       
        Xutil.writeTxtFileFromArray(x, "sorted.dat");
    }

}
