package classes;

public class searchContact {

	public static contact search(String name) {
		
		int low=0;
		int high=contact.contacts.size()-1;
		 while (low <= high) {
	            int mid = (low + high) / 2;
	            contact midContact = contact.contacts.get(mid);
	            if (midContact.getName().equals(name)) {
	                return midContact;
	            } else if (midContact.getName().compareTo(name) < 0) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
		 
	        return null;
	
	}
}





