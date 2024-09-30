
import java.util.Scanner;
public class Add2Matrices{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Number of row : "); 
        int row=scanner.nextInt();       
        System.out.print("Number of col : ");
        int col=scanner.nextInt();
        int [][] firstMatrix= new int[row][col];
        int [][] secondMatrix= new int[row][col];
        int [][] sumMatrix= new int[row][col];
        System.out.print("Enter 1st matrix : ");
    for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            firstMatrix[i][j] = scanner.nextInt();
            System.out.println("firstMatrix[" + i + "][" + j + "] = " + firstMatrix[i][j]);
        }
    }

    System.out.println("Enter elements for the second matrix:");
    for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            secondMatrix[i][j] = scanner.nextInt();
            System.out.println("secondMatrix[" + i + "][" + j + "] = " + secondMatrix[i][j]);
        }
    }

        
        scanner.close();
        // Calculate the sum of the two matrices
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        System.out.println("The sum matrix: ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.println("sumMatrix[" + i + "][" + j + "] = " + sumMatrix[i][j]);
            }
            System.out.println();
        }








    }
}