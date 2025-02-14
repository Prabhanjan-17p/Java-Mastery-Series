import java.util.Scanner;
public class  java_03_Stringinput {

    public static void main(String[] args) {
        
        System.out.println("This Program Getting The Input string");
        Scanner sc = new Scanner(System.in);

        // String name = sc.next();
        // System.out.println("This next() - print The 1st latter only ");

        String name = sc.nextLine();
        System.out.println("This nextLine() - Print the total name ");
        System.out.println(name);
    }
    
}
