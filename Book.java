public class Book{
	private String title;
	private String author;
	private int year;
	private boolean isAvailable;
	private int pageCount;
	
	public Book(){
		this("title", "author", 2000, true, 351);
	}
	
	public Book(String title, String author, int year){
		this(title, author, year, true, 351);
	}
	
	public Book(String title, String author, int year, boolean isAvailable, int pageCount){
		this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
        this.pageCount = pageCount;
	}
	
	public String displayInfo(){
		String result = title + "\n" + author + "\n" + year + "\n" + isAvailable + "\n" + pageCount;
		return result;
	}
	
	public void borrowBook(){
		if (isAvailable){
			isAvailable = false;
		}else{
			System.out.println("Книги нету сори");
		}
	}
	
	public void returnBook(){
         if (!isAvailable){
            isAvailable = true;
        }else{
            System.out.println("Книги уже есть");
        }
    }
	
    public void updateYear(int newYear){
        year = newYear;
    }
}