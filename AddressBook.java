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

	void editContact()
	{
		firstName=sc.next();
		int flag=0;
		for(int i=0;i<contact.size();i++)
		{
			info=contact.get(i);
			if(firstName.equals(info.firstName))
			{
				System.out.println();
				System.out.println("Do u want to edit entire contact details? yes or no");
				String ch=sc.next();
				if(ch.equals("yes"))
				{
					System.out.println("Enter your new address:");
					address=sc.next();
					System.out.println("Enter your new city:");
					city=sc.next();
					System.out.println("Enter your new state:");
					state=sc.next();
					System.out.println("Enter your new email:");
					email=sc.next();
					System.out.println("Enter your new zip:");
					zip=sc.nextInt();
					System.out.println("Enter your new phn number:");
					phn=sc.nextLong();
					contact.set(i,new Contacts(firstName,lastName,address,city,state,zip,phn,email));
					flag=1;
				}
				else
				{
					System.out.println();
					System.out.println("Enter your choice to edit particular details.:1.firstname 2.lastname 3.address 4.city 5.state 6.email 7.zip 8.phn number ");
					int choice=sc.nextInt();
					switch(choice)
					{
						case 1:System.out.println("Enter your new first name:");
							   firstName=sc.next();
							   contact.set(i,new Contacts(firstName,lastName,address,city,state,zip,phn,email));
							   break;
						case 2:System.out.println("Enter your new last name:");
								lastName=sc.next();
								contact.set(i,new Contacts(firstName,lastName,address,city,state,zip,phn,email));
								break;
						case 3:System.out.println("Enter your new address:");
								address=sc.next();
								contact.set(i,new Contacts(firstName,lastName,address,city,state,zip,phn,email));
								break;
						case 4:System.out.println("Enter your new city:");
								city=sc.next();
								contact.set(i,new Contacts(firstName,lastName,address,city,state,zip,phn,email));
								break;
						case 5:System.out.println("Enter your new state:");
								state=sc.next();
								contact.set(i,new Contacts(firstName,lastName,address,city,state,zip,phn,email));
								break;
						case 6:System.out.println("Enter your new email:");
								email=sc.next();
								contact.set(i,new Contacts(firstName,lastName,address,city,state,zip,phn,email));
								break;
						case 7:System.out.println("Enter your new zip");
								zip=sc.nextInt();
								contact.set(i,new Contacts(firstName,lastName,address,city,state,zip,phn,email));
								break;
						case 8:System.out.println("Enter your new phn number");
								phn=sc.nextLong();
								contact.set(i,new Contacts(firstName,lastName,address,city,state,zip,phn,email));
								break;

					}
					flag=1;
				}
				System.out.println();
				System.out.println("Address book after editing details:");
				System.out.println("-------------------------");
				for(i=0;i<number;i++)
				{
					info=contact.get(i);
					System.out.println(info.firstName+" "+info.lastName+" "+info.address+" "+info.city+" "
								+info.state+" "+info.email+" "+info.zip+" "+info.phn);
				}
				if(flag==0)
				System.out.println("Given name is not found in address book..");

			}
			
		}
	}
}