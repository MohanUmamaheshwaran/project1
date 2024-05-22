package project;

public class Employee {
	public static void main(String[] args) {
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
	}

}
