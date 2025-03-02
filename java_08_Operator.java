public class java_08_Operator{
    public static void main(String[] args) {
        System.out.println("it's a operator program");
        int a=4;
        int b= 9+a;//-->Arithmetic operator
        System.out.println(b);
        
        int c= 9%a; // --> Modulo operator(it gives the reminder part of the value)
        System.out.println(c);
        
        System.out.println(9==8); //--> Comparison operator

        System.out.println(65>5 && 64>89);
        System.out.println(65>5 || 64>89); //--> Logical Operator

        System.out.println(2 & 3); //Bitwise Operator
        System.out.println(3 & 23); //Bitwise Operator(it gives the small number )

        int a1 =7,b1=2,x = 2;
        x +=a1; // x= x+a1
        x +=a1+b1; // x= x+a1+b1
        System.out.println(x);

    }
}
