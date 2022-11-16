
public class Arrays {

	
	public static void main(String[] args) {
		
		StringOperations operations= new StringOperations();
		StringOperations operations1= new StringOperations();
		StringOperations operations2= new StringOperations();
		
		StringOperations[] stringArray= {operations,operations1,operations2};
		
		
		
		
		
		
		
		
		MathemagticOperationsNew mathemagticOperationsNew= new MathemagticOperationsNew(111, 222, 333, 444,null);
		
		MathemagticOperationsNew mathemagticOperationsNew1=new MathemagticOperationsNew(1,2,3,4,null);
		

		MathemagticOperationsNew[] mathemagticOperationsNewArray= {mathemagticOperationsNew,mathemagticOperationsNew1};
		
		for(int i=0;i <mathemagticOperationsNewArray.length;i++)
		{
			
			MathemagticOperationsNew obj=	mathemagticOperationsNewArray[i];
			obj.addition(0,0);
			
		}
		
		int [][] arr= {{1,2},{3,4}};
		
		System.out.println(arr.length);
		
		
	}
	
}
