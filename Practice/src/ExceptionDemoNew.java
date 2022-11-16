import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemoNew {

	
	
	public void divide() throws ArithmeticException
	{
		
		int k=0;
		//try {
		k=5/1;
		/*}
		catch (Exception e) {
			e.printStackTrace();
		}*/
		System.out.println(k);
		
		//throw new ArithmeticException();
	}
	
	
	public int addition(int abc, int xyz) {

		int pqr = abc + xyz;
		String message = "Addition of ";
		System.out.println(message + abc + " and " + xyz + " is " + pqr);

		return pqr;

	}
	
	public void fileReadCalculations(String calulationFilePath) throws IOException
	{
		//try
		//{
		FileReader file = new FileReader(calulationFilePath
				);

		BufferedReader fileIn = new BufferedReader(file);

		System.out.println("File Containt :");

		for (int a = 0; a < 29; a++) {

			System.out.println(fileIn.readLine() + "   ");

		}

		fileIn.close();
		
		/*}
		
		catch (Exception e) {
			e.printStackTrace();
		}*/
	}
	
	
	public void fileReadShapes(String shapesFilePath) throws IOException
	{
		//try
		//{
		FileReader file = new FileReader(shapesFilePath
				);

		BufferedReader fileIn = new BufferedReader(file);

		System.out.println("File Containt :");

		for (int a = 0; a < 29; a++) {

			System.out.println(fileIn.readLine() + "   ");

		}

		fileIn.close();
		
		/*
		 * }
		 * 
		 * catch (Exception e) { e.printStackTrace(); }
		 */
	}
	
	public static void main(String[] args) {
		
		
		ExceptionDemoNew demoNew=new ExceptionDemoNew();
		
		String calulationFilePath="C:\\Users\\fz1w285\\OneDrive-Deere&Co\\OneDrive - Deere & Co\\Documents\\personal\\FullStack Class\\FSWorkspace\\Practice\\src\\MathemagticOperations.java";
		String shapesFilePath="C:\\Users\\fz1w285\\OneDrive-Deere&Co\\OneDrive - Deere & Co\\Documents\\personal\\FullStack Class\\FSWorkspace\\Practice\\src\\Circle.java";
		try
		{
		demoNew.divide();
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		try {
		demoNew.fileReadCalculations(calulationFilePath);
		demoNew.fileReadShapes(shapesFilePath);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		demoNew.addition(10, 20);
		

		
	}
}
