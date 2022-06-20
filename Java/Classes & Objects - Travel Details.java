//***********************************************************************TestMain.java*********************************************************************************

import java.util.*;
public class TestMain
{
    public static BusTicket getTicketDetails()
    {
        BusTicket bt= new BusTicket();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the ticket no:");
        bt.setTicketNo(sc.nextInt());
        System.out.println("Enter the ticket price:");
        bt.setTicketPrice(sc.nextFloat());
        return bt;
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        Person p= new Person();
        System.out.println("Enter the passenger name:");
        p.setName(sc.nextLine());
        System.out.println("Enter the gender(M or F / m or f):");
        p.setGender(sc.next().charAt(0));
        System.out.println("Enter the age:");
        p.setAge(sc.nextInt());
        BusTicket bt= getTicketDetails();
        bt.setPerson(p);
        p= bt.getPerson();
        System.out.println("Ticket no:"+bt.getTicketNo());
        System.out.println("Passenger Name:"+p.getName());
        System.out.println("Price of a ticket : "+bt.getTicketPrice());
        bt.calculateTotal();
        System.out.println("Total Amount : "+bt.getTotalAmount());
    }
}


















//***************************************************************************Person.java*******************************************************************************

public class Person 
{
    private String name;
    private char gender;
    private int age;
    public void setName(String name)
    {
        this.name=name;
    }
    public void setGender(char gender)
    {
        this.gender= gender;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getName()
    {
        return this.name;
    }
    public char getGender()
    {
        return this.gender;
    }
    public int getAge()
    {
        return this.age;
    }
}















//************************************************************************BusTicket.java*******************************************************************************

public class BusTicket
{
    private int ticketNo;
    private float ticketPrice;
    private float totalAmount;
    private Person person;
    public void setPerson(Person person)
    {
        this.person=person;
    }
    public Person getPerson()
    {
        return person;
    }
    public void setTicketNo(int ticketNo)
    {
        this.ticketNo=ticketNo;
    }
    public void setTicketPrice(float ticketPrice)
    {
        this.ticketPrice=ticketPrice;
    }
    public void setTotalAmount(float totalAmount)
    {
        this.totalAmount= totalAmount;
    }
    public int getTicketNo()
    {
        return ticketNo;
    }
    public float getTicketPrice()
    {
        return ticketPrice;
    }
    public float getTotalAmount()
    {
        return totalAmount;
    }
    public void calculateTotal()
    {
        if(person.getAge()<=15)
        {
            setTotalAmount(ticketPrice/2);
        }
        else if(person.getAge()>=60)
        {
            setTotalAmount(ticketPrice*75/100);
        }
        else if(person.getGender()=='f'||person.getGender()=='F')
        {
            setTotalAmount(ticketPrice*90/100);
        }
        else
        {
            setTotalAmount(ticketPrice);
        }
    }
}
