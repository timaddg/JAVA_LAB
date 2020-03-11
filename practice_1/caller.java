package practice_1;
import java.util.*;
import java.time.*;

public class caller {
String name;
long num;
LocalTime time;
caller(String n,LocalTime t,long nu){
	name=n;
	num=nu;
	time=t;
}
public String toString() {
	return name+" :"+num+" ;"+time;
}
}
