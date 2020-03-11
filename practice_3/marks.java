package practice_3;

public class marks {
String name,usn,address;
int age;
//float[] sgpa=new float[8];

marks(String n,String u,String addr,int ag) {
	name=n;
	usn=u;
	address=addr;
	age=ag;
	
	
	
}
public String toString() {
	return name+"\t"+age+"\t"+address+"\t"+usn+"\t";
}


}
