package week5day1;

public class Calculator {
	public void add(int x, int y) {
		System.out.println(x+y);
	}
	public void add(float x, float y) {
		System.out.println(x+y);
	}
	public void add(long a, long b) {
		System.out.println(a+b);
	}
	public void add(short c, int d) {
		System.out.println(c+d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator c=new Calculator();
c.add(2, 4);
	c.add(10.01f, 20.002f);
	c.add(01234567l, 98765432l);
	c.add(1, 79);}

}
