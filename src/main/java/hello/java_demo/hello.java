package hello.java_demo;

public class hello {
	public static void main(String args[]) {
		hello obj1 =new hello();
		obj1.Concat("Hello" ,args[0]);
	}
	public String Concat(String a, String b)
	{
		String c=a+" "+b;
		System.out.println(c);
		return c;
	}

}
