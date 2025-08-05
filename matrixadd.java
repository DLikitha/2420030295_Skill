package myproject;
import java.util.*;
public class matrixadd {
         public static void main (String args[]) {
        	 Scanner sc = new Scanner(System.in); 
        	 System.out.println("Enter the no.of rows");
        	 int n = sc.nextInt();
        	 System.out.println("Enter the no.of columns");
        	 int m = sc.nextInt();
        	 
        	 if(n==m) {
        		 int a[][] = new int[n][m];
        		 int b[][] = new int[n][m];
        		 System.out.println("Enter the elements of Matrix A");
        		 for (int i=0;i<n;i++) {
        			 for(int j=0;j<m;j++) {
        				a[i][j]  = sc.nextInt();
        				}
        		 }
        		 System.out.println("Enter the elements of Matrix B");
        		 for (int i=0;i<m;i++) {
        			 for (int j=0; j<m;j++) {
        				 b[i][j]= sc.nextInt();		 
        			 }
        		 }
        		 int sum[][] = new int[n][m];
        		 for (int i=0;i<n;i++) {
        			 for(int j=0;j<m;j++) {
        				 sum[i][j] = a[i][j] + b[i][j];
        			 }
        		 }
        		 for (int i=0;i<n;i++) {
        			 for(int j=0;j<m;j++) {
        				 System.out.print(sum[i][j]+ "\t");
        			 }
        			 System.out.println();
        		 }
        		 
        	 }
        	 else {
        		 System.out.println("The dimensions of the matrix is not equal ");
        	 }
         
         }
}
