//**********************************************************************Student.java********************************************************************************


public class Student{
    private int id;
    private String name;
    private int marks[];
    private float average;
    private char grade;
    public Student(int a,String b,int[] c){
        id = a;
        name = b;
        marks = c;
    }
    public void setId(int n){
        id = n;
    }
    public int getId(){
        return id;
    }
    public void setMarks(int[] marks){
        this.marks = marks;
    }
    public int[] getMarks(){
        return marks;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setAverage(float n){
        average = n;
    }
    public float getAverage(){
        return average;
    }
    public void setGrade(char n){
        grade = n;
    }
    public char getGrade(){
        return grade;
    }
    public void calculateAvg(){
        float a1 = 0.0F;
        for(int a = 0; a < this.getMarks().length; a++)
            a1 = a1 + this.marks[a];
        this.setAverage(a1/getMarks().length);
    }
    public void findGrade(){
        int min = this.marks[0];
        for(int b = 0; b < this.getMarks().length; b++)
        {
            if(this.marks[b] < min)
                min = this.marks[b];
        }
        if(min < 50)
            this.setGrade('F');
        else if(this.getAverage() >= 80 && this.getAverage() <= 100)
            this.setGrade('O');
        else
            this.setGrade('A');
    }
}















//****************************************************************************StudentMain.java********************************************************************

import java.util.Scanner;

public class StudentMain{
    public static void main(String[] args){
        Student s = getStudentDetails();
        s.calculateAvg();
        s.findGrade();
        System.out.println("Id:"+s.getId());
        System.out.println("Name:"+s.getName());
        System.out.println("Average:"+String.format("%.2f",s.getAverage()));
        System.out.println("Grade:"+s.getGrade());
    }
    public static Student getStudentDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Enter the no of subjects:");
        int n = sc.nextInt();
        if(n <= 0){
            while(n <= 0){
                System.out.println("Invalid number of subject");
                System.out.println("Enter the no of subjects:");
                n=sc.nextInt();
            }
        }
        int arr[] = new int[n];
        for(int a = 0; a < n; a++){
            System.out.println("Entermark for subject "+(a+1)+":");
            int b=sc.nextInt();
            if(b < 0 || b > 100){
                System.out.println("Invalid Mark");
                System.out.println("Enter mark for subject "+(a+1)+":");
                b = sc.nextInt();
            }
            arr[a] = b;
        }
        Student obj = new Student(id,name,arr);
        obj.setId(id);
        obj.setName(name);
        return obj;
    }
}
