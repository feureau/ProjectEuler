/*
In problem 4 of Project Euler, the following is given:

    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
    Find the largest palindrome made from the product of two 3-digit numbers.

Whereas the solution in Java is:
*/

    /*
     * To change this template, choose Tools | Templates
     * and open the template in the editor.
     */

    package projecteuler;

    /**
     *
     * @author feureau
     */
    public class Main {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // TODO code application logic here
            int multiplied;
            String s1;
            String s2;
            StringBuffer sb;
            int largestPalindromeInCurrentCycle = 0;
            int largestPalindrome = 0;
            for (int i = 100; i &lt; 1000 ; i++){
                for (int j = 100; j &lt; 1000 ; j++){
                    multiplied = i*j;
                    s1 = Integer.toString(multiplied);
                    sb = new StringBuffer (s1);
                    sb = sb.reverse();
                    s2 = sb.toString();
                    largestPalindromeInCurrentCycle = Integer.valueOf(s1);
                    if (s1.equalsIgnoreCase(s2)){
                        if (largestPalindromeInCurrentCycle &gt; largestPalindrome){
                        largestPalindrome = largestPalindromeInCurrentCycle;
                        }
                    }
            //System.out.println(i+" and "+j+" multiplied is " + multiplied + " while the current largest palindrome in current cycle is " + largestPalindromeInCurrentCycle + " the largest palindrome found is " + largestPalindrome);
                }
            }
            System.out.println("In conclusion, the largest palindrome is: " + largestPalindrome);
        }
    }

/*
Which yield,

    906609

*/