/*
Given the problem:

    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
    What is the 10001st prime number?

Solution in Java:
*/

    package projecteuler;
    public class Main {
        public static void main(String[] args) {
            boolean primeStatus = false;
            int primeCount=0;
            for (int i=1;primeCount&lt;=10001;i++){
                if(isItPrime(i)){
                    System.out.println("Prime number " + primeCount + " is " + i);
                    primeCount++;
                }
            }
        }
        static boolean isItPrime(int i){
            int c;
          
            for (c = 2; c &lt; i; c++)
            {
                if (i % c == 0)
                {
                    return false;
                }  
            }
            return true;
        }
    }

/*
Solution in numbers:

    104743
*/