import java.util.Scanner;

public class Course {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		
		System.out.println("Enter no of course: ");
		int number = sc.nextInt();
		if(number>0 && number<=20)
		{
		    String[] course = new String[number+1];
		    System.out.println("Enter course names:");
		    for(int i=0; i <= number;i++)
		    {
		        course[i] = sc.nextLine();
		    }
		    System.out.println("Enter the course to be searched:");
		    String searchitem = sc.nextLine();
		    int count = 0;
		    for(int i=0; i <= number;i++)
		    {
		        if(course[i].equals(searchitem))
		        {
		            count++;
		            break;
		        }
		    }
		    if(count == 1)
		    {
		        System.out.println(searchitem+" course is available");
		    }
		    else
		    {
		        System.out.println(searchitem+" course is not available");
		    }
		}
		else
		{
		    System.out.println("Invalid Range");
		}
	}

}
