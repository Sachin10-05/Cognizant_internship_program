import java.util.*;


public class Factorial

{

    public static void main(String[] args)

    {





        Scanner sc = new Scanner(System.in); //System.in is a standard input stream  

        System.out.println("Enter the size of an array:");

        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++)

        {



            int number = sc.nextInt();

            arr[i] = number;

        }



        int sum = 0;



        for (int i = 0; i < size; i++)

        {

            if (arr[i] < 10 && arr[i] > 0)

            {

                int val = calc(arr[i]);

                sum += val;

            }

        }

        if (sum == 0) {
            System.out.println("No positive and single digit numbers found in an array");
        } else {
            System.out.println(sum);
        }


    }



    static int calc(int val)

    {

        int i, fact = 1;

        for (i = 1; i <= val; i++) {

            fact = fact * i;

        }



        return fact;

    }



}
