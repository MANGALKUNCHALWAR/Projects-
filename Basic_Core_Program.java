import java.util.Scanner;

    //Basic Core Programs

//1. Flip Coin and print percentage of Heads and Tails
//a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
//b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
//c. O/P -> Percentage of Head vs Tails

    class PercentageOfHeadsAndTails {
        public static void main(String[] args) {
            System.out.println("Welcome to coin percentage Calculation game!!");
            Scanner scan = new Scanner(System.in);
            System.out.println("Write how many times you want to flip the coin :");
            int totalFlip=scan.nextInt();
            int headFlip=0;
            int tailFlip=0;
            if (totalFlip>0) {
                for (int i=1; i<=totalFlip;i++) {
                    double flip = Math.random();

                    if (flip<0.5) {
                        headFlip++;

                    }
                    else {
                        tailFlip++;
                    }
                }

            }
            else {
                System.out.println("You have entered wrong value Next time enter Positive value THANK YOU !!!");
            }
            double headPercent=(headFlip*100)/totalFlip;
            double tailPercent=(tailFlip*100)/totalFlip;
            System.out.println("Head flip percentage is : "+headPercent);
            System.out.println("Tail flip percentage is : "+tailPercent);
        }

    }

    // 2. Leap Year
    //a. I/P -> Year, ensure it is a 4 digit number.
    // b. Logic -> Determine if it is a Leap Year.
    // c. O/P -> Print the year is a Leap Year or not.


    class LeapYear{
        public static void main(String[]args){
            Scanner scan=new Scanner(System.in);
            System.out.println("enter a Year :");
            int year=scan.nextInt();
            if(year>=1000&&year<=9999){
                if(year%4==0){
                    System.out.println(year+"is a leap year.");
                }else{
                    System.out.println(year+"is not a leap year.");
                }

            }
            else{
                System.out.println("Incorrect year Next time Check for a year which is between 999 and 10000 thank u");
            }

        }
    }

//3. Power of 2
//a. Desc -> This program takes a command-line argument N and prints a table of the
//powers of 2 that are less than or equal to 2^N.
//b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
//c. Logic -> repeat until i equals N.
//d. O/P -> Print the year is a Leap Year or not.

    class Power {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a,n,i,mult=1;
            a=2;
            n=sc.nextInt();

            if (n >= 0 && n < 31)
            {

                for( i=1;i<=n;i++)
                {
                    mult=mult*a	;
                }

                System.out.println("power is"+mult);
            }
            else
            {
                System.out.println("invalid no");
            }

        }
    }

//4. Harmonic Number
//a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
//(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
//b. I/P -> The Harmonic Value N. Ensure N != 0
//c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
//d. O/P -> Print the Nth Harmonic Value.

    class Harmonic {

        public static void main(String[] args) {

            // INITIALIZATION
            double result = 0, num = 0, j;
            Scanner sc =new Scanner(System.in);
            int n = sc.nextInt();
            // INPUT DATA
            System.out.print("enter the harmonic you want to find: ");

            // COMPUTATION
            for (j = 1; j <= n; j++) {
                num = num + (1/ j);
                result = num;
            }
            System.out.println("the value of harmonic no. " + n + " is: " + result);

        }

    }

//5. Factors
//a. Desc -> Computes the prime factorization of N using brute force.
//b. I/P -> Number to find the prime factors
//c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
//d. O/P -> Print the prime factors of number N.

    class PrimeFactor {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number : ");
            int number = sc.nextInt();

            for(int i = 2; i< number; i++) {
                while(number%i == 0) {
                    System.out.println(i+" ");
                    number = number/i;
                }
            }
            if(number >2) {
                System.out.println(number);
            }
        }
    }


    //6. Java Program to Compute Quotient and Remainder
    class QuotientReminder {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter numbers");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int quotient=a/b;
            int remainder=a%b;
            System.out.println("Quotient="+quotient);
            System.out.println("Remainder="+remainder);
        }

    }

    //7. Java Program to Swap Two Numbers
    class SWAPNUMBERS {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter numbers");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int t;
            t=a;
            a=b;
            b=t;
            System.out.println("after swapping "+a+ " "+b);
        }

    }

    //8. Java Program to Check Whether a Number is Even or Odd.
    class EvenOdd {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number");
            int Number = sc.nextInt();

            if (Number % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("number is odd");
            }
        }
    }



//9. Java Program to Check Whether an Alphabet is Vowel or Consonant

    class VovelConsonant {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a alphabet");
            char alphabet=sc.next().charAt(0);
            if (alphabet=='a'||alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u')
            {
                System.out.println(alphabet +"is a vovel");
            }
            else
            {
                System.out.println("is consonant");
            }
        }
    }

    //10. Java Program to Find the Largest Among Three Numbers
    class LargestNumber {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a numbers ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if (a>b)
            {
                if(a>c)
                {
                    System.out.println("a is Largest");
                }
                else
                {
                    System.out.println("c is Largest");
                }
            }
            else
            {
                if(b>c)
                {
                    System.out.println("b is largest");
                }
                else
                {
                    System.out.println("c is Largest");
                }
            }
        }
    }




