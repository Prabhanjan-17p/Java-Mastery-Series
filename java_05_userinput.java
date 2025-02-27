//package JAVA;
import java.util.Scanner;

public class java_05_userinput {
    public static void main(String[] args) {
        System.out.println("In this program user get input here ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st number :-");
        int num1 = sc.nextInt();
        System.out.println("Enter your 2nd number :-");
        int num2 = sc.nextInt();
//        boolean s = sc.hasNext();
        int sum = num1 + num2;
        System.out.println("The Sum of The Number Is :"+sum);
    }
    
}
