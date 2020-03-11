package practice_1;
import java.util.*;
import java.time.*;

public class mobile {
static HashMap<Long,String> hm = new HashMap<Long,String>();
static ArrayList<caller> ar=new ArrayList<caller>();
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	hm.put((long)809580335,"amit");
	hm.put((long)804660335,"tima");
	hm.put((long)809780995,"nino");
	hm.put((long)998780995,"nina");
	
	while(true) {
		System.out.println("1. Add \n 2. Check \n 3. View \n 4.Exit \n ");
	
	int ch=sc.nextInt();
	switch(ch) {
	case 1:add();
	break;
	case 2:check();
	break;
	case 3:System.out.println(ar.size()+" ");
	for(caller c:ar) 
		System.out.println(c);
	break;
	case 4:System.exit(0);
	break;
	}
	}
}
public static void add() {
	Scanner s=new Scanner(System.in);
	System.out.println("enter number:");
	long numb=s.nextLong();
	LocalTime now=java.time.LocalTime.now();
	if(ar.size()<10) {
		if(hm.containsKey(numb)) {
			ar.add(new caller(hm.get(numb),now,numb));
			}
		else
			ar.add(new caller("private caller",now,numb));
		
	}
	else {
		ar.remove(0);
		if(hm.containsKey(numb)) {
			ar.add(new caller(hm.get(numb),now,numb));
			}
		else
			ar.add(new caller("private caller",now,numb));
		
	}
}
public static void check() {
	Scanner se=new Scanner(System.in);
	ListIterator<caller> itr=ar.listIterator();
	while(itr.hasNext()){
		caller c=itr.next();
		System.out.println(c.num);
		System.out.println("1.Delete 2.Next 3.View");
		int ch1=se.nextInt();
		switch(ch1){
		case 1:
			itr.remove();
			break;
		case 2:
			break;
		case 3:
			System.out.println(c);
			break;
		default:System.out.println("Invalid Choice!");
		}
	}
}

}
