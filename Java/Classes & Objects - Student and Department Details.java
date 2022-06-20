//***************************************************************TestMain.java*************************************************************************************

import java.util.*;
public class TestMain {

    // Fill the code here
    
    public static Department d1;
    public static Student s1;
    
    public static Student createStudent()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Department id:");
        int did = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Department name:");
        String dname = sc.nextLine();
        
        System.out.println("Enter the Student id:");
        int sid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Student name:");
        String sname = sc.nextLine();
        
        
        s1 = new Student();
        d1 = new Department();
        
        d1.setDid(did);
        d1.setDname(dname);
        s1.setSid(sid);
        s1.setSname(sname);
        s1.setDepartment(d1);
        
        return s1;
    }
    
    public static void main(String args[])
    {
        s1 = TestMain.createStudent();                                                                        //in main method invoking class createStudent
        
        System.out.println("Department id:"+d1.getDid());
        System.out.println("Department name:"+d1.getDname());
        System.out.println("Student id:"+s1.getSid());
        System.out.println("Student name:"+s1.getSname());
    }
    
    
    
}












//*************************************************************************Student.java*****************************************************************************


public class Student {

    // Fill the code here
    
    private int sid;
    private String sname;
    private Department department;
    
    public void setSid(int sid)
    {
        this.sid = sid;
    }
    public void setSname(String sname)
    {
        this.sname =sname;
    }
    public void setDepartment(Department department)
    {
        this.department = department;
    }
    
    public int getSid()
    {
        return sid;
    }
    public String getSname()
    {
        return sname;
    }
    public Department getDepartment()
    {
        return department;
    }


}














//***********************************************************************Department.java***************************************************************************


public class Department {

    // Fill the code here
    
    private int did;
    private String dname;
    
    public void setDid(int did)
    {
        this.did = did;
    }
    public void setDname(String dname)
    {
        this.dname = dname;
    }
    
    
    
    public int getDid()
    {
        return did;
    }
    public String getDname()
    {
        return dname;
    }


}
