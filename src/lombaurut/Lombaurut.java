package lombaurut;

import com.mkdika.Xutil;
import java.io.IOException;
import java.util.Scanner;

public class Lombaurut {
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
            int a,b,c,d;  
            int temp = 0;
            d = x.length;
            for(b = 1; b <x.length-1; b++){
                c = x[b];
                for(a = b-1; a<=0 && (x[a]<c); a --){
                    x[a+1] = x[a];
                 }
                x[a+1] = c;
                 }     
            
                 Xutil.writeTxtFileFromArray(x, "sorted.dat");      
                 int[] e = Xutil.readTxtFileToArray("sorted.dat");
         
            for(b = (x.length)-1;b > x.length/2;b--){
                
                e[b] = temp;
                e[b] = e[(d-b)-1];
                e[(d-b)-1] = temp;  
                }
             Xutil.writeTxtFileFromArray(e, "sorted.dat");
        // =====================================================================
        // END
        long end = Xutil.getTime();

        System.out.println("Total execution time (nano sec): " + Xutil.executionTime(start, end));       
        Xutil.writeTxtFileFromArray(x, "sorted.dat");
    }

}
