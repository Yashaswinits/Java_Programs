class Student1{
	int age;
	String name;
	
	int getAge() {
		return this.age;
	}
	
	String getname() {
		return this.name;
	}
	
	public Student1() {
		this(22);//method call
		System.out.println("inside zero param constructor");
	}

 public Student1(int age)
 {
	this("Ramesh");
	this.age=age;
	System.out.println("inside age constructor");	
 }

 public Student1(String name) {
	this.name=name;
	System.out.println("inside name constructor");
  }
}

 public class College {

	public static void main(String[] args) {
		Student1 s=new Student1();
		System.out.println(s.getAge());
		System.out.println(s.getname());
	}
}

