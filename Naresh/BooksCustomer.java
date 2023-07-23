class BooksCustomer 
{
	public static void main(String[] args) 
	{
		Author naresh = new Author("Naresh", 30, 'M', new String[]{"Rich dad poor dad", "7 habits of highly effective people"});
		AuthorBook java = new AuthorBook("How to learn Java", 500, 450.0, naresh);
		System.out.println(java);
	}
}
