public class q3Triangle {
public static void main(String[] args) {
	Triangle obj= new Triangle();
 }
}
class Triangle{
	Triangle()
	{
		int e=3,f=4,g=5;
		int s=(e+f+g)/2;
		double perimeter=e+f+g;
		double area= Math.sqrt(s*(s-e)*(s-f)*(s-g));
		System.out.println("perimeter of triangle="+perimeter);
		System.out.println("area of triangle="+area);
		
	}
}