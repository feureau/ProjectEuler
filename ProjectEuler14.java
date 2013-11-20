/*
Given the Problem:

    The following iterative sequence is defined for the set of positive integers:

    n ? n/2 (n is even)

    n ? 3n + 1 (n is odd)

    Using the rule above and starting with 13, we generate the following sequence:

    13 ? 40 ? 20 ? 10 ? 5 ? 16 ? 8 ? 4 ? 2 ? 1

    It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

    Which starting number, under one million, produces the longest chain?

    NOTE: Once the chain starts the terms are allowed to go above one million.

Given the Solution in Java:
*/

    /*

     * To change this template, choose Tools | Templates

     * and open the template in the editor.

     */

    package projecteuler13;

    /**

     *

     * @author Feureau

     */

    public class Main {

    public static int currentNumberToSequence=0;

        /**

         * @param args the command line arguments

         */

        public static void main(String[] args) {

            int maximumNumberToSearch = 1000000;

            long longestChain=0;

            long startingNumber=0;

            long currentNumber=0;

            long currentChain=0;

            for (currentNumberToSequence=0; currentNumberToSequence&lt;=maximumNumberToSearch; currentNumberToSequence++)

            {

                currentChain=returnNumberOfSequence();

                currentNumber=currentNumberToSequence;

                if (currentChain&gt;longestChain)

                {

                    longestChain=currentChain;

                    startingNumber=currentNumber;

                }

            }

            System.out.println("");

            System.out.println("the longest chain, which is "+longestChain+" under "+maximumNumberToSearch+", starts at "+startingNumber);

        }

        public static long returnNumberOfSequence()

        {

            long lastNumberInSequence=currentNumberToSequence;

            long lengthOfChain=0;

            while(lastNumberInSequence&gt;1)

            {

                    if(isItEven(lastNumberInSequence))

                    {

                        lastNumberInSequence=isEvenSoGetNextNumber(lastNumberInSequence);

                        lengthOfChain++;

                    }

                    else

                    {

                        lastNumberInSequence=isOddSoGetNextNumber(lastNumberInSequence);

                        lengthOfChain++;

                    }

            }

            return lengthOfChain;

        }

        public static boolean isItEven(long n)

        {

            if (n%2==0)

            {

                return true;

            } else

            {

                return false;

            }

        }

        public static long isEvenSoGetNextNumber(long n)

        {

            return n/2;

        }

        public static long isOddSoGetNextNumber(long n)

        {

            return (3*n)+1;

        }

    }

/*
The Solution in numerical value:

    837799
*/