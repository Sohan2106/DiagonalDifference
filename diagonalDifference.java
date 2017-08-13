import java.util.*;
import java.lang.Math;

public class DiagonalDifference {

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            int noOfRows = in.nextInt();
            int noOfColumns = noOfRows;
            int[][] matrix = new int[noOfRows][noOfColumns];
            
            for(int rows = 0; rows < noOfRows; rows++){
                for(int columns = 0; columns < noOfColumns; columns++){
                    matrix[rows][columns] = in.nextInt();
                }
            }
            
            int sumOfPrimary = primaryDiagonal(matrix,noOfRows,noOfColumns);
            int sumOfSecondary = secondaryDiagonal(matrix,noOfRows,noOfColumns);
            
            int solution = Math.abs(sumOfPrimary - sumOfSecondary);
            
            System.out.println(solution);
        }
    }
    
    public static int primaryDiagonal(int[][] matrix,int noOfRows, int noOfColumns){
        int sum = 0;
        for(int rows = 0; rows < noOfRows; rows++){
            for(int columns = 0; columns < noOfColumns; columns++){
                if(rows == columns){
                    sum += matrix[rows][columns];
                }
            }
        }
        return sum;
    }
    
    public static int secondaryDiagonal(int[][] matrix, int noOfRows, int noOfColumns){
        int sum = 0;
        for(int rows = 0; rows < noOfRows; rows++){
            for(int columns = 0; columns < noOfColumns; columns++){
                if(rows == (noOfColumns - (columns+1))){
                    sum += matrix[rows][columns];
                }
            }
        }
        return sum;
    }
}
