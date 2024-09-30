
import java.util.Arrays;
import java.util.Scanner;

public class SortArray{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Size of array");
        int size =scanner.nextInt();
        System.out.println("Enter: ");

        int [] arr =new int[size];
        for (int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        scanner.close();
        
        double sum = 0;
        for (int num : arr){
            sum+=num;
        }
        System.out.println("Sum is: "+ sum);
        Arrays.sort(arr);
        System.out.println("The sorted array is: ");
        for(int num : arr){
            System.out.println(num+" ");
        }
        double avg = sum / size;
        System.out.println("Average value of the array elements is: " + avg);
        


    

    }
}