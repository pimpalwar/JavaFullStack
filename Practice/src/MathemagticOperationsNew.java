
public class MathemagticOperationsNew {

	int abc, xyz, pqr, efg;
	
	int input[];

	MathemagticOperationsNew() {

	}

	
	MathemagticOperationsNew(int a, int b, int c) {
	      this.abc=a;
	      this.xyz=b;
	      this.pqr=c;
	     
			
			
		}
	
	MathemagticOperationsNew(int a, int b, int c, int d,int input[]) {
      this.abc=a;
      this.xyz=b;
      this.pqr=c;
      this.efg=d;
      this.input=input;
		
		
	}

	public int addition(int abc, int input) {

		int pqr = this.abc + xyz;
		String message = "Addition of ";
		System.out.println(message + abc + " and " + xyz + " is " + pqr);

		return pqr;

	}

	public int addition(int abc, int xyz, int pqr) {

		int efg = abc + xyz + pqr;
		String message = "Addition of ";
		System.out.println(message + abc + " and " + xyz + " and " + pqr + " is " + efg);

		return efg;

	}

	public int addition(int abc, int xyz, int pqr, int efg) {

		int ijk = this.abc + xyz + pqr + efg;
		String message = "Addition of ";
		System.out.println(message + abc + " and " + xyz + " and " + pqr + " and " + efg + " is " + ijk);

		return ijk;

	}

	public int substraction(int abc, int xyz) {

		int pqr = abc - xyz;
		String message = "Substration of ";
		System.out.println(message + abc + " and " + xyz + " is " + pqr);
		return pqr;
	}

	public int multiplication(int abc, int xyz) {
		int pqr = abc * xyz;
		String message = "Multiplication of ";
		System.out.println(message + abc + " and " + xyz + " is " + pqr);
		return pqr;

	}

	public double division(double abc, double xyz)

	{
		int a = 0;
		double pqr = abc / xyz;
		String message = "Division of ";
		System.out.println(message + abc + " and " + xyz + " is " + pqr);
		return a;
	}

	public static void main(String[] args) {
		int xyz = 20;

		MathemagticOperationsNew mathemagticOperationsNew = new MathemagticOperationsNew(11, 21, 31, 41,null);
		int additionResult = mathemagticOperationsNew.addition(10, 20);
		int additionResult1 = mathemagticOperationsNew.addition(10, 20, 30);
		int additionResult2 = mathemagticOperationsNew.addition(10, 20, 30, 40);
		int substrationResult = mathemagticOperationsNew.substraction(additionResult, 20);
		int multiplicationResult = mathemagticOperationsNew.multiplication(5, substrationResult);
		double divisionResult = mathemagticOperationsNew.division(multiplicationResult, 2);
		
		for (int i = 0; i < mathemagticOperationsNew.input.length; i++) {
			
			System.out.println("Inside for loop");
			
		}

	}

}
