import java.util.Scanner;  //this package used to get input form user 

public class JavaBasics{
    public static void main(String args[]){

        // output in java
        System.out.println("\nJava Programming");

        // Primitive datatypes in java

        byte a=8;
        int b=0;
        String name="Snehankita";
        char c='a';
        boolean status=true;
        float marks=98.23f;
        //to store large integer long  & double datatype used
        long height=250000000;  
        double population=1200005550;

        System.out.println("a = "+a+"\nb = "+b+"\nc = "+c+"\nStatus = "+status+"\nmarks = "+marks+"\nheight = "+height+"\nPopulation = "+population);
        /*size & range of datatypes  1 byte=8 bit

         * byte     1byte [-128 to 127]  256 no
         * short    2byte 
         * char     2byte
         * boolean  1byte
         * int      4byte
         * long     8byte  
         * float    4byte
         * double   8byte
        */

        //coments in java  syntax 1.for single line //used 2. for munliple lines /* */ used. comments used to write project info

        //Input in java

        Scanner sc=new Scanner(System.in);
       // String input=sc.next();   // next() will not count spaces

        String  input=sc.nextLine(); //use nextLine() 

        System.out.println("Input : "+input);

        //next ,nextLine,nextInt,nextFloat,nextBoolean,nextByte,nextDouble,nextShort,nextLong etc used according to which type of data input required 

        //type conversion
        /* Conversion happens when 1.type compatible 2.destination type > source type i.e. byte->short->int->float->long->double */
        //type conversion 

        float x = 12.89f;
        int y=(int)x;
        System.out.println(y);

        //type promotion -done for expression eg.a-b etc



    }
}