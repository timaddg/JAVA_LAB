package pactice_2;
import java.util.*;

public class register {
	static HashMap<Integer,book> liblist=new HashMap<Integer,book>();
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		liblist.put(1,new book("rr martin","GOT","hbo",900));
		liblist.put(2,new book("schur","b99","hbvv",1000));
		liblist.put(3,new book(" martin sc","tbbt","amc",300));
		Object[] blist1=liblist.values().toArray();
		Arrays.sort(blist1);
		for(Object b:blist1) {
			System.out.println(b);
			}
		while(true) {
			System.out.println("1. Author \n 2.publisher \n 3. title \n 4. change publisher \n 5.price \n 6 exit \n");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:author();
			break;
			case 2:publisher();
			break;
			case 3:title();
			break;
			case 4:edit();
			break;
			case 5:price();
			break;
			case 6:System.exit(0);
			break;
			}
			
		}
		
	}
	public static void author() {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter author: ");
		String a=s1.next();
		Set<Map.Entry<Integer, book>> blist=liblist.entrySet();
		for(Map.Entry<Integer,book> x:blist) {
			book b=x.getValue();
			if(b.name.contains(a)) {
				System.out.println(b);
			}
		}
				
}
	public static void publisher() {
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter publisher: ");
		String p=s2.next();
		Set<Map.Entry<Integer, book>> blist=liblist.entrySet();
		for(Map.Entry<Integer,book> x:blist) {
			book b=x.getValue();
			if(b.pub.contains(p)) {
				System.out.println(b);
			}
		}
				
}
	public static void title() {
		Scanner s3=new Scanner(System.in);
		System.out.println("Enter publisher: ");
		String t=s3.next();
		Set<Map.Entry<Integer, book>> blist=liblist.entrySet();
		for(Map.Entry<Integer,book> x:blist) {
			book b=x.getValue();
			if(b.pub.contains(t)) {
				System.out.println(b);
			}
		}
				
}
	public static void price() {
		Scanner s4=new Scanner(System.in);
		System.out.println("Enter price: ");
		double pr=s4.nextDouble();
		Set<Map.Entry<Integer, book>> blist=liblist.entrySet();
		for(Map.Entry<Integer,book> x:blist) {
			book b=x.getValue();
			if(b.price>pr) {
			System.out.println(b);	
			}
		}
				
}
	
	
	public static void edit() {
		Set<Map.Entry<Integer, book>> blist=liblist.entrySet();
		Scanner s4=new Scanner(System.in);
		System.out.println("enter title :");
		String t=s4.next();
		for(Map.Entry<Integer,book> x:blist) {
			book b=x.getValue();
			int bid=x.getKey();
			if(b.title.equals(t)) {
				System.out.println("enter new publisher : \n ");
				String p=s4.next();
				b.pub=p;
				liblist.put(bid,b);
			}
		
		}
	}

}
