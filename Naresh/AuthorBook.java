class AuthorBook 
{
	String bookName;
	int totalPages;
	double price;
	Author author;

    public AuthorBook(String bookName, int totalPages, double price, Author author) {
	  this.bookName = bookName;
	  this.totalPages = totalPages;
	  this.price = price;
	  this.author = author;
	}

	public String toString() {
	return "Book Information[bookname="+this.bookName+", totalPages="+this.totalPages+", price="+this.price+", author="+this.author+"]";
	}

}
