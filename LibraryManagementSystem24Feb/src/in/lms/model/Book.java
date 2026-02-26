package in.lms.model;

public class Book {
	private int id;
	private String title;
	private String auther;
	private boolean available;
	
	
	
	public Book(int id, String title, String auther, boolean available) {
		this.id = id;
		this.title = title;
		this.auther = auther;
		this.available = available;
	}

	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuther() {
		return auther;
	}
	
	public boolean isAvailable() {
		return available;
	}
	
	public void setAvailable(boolean available) {
	    this.available = available;
	}

	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", auther=" + auther + ", available=" + available + "]";
	}
	

}
