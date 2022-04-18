
public class ExampleBooks5 {
	public static void main(String[] args) {
		
		Book[] a = new Book[3];
		
		a[0] = new Book("Thinking in Java","Bruce Eckel",1129);
		a[1] = new Book("Java in a nutshell","David Flanagan",353);
		a[2] = new Book("Java network programming","Elliott Rusty Harold",649);
		
		for(int i = 0; i < a.length; i++)
			System.out.println("Initials: " + a[i].getInitials());
	}
}
