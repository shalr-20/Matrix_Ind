import java.util.*;
public class Matrix_indices{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows:");
        int rows=sc.nextInt();
        
        System.out.print("Enter columns:");
        int columns=sc.nextInt();
        
        int [][]num=new int[rows][columns];
        
        System.out.print("INPUT");
        for(int i=0; i<rows;i++){
            for(int j=0; j<columns; j++){
                num[i][j]=sc.nextInt();
            }
        }
        
        System.out.print("Enter x:");
        int x=sc.nextInt();
        
        for(int i=0; i<rows;i++){
            for(int j=0; j<columns; j++){
                if(num[i][j]==x){
                    System.out.print("x is found at index("+i+","+j+")");
                }
            }
        }
    }
}