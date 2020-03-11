package pactice_2;

public class book implements Comparable<book>{

	String name,title,pub;
	double price;
	book(String n,String t,String p,double pr){
		name=n;
		title=t;
		pub=p;
		price=pr;
	}
	public String toString() {
		return name+" "+title+" "+pub+" "+price;
	}
	@Override
	public int compareTo(book b) {
		return (int)(this.price-b.price);
	}

}
