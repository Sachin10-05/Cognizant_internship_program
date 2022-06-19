//*************************************************************************Main.java*********************************************************************************

import java.util.*;
 public class Main{
     public static Movie getMovieDetails(){
         Movie mov=new Movie();
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the movie name:");
         mov.setMovieName(s.nextLine());
         System.out.println("Enter the movie category:");
         mov.setMovieCategory(s.nextLine());
         return mov;
     }
     public static String getCircle(){
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the circle:");
         return(s.nextLine());
     }
     public static void main (String[] args) {
         Scanner s=new Scanner(System.in);
         Movie m=getMovieDetails();
         String circle=getCircle();
         int type=m.calculateTicketCost(circle);
         System.out.println("Movie name = "+m.getMovieName());
         System.out.println("Movie category = "+m.getMovieCategory());
         if(type==0)
         System.out.println("The ticket cost is = "+m.getTicketCost());
         if(type==-1)
         System.out.println("Sorry there is no "+m.getMovieCategory()+" type of category in theater.");
         if(type==-2)
         System.out.println("Sorry!!! Circle is Invalid.");
         if(type==-3)
         System.out.println("Sorry!!! Both circle and category are Invalid.");
     }
 }



















//**************************************************************************Movie.java********************************************************************************

public class Movie{
     private String movieName,movieCategory;
     private int ticketCost;
     
     public void setMovieName(String s){
         movieName=s;
     }
     public void setMovieCategory(String s){
         movieCategory=s;
     }
     public void setTicketCost(int i){
         ticketCost=i;
     }
     public String getMovieName(){
         return movieName;
     }
     public String getMovieCategory(){
         return movieCategory;
     }
     public int getTicketCost(){
         return ticketCost;
     }
     public int calculateTicketCost(String circle){
         String cat=getMovieCategory();
         if(circle.equalsIgnoreCase("GOLD")&& cat.equalsIgnoreCase("2d")){
             setTicketCost(300);
             //System.out.println("circle and cat=="+circle+cat);
             return 0;
         }
         else if(circle.equalsIgnoreCase("GOLD")&& cat.equalsIgnoreCase("3d"))
         {
             setTicketCost(500);
             return 0;
         }
         else if(circle.equalsIgnoreCase("SILVER")&&cat.equalsIgnoreCase("2d"))
         {
             setTicketCost(250);
             return 0;
        }
         else if(circle.equalsIgnoreCase("SILVER")&&cat.equalsIgnoreCase("3d"))
         {
             setTicketCost(450);
             return 0;
         }
         else if(circle.equalsIgnoreCase("GOLD")||circle.equalsIgnoreCase("SILVER"))
         {
             return -1;
         }
         else if(cat.equalsIgnoreCase("2d")||cat.equalsIgnoreCase("3d"))
         {
             return -2;
         }
         return -3;
     }
 }
