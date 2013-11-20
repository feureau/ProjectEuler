/*
Given the Problem:

    If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
    If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

    NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.

Given the Solution:
*/
        package projecteuler17d;

        public class Main {

            public static void main(String[] args)

            {

                String[] numbers = new String[1002];

                int[] numbersInteger = new int[1002];

                int total=0;

                String stringTotal="";

                for(int i=0;i&lt;=1000;i++) // initialize to prevent null

                {

                    numbersInteger[i]=-1;

                    numbers[i]="";

                }

                numbers[0]="";

                numbers[1]="one";

                numbers[2]="two";

                numbers[3]="three";

                numbers[4]="four";

                numbers[5]="five";

                numbers[6]="six";

                numbers[7]="seven";

                numbers[8]="eight";

                numbers[9]="nine";

                numbers[10]="ten";

                numbers[11]="eleven";

                numbers[12]="twelve";

                numbers[13]="thirteen";

                numbers[14]="fourteen";

                numbers[15]="fifteen";

                numbers[16]="sixteen";

                numbers[17]="seventeen";

                numbers[18]="eighteen";

                numbers[19]="nineteen";

                StringConcatenator(numbers,"twen",20,30);

                StringConcatenator(numbers,"thir",30,40);

                StringConcatenator(numbers,"for",40,50);

                StringConcatenator(numbers,"fif",50,60);

                StringConcatenator(numbers,"",60,80);

                StringConcatenator(numbers,"eigh",80,90);

                StringConcatenator(numbers,"",90,100);

                StringConcatenator(numbers,"",100,1000);

                numbers[1000]="onethousand";

                for(int i=1;1&lt;=i&amp;&amp;i&lt;=1000;i++)

                {

                    numbersInteger[i]=numbers[i].length();

                    total+=numbersInteger[i];

                    stringTotal+=numbers[i];

                    System.out.println(i+" = "+numbers[i]+", length: "+numbersInteger[i]+", so far totaling "+total);

                }

                System.out.println("totaling "+total+" number of characters");

                //System.out.println("stringTotal "+stringTotal);

                //System.out.println(stringTotal.length());

            }

            public static void StringConcatenator(String[] numbers, String prefix, int bottomRange, int topRange)

            {

                int startingNumber=bottomRange;

                String suffix="";

                if(startingNumber&lt;100)

                {

                   suffix ="ty";

                }

                if (startingNumber&gt;=100&amp;&amp;startingNumber&lt;1000)

                {

                    suffix="hundred";

                }

                if (startingNumber&gt;=1000)

                {

                    suffix="thousand";

                }

                String prefixAnd="and";

                if(startingNumber&lt;100)

                {

                    if(prefix.length()&gt;=1)

                    {

                        for(int i = startingNumber;i

                        {

                            numbers[i] = prefix + suffix + numbers[i%startingNumber];

                        }

                    }else

                    {

                        for(int i = startingNumber;i

                        {

                            if(startingNumber+10==i)

                            {

                                startingNumber=i;

                            }

                            numbers[i] = numbers[startingNumber/10] + suffix + numbers[i%startingNumber];

                        }

                    }

                }

                if (startingNumber&gt;=100 &amp;&amp;startingNumber&lt;1000)

                {

                    for(int i = startingNumber;i

                    {

                        if(startingNumber+100==i)

                        {

                            startingNumber=i;

                        }

                        if(i%100==0)

                        {

                            numbers[i] = numbers[startingNumber/100] + suffix + prefix + numbers[i%startingNumber];

                        }else

                        {

                            numbers[i] = numbers[startingNumber/100] + suffix + prefixAnd + numbers[i%startingNumber];

                        }

                    }

                }

            }

        }

/*
The Solution in numerical value:

    21124
*/