/*
Given the Problem:

    The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
    Find the sum of all the primes below two million.

Given the Solution in Java:
*/

    public class Main {

    public static void main(String[] args) {

        int targetPrime=2000000;

        int[] primeList = new int[targetPrime];

        Eratosthenes(targetPrime,primeList);

        }

        public static void Eratosthenes(int i, int[] list){

        i=i-1;

        for (int j=0;j&lt;=i;j++){

        list[j]=j;

        

        }

        list[1]=0;

        

        for (int j=2;j*j&lt;=i;j++){

        for (int m=j;m&lt;=i;m+=j){

            if (m&gt;j){

            list[m]=0;

            }

        }

        }

        long sum=0;

        for (int j=0;j

    if(list[j]!=0){

    // System.out.print(" " + list[j]);

    }

    sum+=list[j];

        }

    System.out.println(sum);

        }

    }

/*
The Solution in numerical value:

    142913828922
*/