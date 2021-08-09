import java.util.Scanner;
class AddressBookMain
{
	public static void main(String args[])
	{
		System.out.println("Welcome to Address book program..");
		AddressBook book=new AddressBook();
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("How many contacts u want to enter:");
		book.addContact();
		System.out.println();
		System.out.println("Do you want to edit the contact? yes or no ");
		String option=sc.next();
		if(option.equals("yes"))
		{
			System.out.println();
			System.out.println("Enter first name to edit:");
			book.editContact();
		}
	}
}