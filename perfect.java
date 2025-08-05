package myproject;
 import java.util.*;
public class perfect {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int perfect = 0;
        for (int i = 0; i <= a; i++) {
        	if (i*i == a) {
        		perfect = 1;
        		System.out.println("Number is perfect square");
        	}
        	if (i*i>a) {
        		break;
        	}
        	
        }
        if (perfect==0) {
        	System.out.println("Number is not perfect square");
        }
        
	}
}
