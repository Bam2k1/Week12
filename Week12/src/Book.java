
public class Book {

	String title;
	String author;
	int numberOfPages;
	String ISBN;
	static String owner;
	
	Book(String tit,String aut,int num) {
		title = tit; author = aut;
		numberOfPages = num;
		ISBN = "unknown";
	}
	Book(String tit,String aut,int num,String isbn) {
		title = tit; author = aut;
		numberOfPages = num;
		ISBN = isbn;
	}

	public String getInitials() {
	String initials = "";
	for(int i = 0;i < author.length();i++) {
		char currentChar = author.charAt(i);
		if (currentChar >= 'A' && currentChar <='Z')
			initials = initials + currentChar + '.';
	}
	return initials;
	}
	
	public boolean equals(Book b) {
		return (title.equals(b.title)&&
				author.equals(b.author)&&
				numberOfPages == b.numberOfPages &&
				ISBN.equals(b.ISBN));
	}
	
	public void setOwner(String name) {
		owner = name;
	}
	public String getOwner() {
		return owner;
	}
	
	public static String description() {
		return "Book instances can store information on books";
	}
}
