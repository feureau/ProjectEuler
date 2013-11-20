//Problem 1 states that:
//
//    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//    Find the sum of all the multiples of 3 or 5 below 1000.

//I couldn't solve this till Fauzie pointed out that you should watch out not to add the common multiple twice. His solution was to reduce the total sum of multiplies of three and five with the total sum of multiplies of fifteen.

//Or, in Objective-C:

    #import

    int main (int argc, const char *argv[]){

    NSLog (@"The numbers from 1 to 5:");

    int i;

    int targeti = 1000;

    int multipleOfThree = 0;

    int multipleOfThreeAdder = 0;

    int multipleOfFive = 0;

    int multipleOfFiveAdder = 0;

    int multipleOfFifteen = 0;

    int multipleOfFifteenAdder = 0;

    for (i=1; i

    multipleOfThree = 3 * i;

    if (multipleOfThree &lt; targeti){

    multipleOfThreeAdder = multipleOfThreeAdder + multipleOfThree;

    NSLog (@"multipleOfThree %d\n", multipleOfThree);

    }

    else if (multipleOfFive &gt;=targeti &amp;&amp; multipleOfThree &gt;= targeti){

    i=targeti;

    }

    multipleOfFive = 5 * i;

    if (multipleOfFive &lt; targeti){

    multipleOfFiveAdder = multipleOfFiveAdder + multipleOfFive;

    NSLog (@"multipleOfFive %d\n", multipleOfFive);

    }

    else if (multipleOfFive &gt;=targeti &amp;&amp; multipleOfThree &gt;= targeti) {

    i=targeti;

    }

    multipleOfFifteen = 15 * i;

    if (multipleOfFifteen &lt; targeti ){

    multipleOfFifteenAdder = multipleOfFifteenAdder + multipleOfFifteen;

    NSLog (@"multipleOfFifteen %d\n", multipleOfFifteen);

    }

    else if (multipleOfFive &gt;=targeti &amp;&amp; multipleOfThree &gt;= targeti &amp;&amp; multipleOfFifteen &gt;= targeti) {

    i=targeti;

    }

    }

    int resultIs;

    resultIs = multipleOfFiveAdder + multipleOfThreeAdder - multipleOfFifteenAdder;

    NSLog (@"%d\n", multipleOfThree);

    NSLog (@"%d\n", multipleOfFive);

    NSLog (@"%d\n", multipleOfThreeAdder);

    NSLog (@"%d\n", multipleOfFiveAdder);

    NSLog (@"%d\n", resultIs);

    return(0);

    }

//The which yield the number:
//
//    233168