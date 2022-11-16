
public class Triangle {
	
	
	int height;
	int base;
	
	Triangle()
	
	{
		
		
	}
	
	
	Triangle(int height, int base)
	
	{
		this.base=base;
		this.height=height;
		
	}
	
	public double rightAngletriangleArea(int height, int base)
	
	{
		
		double oneByTwo=1/2;
		
		double area=oneByTwo*(this.base*this.height);
		
		return area;
		
	}

}
