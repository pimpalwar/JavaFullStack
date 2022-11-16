import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataTypes {

	
public static void main(String[] args) {
	
	
	
	
    
	long input[] = {10,20,30,40,50,60,70,80,90,100,110,120,130,140};
	
	System.out.println("Lenght of Array "+ input.length);
	System.out.println(input[0]+input[1]+input[2]+input[3]);
	
	long addtion=0;
	
	for (int i=0; i<input.length;i++)
	{
		
		addtion+=input[i];
		
		System.out.println(" Addition till index "+i+ " is "+addtion);
		
		
		
	}
	
	System.out.println(addtion);
	
	System.out.println("End of program");
	
}
	
	
}
