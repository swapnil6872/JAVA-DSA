import java.util.Scanner;

public class matrix {


    public static void printArr(int matrix[][]){
        int n =matrix.length, m =matrix[0].length;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j< m ; j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n =matrix.length, m=matrix[0].length;
        
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        printArr(matrix);
        sc.close();
    }
    
}
