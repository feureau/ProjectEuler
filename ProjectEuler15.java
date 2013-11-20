/*
Given the Problem:

    Starting in the top left corner of a 2×2 grid, there are 6 routes (without backtracking) to the bottom right corner.

    How many routes are there through a 20×20 grid?

Given the Solution in Java:
*/
    package projecteuler15;

    public class Main {

        public static void main(String[] args) 

        {

            double n=40;

            double k=20;

            double c=getCombination(n,k);

            System.out.println(c);

        }

        public static double getCombination(double n, double k)

        {

            

            double x=Factorial(n);

            double y=(Factorial(k));

            double z=(Factorial(n-k));

            System.out.println(x);

            System.out.println(y);

            System.out.println(z);

            return x/(y*z);

        }

        public static double Factorial(double x)

        {

            double numberToReturn=1;

            for (double i=x;i&gt;0;i--)

            {

                numberToReturn=numberToReturn*i;

            }

            //System.out.println(numberToReturn);

            return numberToReturn;

        }

    }

/*
Or, given the solution in Google:

(click to enlarge)

The Solution in numerical value:

    1.3784652882000003E11 or in normalspeak: 

    137846528820

*/