
public class Shapes {
	
	
	public static void main(String[] args) {
		
		Circle circle1 =new Circle(5);
		Circle circle2=new Circle(10);
		Circle circle3=new Circle(20);
		Circle circle4=new Circle(30);
		Circle circle5=new Circle(40);
		
		Circle[]  arrayOfcircles= {circle1,circle2,circle3,circle4,circle5};
		
		
		for(int i=0;i<arrayOfcircles.length;i++)
			
		{
			Circle circle=arrayOfcircles[i];
			
			double circumference = circle.circumferenceOfCircle(0);
			
			System.out.println(circumference);
			
			
			
		}
		
		
		
		
	}

}
