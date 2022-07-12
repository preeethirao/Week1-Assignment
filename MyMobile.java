package week1.day2;

public class MyMobile {
String mobname="redmi";
char model='M';
 
public void makecall() {
System.out.println("hello");}
	
public void sendMsg () {
	 System.out.println("hi");
	 }
private void paybills() {
	System.out.println("paybills");

}
public static void main(String[] args) {
MyMobile object= new MyMobile();
System.out.println(object.mobname);
System.out.println(object.model);
object.sendMsg();
object.makecall();
object.paybills();
			
	
}


}



