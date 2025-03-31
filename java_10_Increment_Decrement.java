public class java_10_Increment_Decrement {
    public static void main(String[] args)
    {
        System.out.println("it is example os increment and decrement operation:");
        int y=5;
        int x=++y; //--> in  this case 1st increase the value then print
        System.out.println(x);

        int a=6;
        int b=a++;  //-->in this case the value print 1st the increase
        System.out.println(b);

        int c=4;
        int d=--c; //-->preDecrement
        System.out.println(d);

        int e=2;
        int f=e--;  //-->postDecrement
        System.out.println(f);
    }
    
}
