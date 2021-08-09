class Contacts
{
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String email;
	int zip;
	long phn;
	
	Contacts(String firstName,String lastName,String address,String city,String state,int zip,long phn,String email)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.phn=phn;
		this.email=email;
	}	
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	public String getFirstName()
	{
		return firstName;
	}

	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	public String getLastName()
	{
		return lastName;
	}

	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}

	public void setCity(String city)
	{
		this.city=city;
	}
	public String getCity()
	{
		return city;
	}
	public void setState(String state)
	{
		this.state=state;
	}
	public String getState()
	{
		return state;
	}

	public void setZip(int zip)
	{
		this.zip=zip;
	}
	public int getZip()
	{
		return zip;
	}
	public void setPhn(int phn)
	{
		this.phn=phn;
	}
	public long getPhn()
	{
		return phn;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getEmail()
	{
		return email;
	}
	
}
