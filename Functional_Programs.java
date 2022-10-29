import java.util.Scanner;

    //Functional Programs
//3. Write a program Distance.java that takes two integer command-line arguments x
//and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
//formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function


    class Distance {
        public static void main(String[] args) {


            // parse x- and y-coordinates from command-line arguments
            int x=0;
            int y=1;

            // compute distance to (0, 0)
            double dist = Math.sqrt(x*x + y*y);    ///Math.sqrt() function returns the square root of a number

            // output distance
            System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
        }
    }

//1. 2D Array
//a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
//standard input and printing them out to standard output.
//b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
//c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
//d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
//OutputStreamWriter to print the output to the screen.

    class TwoDArrayInput{

        public static void main(String args[]){


            System.out.println("Enter 2D array size rows in table: ");
            Scanner sc=new Scanner(System.in);
            int M=sc.nextInt();
            System.out.println("Enter col in table: ");
            int N=sc.nextInt();


            System.out.println("Enter array elements : ");

            int twoD[][]=new int[M][N];


            for(int i=0; i<M;i++)
            {
                for(int j=0; j<N;j++)
                {
                    twoD[i][j]=sc.nextInt();
                }
            }
            System.out.print("\nData you entered : \n");
            for(int []x:twoD){
                for(int y:x){
                    System.out.print(y+"        ");
                }
                System.out.println();
            }

        }

    }


//2. Sum of three Integer adds to ZERO
//a. Desc -> A program with cubic running time. Read in N integers and counts the
//number of triples that sum to exactly 0.
//b. I/P -> N number of integer, and N integer input array
//c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
//d. O/P -> One Output is number of distinct triplets as well as the second output is to
//print the distinct triplets.

    class SumOfThree
    {
        public static int findDistinctTriplets(int b[],int length)//method 1
        {
            System.out.println();
            int i,j,k,count=0;
            for(i=0;i<length;i++)
            {
                for(j=i+1;j<length;j++)
                {
                    for(k=j+1;k<length;k++)
                    {
                        // printing distinct triples (i, j, k) where a[i] + a[j] + a[k] = 0
                        if (b[i] + b[j] + b[k] == 0)
                        {
                            System.out.println(b[i] + " " + b[j] + " " + b[k]);
                            count++;
                        }
                    }
                }
            }
            // return number of distinct triplets (i, j, k) such that a[i] + a[j] + a[k] = 0
            return count;
        }

        public static void main(String[] args)
        {
            Scanner sc=new Scanner( System.in);
            System.out.println();

            //enter the array size
            System.out.print("Enter Size of Array :");
            int size=sc.nextInt();
            int arr[]=new int [size];//create array & read values one by one

            for(int i=0;i<arr.length;i++)
            {
                System.out.print("Enter "+(i+1)+" Value :");
                arr[i]=sc.nextInt();
            }

            SumOfThree t1=new SumOfThree();
            int sum=t1.findDistinctTriplets(arr,size);//pass the arguments to method 1
            System.out.println("No.of Tripltes :"+sum);
            System.out.println();
        }
    }

//4. Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
//Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
//can be found using a formula (Note: Take a, b and c as input values)
//delta = b*b - 4*a*c
//Root 1 of x = (-b + sqrt(delta))/(2*a)
//Root 2 of x = (-b - sqrt(delta))/(2*a)

    class Quadratic_Equation {

        public static void main(String[] args) {

            // value a, b, and c
            double a = 3.2, b = 4, c = 4.5;
            double root1, root2;

            // calculate the determinant (b2 - 4ac)
            double delta= b * b - 4 * a * c;

            // check if determinant is greater than 0
            if (delta > 0) {

                // two real and distinct roots
                root1  = (-b + Math.sqrt(delta))/ (2 * a);
                root2  = (-b - Math.sqrt(delta))/ (2 * a);
                //root1 = (-b + Math.sqrt(determinant)) / (2 * a);
                //root2 = (-b - Math.sqrt(determinant)) / (2 * a);

                System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
            }

            // check if determinant is equal to 0
            else if (delta == 0) {

                // two real and equal roots
                // determinant is equal to 0
                // so -b + 0 == -b
                root1 = root2 = -b / (2 * a);
                System.out.format("root1 = root2 = %.2f;", root1);
            }

            // if determinant is less than zero
            else {

                // roots are complex number and distinct
                double real = -b / (2 * a);
                double imaginary = Math.sqrt(-delta) / (2 * a);
                System.out.format("root1 = %.2f+%.2fi", real, imaginary);
                System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
            }
        }
    }



//5. Write a program WindChill.java that takes two double command-line arguments t
//and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
//temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
//National Weather Service defines the effective temperature (the wind chill) to be:
// w=35.74 + 0.6215 + (0.4275 t -35.75)v (power0.16)
//Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger
//than 120 or less than 3 (you may assume that the values you get are in that range).



    class WindChill {
        public static void main(String[] args) {

            double t = Double.parseDouble(args[0]);// temperature
            double v = Double.parseDouble(args[1]); //wind speed (mph)
            double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
            System.out.println("Temperature = " + t);
            System.out.println("Wind speed  = " + v);
            System.out.println("Wind chill  = " + w);
        }

    }



