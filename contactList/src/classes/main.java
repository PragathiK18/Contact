package classes;

public class main {
	
    public static void main(String[] args) {
       contact.addContact("John", "555-1234");
       contact.addContact("Alice", "555-5678");
       contact.addContact("Bob", "555-9012");
       contact.addContact("Eve", "555-3456");
       System.out.println(searchContact.search("Bob")); 
        
    }
}
