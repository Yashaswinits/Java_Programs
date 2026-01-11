class Calculator {

	void add(int a) {
		int c = 10 + a;
		System.out.println("inside int add");
	}

	void add(float b) {
		float d = 10.5f + b;
		System.out.println("inside float add");
	}

	void add(double m) {
		double n = 20.5 + m;
		System.out.println("inside double add");
	}

	void add(int a, int b) {
		int c = a + b;
		System.out.println("inside int,int add");
	}

	void add(int a, float b) {
		float d = a + b;
		System.out.println("inside int,float add");
	}

	void add(int a, int b, float c) {
		float g = a + b + c;
		System.out.println("inside int,int float");
	}
	void add(int a,float b,float c) {
		float h= a+b+c;
		System.out.println("inside int,float,float");
	}
	void add(float  g,int h, float i) {
		float j=g+h+i;
		System.out.println("inside float,int,int");
	}
}
public class Myoverload {	
	public static void main(String[] args) {
        Calculator c =new Calculator();
        c.add(10);
        c.add(10.5);
        c.add(10,20);
		c.add(10,10,20.5f);
		c.add(10.5f,30,40);
	}
}
