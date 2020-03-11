package practice_4;

public class item {
String name,id;
double cost;
item(String n,String i,double c){
	name=n;
	id=i;
	cost=c;
}
public String toString() {
	return name+" \n"+id+"\n"+cost+"\n";
}
}
