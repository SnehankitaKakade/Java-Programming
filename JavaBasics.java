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

        /*type promotion -done for expression eg.a-b etc
          
         * Java automatically promotes each byte,short or char operand to int when evaluating an expression       
         
         * If one operand is long ,float or double then whole expression promoted to long, float or double respectively 
         
        */

        char char1='a';
        char char2='b';
        System.out.println((int)char1); // ASCII a=97
        System.out.println((int)char2); // ASCII b=98

        System.out.println(char2-char1); //char is promoted to int o/p is 1


        /* Type promotion in Expression
         * eg. byte b=5;
               b=b*2; for this line java compiler throw error because in expession java promote byte to int so here b is int & int cant store in byte
                to solve this correct syntax is b=(byte)b*2;
        */



        /*operators in java

        **************Most Important always kewep in mind  operator precedence & associativity(left to right or right to left)**********
         
         * Arithmetic operator( Binary[+,_,*,/,%] & Unary[++ ,--] )
         * Relational operator (== , != ,< ,> ,<= ,>=)
         * Logical operator
         * Bitwise operators
         * Assignment operators
        */

        int num1=12;
        int num2=12;

        //******** Always write expression in () otherwise compiler take it as string eg.num1+num2 is 1212  or (num1+num2) is 24

        //Binary operators

        System.out.println("Addition : "+(num1+num2));
        System.out.println("Subtraction : "+ (num1-num2));
        System.out.println("Multiplication : "+(num1*num2));
        System.out.println("Division : "+(num1/num2));
        System.out.println("Modulus : "+(num1%num2));

            //Unary Operators 

                //Post Increment(num++) & Pre Increment(++num)
                int num3=2;
                
                System.out.println(++num3); //here first value increment & then print  3
                System.out.println(num3++); //first print & then increment             3
                System.out.println(num3);   //current value                            4

                //Post Decrement(num--) & Pre Decrement(--num)

                //num3=4 
                System.out.println(--num3); //here first value decrement & then print  3 
                System.out.println(num3--); //first print & then decrement             3
                System.out.println(num3);   //current value                            2

        /*Relation operator  (== , != ,< ,> ,<= ,>=)  this operator gives boolean value true or false */

            int firstno=20;
            int secondno=15;

            System.out.println(firstno==secondno);  //equal to 
            System.out.println(firstno!=secondno);  //not equal to 
            System.out.println(firstno<secondno);  //less than
            System.out.println(firstno<=secondno); //less than equal to
            System.out.println(firstno>=secondno); //greater than equal to
            System.out.println(firstno>secondno);  //greter than

        /*Logical operator (&& , || , !) */

            //true && true = true ,true && false = false ,false && false = false
            System.out.println((firstno==secondno) && (firstno!=secondno));   

            //true || true = true ,true || false = true ,false || false = false
            System.out.println((firstno==secondno) || (firstno!=secondno));  
                
            //! is negation !true=false ,!false=true
            System.out.println(!(firstno==secondno)); 

        /* Assignment operators [= ,+= ,-= ,*= ,/= ,%=] */

            int no =5;
            int oper =10;

            System.out.println(no=oper); //no=10
            System.out.println(no+=oper); //no=10+10=20
            System.out.println(no-=oper); //no=20-10=10
            System.out.println(no*=oper); //no=10*10=100
            System.out.println(no/=oper); //no=100/10=10
            System.out.println(no%=oper); //no=10%10=0

            




    }
}