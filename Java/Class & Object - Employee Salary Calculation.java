//***************************************************************************Employee.java***********************************************************************


public class Employee {

    // Fill the code here
    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setNetSalary(double netSalary){
        this.netSalary = netSalary;
    }
    public int getEmployeeId(){
        return this.employeeId;
    }
    public String getEmployeeName(){
        return this.employeeName;
    }
    public double getSalary(){
        return this.salary;
    }
    public double getNetSalary(){
        return this.netSalary;
    }
    public void calculateNetSalary(int pfpercentage){
        this.netSalary = this.salary-(this.salary*pfpercentage/100);
    }


}















//************************************************************************Main.java**********************************************************************************

import java.util.Scanner;

public class Main extends Employee {

	public static Employee getEmployeeDetails(){
		Scanner sc=new Scanner(System.in);
		// Fill the code here
		Employee emp = new Employee();
		System.out.println("Enter Id:");
		emp.setEmployeeId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Name:");
		emp.setEmployeeName(sc.nextLine());
		System.out.println("Enter Salary:");
		emp.setSalary(sc.nextDouble());
		return emp;
	}
	public static int getPFPercentage(){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter PF percentage");
	    return sc.nextInt();
	}
	public static void main(String[] args){
	    Employee emp = new Employee();
	    emp = getEmployeeDetails();
	    emp.calculateNetSalary(getPFPercentage());
	    System.out.println("Id: "+emp.getEmployeeId());
	    System.out.println("Name: "+emp.getEmployeeName());
	    System.out.println("Salary: "+emp.getSalary());
	    System.out.println("Net Salary: "+emp.getNetSalary());
	}

}
