/*Given the Problem:

    A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

    a2 + b2 = c2
    For example, 32 + 42 = 9 + 16 = 25 = 52.
    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
    Find the product abc.

The solution in Java:
*/
    public class Main {

        public static void main(String[] args) {

        int a=0;

        int b=0;

        int c=0;

        int result=0;

        for (c=1000;c&gt;0;c--){

        for(b=c-1;b0 ;b--){

        for(a=b-1;a0;a--){

        if (a+b+c==1000 &amp;&amp; (a*a)+(b*b)==(c*c)){

        System.out.print("The value of a "+a);

                System.out.print(" The value of b "+b);

                System.out.print(" The value of c "+c);

                System.out.println();

                result=a*b*c;

                break;

        }

        

        }

        }

        }

        System.out.println("The product of abc is " + result);

        }

    }

/*
The numerical solution:

    31875000
*/