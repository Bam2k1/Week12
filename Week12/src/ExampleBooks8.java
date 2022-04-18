
public class ExampleBooks8 {
	public static void main(String[] args) {
		
		Book b1,b2;
		
		b1 = new Book("Thinking in Java","Bruce Eckel",1129);
		b2 = new Book("Java in a nutshell","David Flanagan",353);
		
		System.out.println("Owner of book b1: " + b1.getOwner());
		System.out.println("Owner of book b2; " + b2.getOwner());
	}
}
