//Problem 3 states that:
//
//   The prime factors of 13195 are 5, 7, 13 and 29.
//    What is the largest prime factor of the number 600851475143 ?
//
//Solution in Objective-C:

    #import

    int main (int argc, const char *argv[]){

    	int64_t i = 600851475143;

    	int64_t x;

    	int64_t largestPrime;

    	NSLog(@"Beginning to prime %d", i);

	for (x = 2; x &lt;=10000000000000000000000; x++){

	    	while (i%x == 0){

	    	i = i/x;

	    	largestPrime = x;

	    	NSLog(@"Current largestPrime is %d", x);

	}
	
      }

    }

//The answer to Problem 3 is:
//
//   6857