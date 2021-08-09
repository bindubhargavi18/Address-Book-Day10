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
	}
}