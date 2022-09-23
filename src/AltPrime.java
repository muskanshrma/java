import java.util.Scanner;

public class AltPrime {
        static int Prime(int number)
        {
            int i, count = 0;
            for(i = 2; i<= number / 2; i++)
            {
                if(number % i == 0)
                {
                    count = 1;
                    break;
                }
            }

            if(count == 0)
                return 1;
            else
                return 0;
        }
        static void Alt_Prime(int number)
        {
            int temp = 2;

            for(int n = 2; n <= number-1; n++)
            {
                //checking each number whether it is prime or not
                if (Prime(n) == 1)
                {
                    // if temp is even then only print the prime number
                    if (temp % 2 == 0)
                        System.out.print(n + " ");

                    temp ++;
                }
            }
        }

        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter any value ");
            int number = in.nextInt();
            System.out.print("Alternate prime numbers upto " + number+" are: ");
            Alt_Prime(number);
        }
    }