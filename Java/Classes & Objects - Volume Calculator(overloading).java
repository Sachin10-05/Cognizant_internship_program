//*********************************************************************TestMain.java***********************************************************************************

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code here
		
		VolumeCalculator vol = new VolumeCalculator();
		
		
		System.out.println("Enter the choice");
		System.out.println("1.Find Volume for Cylinder");
		System.out.println("2.Find Volume for Cuboid");
		int n = sc.nextInt();
		
		if (n==1)
		{
		    System.out.println("Enter the radius");
		    double radius = sc.nextDouble();
		    System.out.println("Enter the height");
		    double height = sc.nextDouble();
		        
		    System.out.println("Volume of the Cylinder is "+ vol.calculateVolume(radius,height));
		    
		}
		        
		else if(n==2)
		{
		    System.out.println("Enter the length");
		    int length = sc.nextInt();
		    System.out.println("Enter the breadth");
		    int breadth = sc.nextInt();
		    System.out.println("Enter the height");
		    int height = sc.nextInt();
		        
		    System.out.println("Volume of the Cuboid is "+ vol.calculateVolume(length,breadth,height));
		    
		}
		        
		else
		{
		    System.out.println("Invalid Choice");
		}
        
		
	}

}


















//*******************************************************************************VolumeCalculator.java***************************************************************

import java.util.*;

public class VolumeCalculator {

    // Fill the code here
    
    public double calculateVolume(double radius, double height)
    {
        return (3.14 * radius * radius * height);
    }
    
    public double calculateVolume(int length, int breadth, int height)
    {
       return  (length * breadth * height);
    }

    
}
