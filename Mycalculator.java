package week1.day2;

import javax.management.openmbean.OpenMBeanAttributeInfo;

public class Mycalculator {
	
	
public static void main(String[] args) {
	Calculator Math= new Calculator();
	
	Math.add(12,34,12);
	Math.sub(22,12);
	Math.mul(10.7d, 6.4d);
	Math.divide(2f,9.7f);
	}
}
