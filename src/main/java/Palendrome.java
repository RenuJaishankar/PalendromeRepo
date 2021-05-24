import java.io.*;
import java.util.*;

public class Palendrome {
    public static void main(String[] args){
        //A palindrome is a word, phrase, number, or other sequence of characters which
        // reads the same backward or forward.
        //Given a string , print Yes if it is a palindrome, print No otherwise.


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
