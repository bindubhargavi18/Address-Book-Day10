import java.util.Scanner;
import java.util.ArrayList;
class AddressBook
{
	ArrayList<Contacts> contact=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	String firstName,lastName,address,city,state,email;
	int zip;
	long phn;
	int number;
	Contacts info;
	void addContact()
	{
		number=sc.nextInt();
		for(int i=0;i<number;i++)
		{
			System.out.println("Enter first name:");
			firstName=sc.next();
			System.out.println("Enter last name:");
			lastName=sc.next();
			System.out.println("Enter address:");
			address=sc.next();
			System.out.println("Enter city:");
			city=sc.next();
			System.out.println("Enter state:");
			state=sc.next();
			System.out.println("Enter e-mail:");
			email=sc.next();
			System.out.println("Enter zip:");
			zip=sc.nextInt();
			System.out.println("Enter phn:");
			phn=sc.nextLong();
			contact.add(new Contacts(firstName,lastName,address,city,state,zip,phn,email));
		}
		System.out.println();
		System.out.println("FirstName"+" "+"LastName"+" "+"Address"+" "+"City"+" "+"State"+" "+"E-mail"
							+" "+"zip"+" "+"PhoneNumber");	
		System.out.println("------------------------------------------------------------");
		for(int i=0;i<number;i++)
		{
			info=contact.get(i);
			System.out.println(info.firstName+" "+info.lastName+" "+info.address+" "+info.city+" "
								+info.state+" "+info.email+" "+info.zip+" "+info.phn);
		}
	}
}