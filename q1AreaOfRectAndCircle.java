import java.util.Scanner;

public class q1AreaOfRectAndCircle
 {
	
	void Area(double le,double br){
		
		String area=String.format("%.3f", (le*br));
		System.out.println("Area of Rectange Is "+area+"sq.units");
	}
	
	void Area(double ra){
		
		double pi = 3.1415;
		String area= String.format("%.3f", (pi*Math.pow(ra, 2)));
		System.out.println("Area of Circle is "+area+"sq.units");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double radius,length,breadth;
		
		System.out.println("Enter radius of circle :");
		radius =sc.nextDouble();
		q1AreaOfRectAndCircle circle = new q1AreaOfRectAndCircle();
		circle.Area(radius);

		
		System.out.println("Enter  length and beadth of rectangle :");
		length = sc.nextDouble();
		breadth=sc.nextDouble();
		q1AreaOfRectAndCircle rectangle = new q1AreaOfRectAndCircle();
		rectangle.Area(length, breadth);
		
	
	}
	

}