import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {

	public void readFileFromShapes(String filePath) throws IOException

	{


			FileReader file = new FileReader(filePath);

			BufferedReader fileIn = new BufferedReader(file);

			System.out.println("File Containt :");

			for (int i = 0; i < 29; i++) {

				System.out.println(fileIn.readLine() + "   ");

			}

			fileIn.close();
			
			throw new ArithmeticException("Throwing Arithematic exception");


	}

	public void readFileFromCalculations(String filePath) throws IOException

	{

			FileReader file = new FileReader(filePath);

			BufferedReader fileIn = new BufferedReader(file);

			System.out.println("File Containt :");

			for (int i = 0; i < 29; i++) {

				System.out.println(fileIn.readLine() + "   ");

			}

			fileIn.close();


	}

	public void divide() {

		try {
			int a = 5;
			int b = 1;

			int c = a / b;

			System.out.println("Division " + c);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public int addition(int abc, int xyz) {

		int pqr = abc + xyz;
		String message = "Addition of ";
		System.out.println(message + abc + " and " + xyz + " is " + pqr);

		return pqr;

	}

	public static void main(String[] args) {

		ExceptionDemo exceptionDemo = new ExceptionDemo();

		String filePathOfCalculations = "C:\\Users\\fz1w285\\OneDrive-Deere&Co\\OneDrive - Deere & Co\\Documents\\personal\\FullStack Class\\FSWorkspace\\Practice\\src\\MathemagticOperationsOld.java";

		String filePathOfShapes = "C:\\Users\\fz1w285\\OneDrive-Deere&Co\\OneDrive - Deere & Co\\Documents\\personal\\FullStack Class\\FSWorkspace\\Practice\\src\\Circle.java";

		try {

			exceptionDemo.readFileFromShapes(filePathOfShapes);

			exceptionDemo.readFileFromCalculations(filePathOfCalculations);

		} catch (IOException e) {
			e.printStackTrace();
		}

		exceptionDemo.divide();

		exceptionDemo.addition(10, 20);

	}

}
