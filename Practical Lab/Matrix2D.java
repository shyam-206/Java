import java.util.*;
public class Matrix2D{
    public static void main(String args[]){
         int [][] arr = {{1,0,1,1,0,1},
                         {1,1,1,1,1,0},
                         {0,0,1,0,1,1},
                         {1,1,0,0,0,0},
                         {0,1,1,1,1,0},
                         {1,1,1,1,0,1}};

    int i=0,j=0;
    for(i=0;i<arr.length;i++){
        for(j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+"");
        }
       System.out.println("");

    }
    System.out.println("");
    System.out.println("");
    
    for(i=0;i<arr.length;i++){
        int count = 0;
        for(j=0;j<arr[i].length;j++){
            if(arr[i][j]==1)
               count++;

        }

        if(count%2!=0)
           System.out.println("row "+(i+1)+" has "+count+" 1's");
    }
    for(j=0;j<arr.length;j++){
        int count = 0;
        for(i=0;i<arr[j].length;i++){
            if(arr[i][j]==1)
               count++;

        }

        if(count%2!=0)
           System.out.println("column ]="+(j+1)+" has "+count+" 1's");
    }
    }
}