import java.awt.Rectangle;

public class RectangleDriver {
	
	public static void main(String[] args) {
		Rectangle one; 
		one = new Rectangle(5, 10, 20, 30);
		Rectangle two; 
		two = new Rectangle(10, 25, 35, 15);
		Rectangle three;
		three = new Rectangle(20, 30, 10, 25);
		Rectangle four;
		four = one.intersection(two);
		Rectangle five;
		five = one.intersection(three);
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		
	}
}
