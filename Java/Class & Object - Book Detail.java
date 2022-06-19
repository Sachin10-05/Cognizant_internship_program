//***********************************************************************Book.java*************************************************************************************


public class Book {

    // Fill the code here
    
    private String bookName;
    private int bookPrice;
    private String authorName;
    
    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }
    public String getBookName()
    {
        return this.bookName;
    }
    
    
    public void setBookPrice(int bookPrice)
    {
        this.bookPrice = bookPrice;
    }
    public int getBookPrice()
    {
        return this.bookPrice;
    }
    
    
    public void setAuthorName(String authorName)
    {
        this.authorName = authorName;
    }
    public String getAuthorName()
    {
        return authorName;
    }

}

















//*******************************************************************************TestBook.java******************************************************************

import java.util.Scanner;
public class TestBook {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code here
		
		System.out.println("Enter the Book name:");
		String bookName = sc.nextLine();
		
		System.out.println("Enter the price:");
		int bookPrice = sc.nextInt();
		
		System.out.println("Enter the Author name:");
		String authorName = sc.nextLine();
		sc.nextLine();
		
		Book obj = new Book();
		obj.setBookName(bookName);
		obj.setBookPrice(bookPrice);
		obj.setAuthorName(authorName);
		
		System.out.println("Book Details");
		System.out.println("Book Name:"+obj.getBookName());
		System.out.println("Book Price:"+obj.getBookPrice());
		System.out.println("Author Name:"+obj.getAuthorName());
	    
	}

}
