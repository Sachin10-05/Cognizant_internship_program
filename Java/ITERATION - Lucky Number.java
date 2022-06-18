import java.util.Scanner;

public class LuckyNum {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		
		System.out.println("Enter the car no:");
		int car_no = sc.nextInt();
		int sum = 0;
		
		if(car_no<1000 || car_no>9999)
		{
		    System.out.println(car_no+" is not a valid car number");
		}
		else
		{
		    while(car_no>0)
		    {
		        sum+=car_no%10;
		        car_no/=10;
		    }
		    if(sum%3==0 || sum%5==0 || sum%7==0)
		    {
		        System.out.println("Lucky Number");
		    }
		    else
		    {
		        System.out.println("Sorry its not my lucky number");
		    }
		}
	}

}
