package pkg2;

public class Student2 {
 	//method 1 
	public int sum (int a, int b) {
	int sum = a+b;
	System.out.println("sum of numbers = "+sum);
	return sum;
	}
    //method 2
    public int sub (int c, int d) {
    int sub = c-d;
	System.out.println("substraction of numbers = "+sub);
	return sub;	
	}
    //method 3
    public int mul(int e, int f) {
	int mul = e*f;
	System.out.println("multiplication of numbers = "+mul);
	return mul;
	}
    //method 4
    public int div(int g, int h) {
	int div = g/h;
	System.out.println("Division of numbers ="+div);
	return div;
	
}
public static void main(String[] args) {
	Student2 std = new Student2();
	int sumresult = std.sum(12, 3);
	int subresult = std.sub(10, 2);
	int mulresult = std.mul(10, 2);
	int divresult = std.div(10, 2);
	
	
}
}


