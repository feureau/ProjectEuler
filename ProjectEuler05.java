/*
Given the Problem:

    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
    What is the smallest number that is evenly divisible by all of the numbers from 1 to 20?

The solution in Java:
*/

    package projecteuler;
    public class Main {
        public static void main(String[] args) {
          int i=0;
          int j=0;
          int k=0;
          int caret=0;
          boolean keepChecking = true;
          for (i=1;keepChecking;i++){
              for (j=1;j&lt;=20;j++){
                  k=i%j;
                  if (k != 0){
                      keepChecking=true;
                      break;
                  }else{
                      keepChecking=false;
                      caret=i;
                  }
              }
          }
          System.out.println(caret);
          }
    }

/*
Numerical Solution:

    232792560
*/