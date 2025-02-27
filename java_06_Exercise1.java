import java.util.Scanner;
public class java_06_Exercise1 {
    public static void main(String[] args) {
        System.out.println("This Program show The student Mark And Percentage :-");
        System.out.println("Enter Your Name :-");
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        System.out.println("Your Name is " + Name );

        System.out.println("Enter the Math Mark:-");
        float math = sc.nextFloat();
        System.out.println("Enter The English Mark:-");
        float English = sc.nextFloat();
        System.out.println("Enter The odia Mark:-");
        float odia = sc.nextFloat();
        System.out.println("Enter The IT Mark:-");
        float IT = sc.nextFloat();
        System.out.println("Enter The Phy Mark:-");
        float Phy = sc.nextFloat();
        System.out.println("Enter The Chem Mark:-");
        float Chem = sc.nextFloat();

        float totall = math + English + odia + IT + Phy + Chem;
        System.out.println("The total mark is :-" + totall);

        float Percentage = (totall/600)*100;
        System.out.println("your Percentage is :-"+Percentage);

        System.out.println("Thank you For checking Your Mark");
    }
}
