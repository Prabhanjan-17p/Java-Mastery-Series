import java.util.Scanner;
public class  java_13_Strings {
    public static void main(String[] args) {
        String name = new String("kanha");
        System.out.println(name);
        
        String name2= "pravu";
        System.out.println(name2);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur name");
        String name3 = sc.nextLine();
        System.out.println("Thank You for Joining   :- "+name3);
//        String name4 = sc.next();
//        System.out.println("The big latter is   :- "+name4);

        System.out.println("enter a Double number : ");
        double num4 = sc.nextDouble();
        System.out.println("Thank You for Joining and the Double Number is  :- "+num4);

        System.out.println(name);
    }
    
}
