package org.java;

import java.util.Scanner;

public class Java2 {
	public static void main(String[] args) {
		String res="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Address");
		String n = sc.nextLine();
		System.out.println(n);
		String[] sp = n.split(" ");
		
				for (String x : sp) {
					//System.out.println(x);
					char ch=x.charAt(0);
					if ((ch == '0') || (ch == '1') || (ch == '2') || (ch == '3') || (ch == '4') || (ch == '5') || (ch == '6')
						 || (ch == '7') || (ch == '8') || (ch == '9')){
						res=x;
						System.out.println(res);
						if(n.contains(res)) {
							System.out.println("valid");
						}else
						{
							System.out.println("not valid");
						}
					}else {
						System.out.println("not");
					}
						
				}

			
			}

}

//if ((ch == '0') || (ch == '1') || (ch == '2') || (ch == '3') || (ch == '4') || (ch == '5') || (ch == '6')
//  || (ch == '7') || (ch == '8') || (ch == '9')