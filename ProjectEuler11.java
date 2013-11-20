/*
Given the Problem:

    In the 20×20 grid below, four numbers along a diagonal line have been marked in red.

    08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08

    49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00

    81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65

    52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91

    22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80

    24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50

    32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70

    67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21

    24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72

    21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95

    78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92

    16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57

    86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58

    19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40

    04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66

    88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69

    04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36

    20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16

    20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54

    01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48
    The product of these numbers is 26 × 63 × 78 × 14 = 1788696.
    What is the greatest product of four adjacent numbers in any direction (up, down, left, right, or diagonally) in the 20×20 grid?

Given the Solution in Java:
*/
    /*
     * To change this template, choose Tools | Templates
     * and open the template in the editor.
     */

    package projecteuler11;
    import java.util.StringTokenizer;

    /**
     *
     * @author Feureau
     */
    public class Main {
        
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // TODO code application logic here
            String[] s;
            s = new String[20];
            int[][] i;
            i = new int[20][20];
            long greatestProduct=0;
            long finalAnswer=0;
            long greatestProductPlaceholder=1;

            s[0]="08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08";
            s[1]="49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00";
            s[2]="81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65";
            s[3]="52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91";
            s[4]="22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80";
            s[5]="24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50";
            s[6]="32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70";
            s[7]="67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21";
            s[8]="24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72";
            s[9]="21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95";
            s[10]="78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92";
            s[11]="16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57";
            s[12]="86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58";
            s[13]="19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40";
            s[14]="04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66";
            s[15]="88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69";
            s[16]="04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36";
            s[17]="20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16";
            s[18]="20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54";
            s[19]="01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48";
            for(int x=0;x&lt;20;x++){
                for(int y=0;y&lt;20;y++){//
                     i[x][y]=ReturnInt(s[x],y);
                }
            }

            //prints out entire grid in int
            /*for(int x=0;x&lt;20;x++){
                for(int y=0;y&lt;20;y++){
                     System.out.print(i[x][y]+" ");
                }
                System.out.println("");
            }*/

            //checks for greatest product of four horizontally adjacent number
            greatestProduct=0;
            greatestProductPlaceholder=1;
            for(int x=0;x&lt;20;x++){
                for(int y=0;y+3&lt;20;y++){//
                     int[] z;
                     z=new int[4];
                     System.out.print("Multiplying ");
                     for(int zz=0;zz&lt;4;zz++)
                     {
                         z[zz]=i[x][y+zz];
                         System.out.print(z[zz]+" ");
                         greatestProductPlaceholder*=z[zz];
                     }
                     System.out.println(" = "+ greatestProductPlaceholder);

                     if(greatestProductPlaceholder&gt;greatestProduct)
                     {
                         System.out.println("Currently Found greatest number: "+greatestProductPlaceholder);
                         greatestProduct=greatestProductPlaceholder;
                     }
                     greatestProductPlaceholder=1;
                }
            }
            System.out.println("Greatest Product of four horizontally adjacent number is "+greatestProduct);
            if(finalAnswer&lt;=greatestProduct){finalAnswer=greatestProduct;}

           /* //checks for greatest product of four vertically adjacent number short version
            greatestProduct=0;
            for(int y=0;y&lt;20;y++){
                for(int x=0;x+4&lt;20;x++){//
                     int z=0;
                     z=i[x][y]*i[x+1][y]*i[x+2][y]*i[x+3][y];
                     if(z&gt;greatestProduct)
                     {
                         System.out.println("Currently Found greatest number: "+z);
                         greatestProduct=z;
                     }
                }
            }
            System.out.println("Greatest Product of four vertically adjacent number is "+greatestProduct);
            if(finalAnswer&lt;=greatestProduct){finalAnswer=greatestProduct;}*/

            //checks for greatest product of four vertically adjacent number
            greatestProduct=0;
            greatestProductPlaceholder=1;
            for(int y=0;y&lt;20;y++){
                for(int x=0;x+3&lt;20;x++){//
                     int[] z;
                     z=new int[4];
                     System.out.print("Multiplying ");
                     for(int zz=0;zz&lt;4;zz++)
                     {
                         z[zz]=i[x+zz][y];
                         System.out.print(z[zz]+" ");
                         greatestProductPlaceholder*=z[zz];
                     }
                     System.out.println(" = "+ greatestProductPlaceholder);

                     if(greatestProductPlaceholder&gt;greatestProduct)
                     {
                         System.out.println("Currently Found greatest number: "+greatestProductPlaceholder);
                         greatestProduct=greatestProductPlaceholder;
                     }
                     greatestProductPlaceholder=1;
                }
            }
            System.out.println("Greatest Product of four vertically adjacent number is "+greatestProduct);
            if(finalAnswer&lt;=greatestProduct){finalAnswer=greatestProduct;}

            /*//checks for greatest product of four left leaning diagonally adjacent number short version
            greatestProduct=0;
            for(int y=0;y+4&lt;20;y++){
                for(int x=0;x+4&lt;20;x++){//
                     int z=0;
                     z=i[x][y]*i[x+1][y+1]*i[x+2][y+2]*i[x+3][y+3];
                     if(z&gt;greatestProduct)
                     {
                         System.out.println("Currently Found greatest number: "+z);
                         greatestProduct=z;
                     }
                }
            }
            System.out.println("Greatest Product of four left leaning diagonally adjacent number is "+greatestProduct);
            if(finalAnswer&lt;=greatestProduct){finalAnswer=greatestProduct;}*/
          
          
            //checks for greatest product of four left leaning diagonally adjacent number number
            greatestProduct=0;
            greatestProductPlaceholder=1;
            for(int x=0;x+3&lt;20;x++){
                for(int y=0;y+3&lt;20;y++){//
                     int[] z;
                     z=new int[4];
                     System.out.print("Multiplying ");
                     for(int zz=0;zz&lt;4;zz++)
                     {
                         z[zz]=i[x+zz][y+zz];
                         System.out.print(z[zz]+" ");
                         greatestProductPlaceholder*=z[zz];
                     }
                     System.out.println(" = "+ greatestProductPlaceholder);

                     if(greatestProductPlaceholder&gt;greatestProduct)
                     {
                         System.out.println("Currently Found greatest number: "+greatestProductPlaceholder);
                         greatestProduct=greatestProductPlaceholder;
                     }
                     greatestProductPlaceholder=1;
                }
            }
            System.out.println("Greatest Product of four left leaning diagonally adjacent number is "+greatestProduct);
            if(finalAnswer&lt;=greatestProduct){finalAnswer=greatestProduct;}

            /*//checks for greatest product of four right leaning diagonally adjacent number short version
            greatestProduct=0;
            for(int y=4;y+4&lt;20;y++){
                for(int x=4;x+4&lt;20;x++){//
                     int z=0;
                     z=i[x][y]*i[x-1][y-1]*i[x-2][y-2]*i[x-3][y-3];
                     if(z&gt;greatestProduct)
                     {
                         greatestProduct=z;
                         System.out.println("Currently Found greatest number: "+z);
                     }
                }
            }
            System.out.println("Greatest Product of four right leaning diagonally adjacent number is "+greatestProduct);
            if(finalAnswer&lt;=greatestProduct){finalAnswer=greatestProduct;}*/

            //checks for greatest product of four right leaning diagonally adjacent number number
            greatestProduct=0;
            greatestProductPlaceholder=1;
            for(int x=0;x&lt;17;x++){
                for(int y=3;y&lt;17;y++){//
                     int[] z;
                     z=new int[4];
                     System.out.print("Multiplying ");
                     for(int zz=0;zz&lt;4;zz++)
                     {
                         z[zz]=i[x+zz][y-zz];
                         System.out.print(z[zz]+" ");
                         greatestProductPlaceholder*=z[zz];
                     }
                     System.out.println(" = "+ greatestProductPlaceholder);

                     if(greatestProductPlaceholder&gt;greatestProduct)
                     {
                         System.out.println("Currently Found greatest number: "+greatestProductPlaceholder);
                         greatestProduct=greatestProductPlaceholder;
                     }
                     greatestProductPlaceholder=1;
                }
            }
            System.out.println("Greatest Product of four right leaning diagonally adjacent number is "+greatestProduct);
            if(finalAnswer&lt;=greatestProduct){finalAnswer=greatestProduct;}

            System.out.println("Final Answer: " + finalAnswer);

        }

        public static int ReturnInt(String s, int x)
        {
            x=19-x; //otherwise each row would be reversed
            int integerToReturn=0;
            String stringPlaceholder;
            StringTokenizer st = new StringTokenizer(s);
            while (st.countTokens() &gt;x) {
                stringPlaceholder=st.nextToken();
                integerToReturn=Integer.parseInt(stringPlaceholder);
             }

            String parserString;

            return integerToReturn;
        }

    }
/*
The Solution in numerical value:

    70600674
*/