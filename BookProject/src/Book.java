
public class Book {
	
	private String title;
	private int isbn;
	private Author author;
	// private ArrayList<Author> authors;

	
	
	//CONSTRUCTOR
	
	public Book(String title, int isbn, Author author) {
		setTitle(title); 
		setIsbn(isbn);
		setAuthor(author);
	}
	
	
	
	//GETTER
	
	/*
	 * @ return title
	 */
	public String getTitle() {
		return title;
	}
	/*
	 * @ return isbn
	 */
	public int getIsbn() {
		return isbn;
	}
	/*
	 * @ return author
	 */
	public Author getAuthor() {
		return author;
	}
	
	
	
	// SETTER
	
	/*
	 * @ param title
	 */
	public void setTitle(String title) {
		if (!title.isEmpty() && !title.equalsIgnoreCase(null)) {
			this.title = title;
		} else {
			this.title = "Unknown";
		}	
	}
	/*
	 * @ param isbn
	 */
	public void setIsbn(int isbn) {
		if (isbn > 1000) {
			this.isbn = isbn;
		} else {
			this.isbn = 1000;
		}		
	}
	/*
	 * @ param author
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}
}
