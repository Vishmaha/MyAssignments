package week1.day2;

public class Library {

	public String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	 public void issueBook()
	{
	System.out.println("Book issued successfully");
	}
	
		public static void main(String[] args)
		{
			Library ref = new Library();
			String title = ref.addBook("Sherlock holmes");
			System.out.println("Book title: " +title);
			ref.issueBook();
		}
	

	}


