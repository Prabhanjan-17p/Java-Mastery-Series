public class java_09_Associativity {
    public static void main(String[] args) {
        int a= 6*5-34/2;
        /*
        Check The 1st precedence then it will be run
        6*5-34/2
        =30-34/2
        =30-17
        =13    
         */
        System.out.println(a);

        int b= 60/5-34*2;
        /*
          Check the 1st precedence , when precedence are same , then use Associativity Method
          60/5-34*2  in this case / and * are same precedence , then use Associativity Method (Left to Right)
          =12-34*2
          =12-68
          =-56
         */
        System.out.println(b);

        int c = 2*2-(4*5*3)/(2*5);
        /*
          2*2-(4*5*3)/(2*5)
          =2*2-60/10
          =4-60/10
          =4-6
          =-2
         */
        System.out.println(c);

        int d= 7;
        int e= ++d * 8;
        /*
          ++d * 8
          =8*8
          =64
         */
        System.out.println(e);

        char ch = 'a';
        System.out.println(++ch);
    }
    
}
