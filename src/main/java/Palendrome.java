import java.io.*;
import java.util.*;

public class Palendrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the string to check if it is a Palendrome");
        String A=sc.next();
        String ans;

        /* Enter your code here. Print output to STDOUT. */
        if( A.equalsIgnoreCase(new StringBuffer(A).reverse().toString())){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }




    }
}
