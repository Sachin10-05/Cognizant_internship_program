//*******************************************************************StudentMain.java*********************************************************************************

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code here
		
		System.out.println("Enter Student's Id:");
		int studentId = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Student's Name:");
		String studentName = sc.nextLine();
		
		System.out.println("Enter Student's address:");
		String studentAddress = sc.nextLine();
		
		while(true)
		{
		    System.out.println("Whether the student is from NIT(Yes/No");
		    String result = sc.nextLine();
		    
		    if (result.equalsIgnoreCase("yes"))
		    {
		        Student obj = new Student(studentId, studentName, studentAddress);
		        
		        
		        System.out.println("Student id:"+obj.getStudentId());
		        System.out.println("Students name:"+obj.getStudentName());
		        System.out.println("Address:"+obj.getStudentAddress());
		        System.out.println("College name:"+obj.getCollegeName());
		        break;
		    }
		    else if(result.equalsIgnoreCase("no"))
		    {
		        System.out.println("Enter the college name:");
		        String collegeName = sc.nextLine();
		        
		        Student obj = new Student(studentId, studentName, studentAddress, collegeName);
		        System.out.println("Student id:"+obj.getStudentId());
		        System.out.println("Student name:"+obj.getStudentName());
		        System.out.println("Address:"+obj.getStudentAddress());
		        System.out.println("College name:"+obj.getCollegeName());
		        break;
		    }
		    else
		    {
		        System.out.println("Wrong Input");
		    }
		}
	}

}















//***********************************************************************Student.java*******************************************************************************


public class Student {

    // Fill the code here
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;
    
    public Student(int studentId, String studentName, String studentAddress)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = "NIT";
    }
    public Student(int studentId, String studentName, String studentAddress, String collegeName)
    {
        this(studentId,studentName,studentAddress);
        this.collegeName = collegeName;
    }
    
    public int getStudentId()
    {
        return this.studentId;
    }
    public String getStudentName()
    {
        return this.studentName;
    }
    public String getStudentAddress()
    {
        return this.studentAddress;
    }
    public String getCollegeName()
    {
        return this.collegeName;
    }
    
}
