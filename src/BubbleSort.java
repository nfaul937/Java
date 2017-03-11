
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class BubbleSort {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        String filename = "C:\\Users\\Nicholas\\Documents\\NetBeansProjects\\theNumbers.txt";
        
        Scanner fileinput = new Scanner(new File (filename));
        
        int[] data = new int[10];
        int temp;
        
        //Print out length of file
        System.out.println(data.length + "\n");
        int j = 0;
        
        while (fileinput.hasNextInt()) {
            int num = fileinput.nextInt();
            data[j] = num;
            j++;
        }
        
        for (int i = 0; i < data.length - 1; i++) {
            
            for (int k = 1; k < data.length - i; k++) {
                if( data[k-1] > data[k]) {
                    temp = data[k-1];
                    data[k-1] = data[k];
                    data[k] = temp;
                }
                
            }
            
        }
        
        System.out.println(Arrays.toString(data));
    }
    
}
