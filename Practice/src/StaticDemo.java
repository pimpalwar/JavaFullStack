
public class StaticDemo {
	
	
	int globalA=10, globalB=20;//instance (object) level veriable
	
	static int staticC=100;//Class level veriable
	
	static int staticD=200;
	
	public static void  staticAddition()
	{
		 int staticE=staticC+staticD;
		System.out.println(staticE);
	}
	
	public StaticDemo() {
	}
 
	public StaticDemo(int localA, int localB)
	{
		this.globalA=localA;
		this.globalB=localB;
	}
	
	public void addition()
	{
		int c=this.globalA+this.globalB+StaticDemo.staticC;
		
		System.out.println(c);
		
	}
	
	public void m1()
	{
		System.out.println(staticC);
	}

	
	
	static {
		
		System.out.println("Inside static block");
		//System.loadLibrary(libname);
	}
	
	
	
	public static void main(String[] args) {
		
		
		  StaticDemo demo=new StaticDemo();
		  
		  System.out.println(demo.globalA+" "+demo.globalB+" "+demo.staticC+" "+demo.staticD);
		  
		  demo.globalA=15;
		  demo.globalB=30;
		  demo.staticC=111;
		  
		 System.out.println(demo.globalA+" "+demo.globalB+" "+demo.staticC+" "+demo.staticD);
		  
		  StaticDemo demo1= new StaticDemo();
		  
		  System.out.println(demo1.globalA+" "+demo1.globalB+" "+demo1.staticC+" "+demo1.staticD);
		  
		  StaticDemo.staticAddition();
		
		
		
	}
	
	
}
