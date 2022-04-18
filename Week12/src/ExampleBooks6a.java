
public class ExampleBooks6a {
	public static void main(String[] args) {
		
		Book b1,b2;
		
		b1 = new Book("Thinking in Java","Bruce Eckel",1129);
		b2 = b1;
		
		if (b1 == b2)
			System.out.println("The two books are the same");
		else
			System.out.println("The two books are different");
	}
}
