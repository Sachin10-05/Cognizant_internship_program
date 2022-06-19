import java.util.Scanner;

public class Main {
    static int ispal(int n)
    {
        int rev = 0;
        for(int i=n; i>0;i/=10)
        rev = rev*10+i%10;
        return (n==rev)?1:0;
    }
    static void cout(int min, int max)
    {
        for (int i=min;i<=max;i++)
        if(ispal(i)==1)
        System.out.print(i+" ");
    }

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting range");
		
		int start = sc.nextInt();
		System.out.println("Enter the ending range");
		int end = sc.nextInt();
		cout(start,end);
		// Fill the code
		
	}

}
