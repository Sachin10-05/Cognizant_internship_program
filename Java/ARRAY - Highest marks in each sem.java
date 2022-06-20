import java.util.*;

public class HighestMarkPerSem

{

 public static void main(String[] args) {

  

  Scanner sc= new Scanner(System.in);

  System.out.println("Enter no of semester:");

  int n=sc.nextInt();

  

  int subjects[] = new int[n+1];

  

  for(int i=1; i<=n; i++){

     System.out.println("Enter no of subjects in " +i+ " semester:");

     subjects[i]=sc.nextInt();

  }
  int max[]= new int[n+1];

  boolean invalid=false;

  

  for(int i=1; i<=n; i++){

     int maxnum=0;

     System.out.println("Marks obtained in semester "+i+":");

     for(int j=1; j<=subjects[i]; j++){

         int marks=sc.nextInt();

         

         if(marks < 0){

             invalid=true;

             System.out.println("You have entered invalid mark.");

             break;

         }

         

         if(j==1){

             maxnum = marks;

         }

         

         if(marks > maxnum){

             maxnum=marks;

         }

         

         max[i]=maxnum;

     }

     

     if(invalid==true)

     break;

  }

  

  if(invalid==false){

     for(int i=1; i<=n; i++){

         System.out.println("Maximum mark in " +i+ " semester: "+max[i]);

     }

     

  }

 }

}
