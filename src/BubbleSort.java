
import java.util.Arrays;
import java.util.Scanner;


public class BubbleSort {
    
    public static void main(String[] args) {
        
        String filename = "C:\\Users\\Nicholas\\Documents\\NetBeansProjects\\theNumbers.txt";
        
        Scanner fileinput = new Scanner(filename);
        
        int[] data = new int[10];
        int temp;
        
        System.out.println(data.length);
        int j = 0;
        while (fileinput.hasNextLine()) {
            data[j] = fileinput.nextInt();
            j++;
        }
        
        System.out.println(j);
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
