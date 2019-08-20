package org.java;

public class Java implements I1, I2 {
@Override
public void add(String c) {
	System.out.println("hai");
	System.out.println(c);
}
@Override
	public void sub() {
		System.out.println("lll");
	}
@Override
	public void mul() {
System.out.println("zzzz");		
	}
@Override
	public void div() {
System.out.println("div");		
	}
public static void main(String[] args) {
	Java j=new Java();
	j.add("swathy");
	j.div();
	j.mul();
	j.sub();
}
}
