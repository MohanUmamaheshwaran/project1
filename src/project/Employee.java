package project;

public class Employee {
	public static void main(String[] args) {
		
		String s="Java";
		boolean equals=s.equals(s);
		System.out.println(equals);
		
		String s1="Java";
		boolean equals1 =s.equals(s1);
		System.out.println(equals1);
		
		
		//nested if (operator)
		int a = 10; int b= 22; int c= 44;
		
		if(a>b& a<c) {
			System.out.println("a is greater");
		}
		else if(b<c && b<a) {
			System.out.println("b is greater");
			
		}
		else if(c>a|| c<b) {
			System.out.println("c is greater");
		}
		//false block
		else {
			System.out.println("end");
		}
		
<<<<<<< HEAD
		
=======
	String str= "hello"	;
	String output ="";
	
	for (int i= str.length()-1;i>=0;i--) {
		char C= str.charAt(i);
		output=output+C;
>>>>>>> a2e18b83e2fba9ca908318297e4d183ddfc7d842
	}
	System.out.println("Reverse of given String :" + output);
		
		
	}
		
		
	}
	
	
	


