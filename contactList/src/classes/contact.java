package classes;

import java.util.ArrayList;
import java.util.Collections;

public class contact implements Comparable<contact>{

	String name;
	String phoneNumber;

	static ArrayList<contact> contacts=new ArrayList<>();

	public contact(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public int compareTo(contact o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
	}
	
    public static void addContact(String name, String phoneNumber) {
        contacts.add(new contact(name, phoneNumber));
        Collections.sort(contacts);
    }

	@Override
	public String toString() {
		return "contact [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
    
}
