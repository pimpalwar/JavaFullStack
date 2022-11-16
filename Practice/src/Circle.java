
public class Circle {
	
	float redious;
	
	Circle()
	{
	}
	
	Circle(float redious)
	{
		this.redious=redious;
		
	}
	
	public double circumferenceOfCircle(float redious)
	
	{
//		C=2πr
		
		double pi=3.14159265;
		
		double circumference= 2*pi*this.redious;
		
		return circumference;
		
	}

}
