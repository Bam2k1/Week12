
public class ExampleBook6 {
	public static void main(String[] args) {
		Book b1, b2;
		b1 = new Book("Thinking of Java","Bruce Eckel",1129);
		b2 = new Book("Thinking of Java","Bruce Eckel",1129);
				
		if (b1 == b2)
			System.out.println("The two books are the same");
		else
			System.out.println("The two books are different");
	}
}
