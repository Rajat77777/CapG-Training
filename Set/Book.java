package Set;

public class Book{
	private int id;
	private String title;
	private double price;
	
	Book(int id, String title, double price){
		this.setId(id);
		this.setTitle(title);
		this.setPrice(price);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

//	@Override
//	public int compareTo(Book o) {
//		return this.id-((Book)o).id;
//	}
	
	
	public String toString() {
		return "id:"+" "+this.id +" "+"title:"+" "+this.title+" "+"price:"+this.price;
	}
}
