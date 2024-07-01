package Graph;
import java.util.*;
public class Adjacent_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=4;
        int e=5;
        int[][] edge={{0,1},{1,3},{2,3},{2,1},{2,0}};
        int[][] matrix=new int[v][v];
        for(int i=0;i<edge.length;i++){
            int a=edge[i][0];
            int b=edge[i][1];
            matrix[a][b]=1;
        }
        System.out.println("Directed Graph");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<edge.length;i++){
            int a=edge[i][0];
            int b=edge[i][1];
            matrix[b][a]=1;
        }
        System.out.println("Un-Directed Graph");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
