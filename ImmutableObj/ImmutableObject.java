import java.util.Scanner;
public class ImmutableObject {

	public static void main(String[] args) {
		float fahrenheit = 98.6f;
		float centigrade = 5f/9*(fahrenheit-32); 
		
		for(float i=0f; i<=40f; i+=4f) {
			fahrenheit = i;
			System.out.printf("%2.2f" + "\n",5f/9*(fahrenheit-32));
		}
		
		fahrenheit = 0.0f;
		while(fahrenheit <= 40) {
			System.out.printf("%2.2f" + "\n",5f/9*(fahrenheit-32));	
			fahrenheit+=4;
		}

		String[][] myArray = {
		/*cars*/							{"BMW", "Ferrari", "Lambo"} , 
		/*food*/						{"pizza", "burger", "dumpling"}
										};
		
		StopChecking(myArray);
		
		
	}

	public static void StopChecking(String[][] arr) {
		Scanner input = new Scanner(System.in);
		String  inputwords;
		boolean isin;
		System.out.println("Enter a word: ");
		inputwords = input.next();
		isin = isItIn(inputwords, arr);
		
		if (isin)
			System.out.println(inputwords + " is in the 2D array");
		else
			System.out.println(inputwords + " is not in the 2D array");
	}
	
	public static boolean isItIn(String inputwords, String[][] arr) {		
		boolean isin = false;
		if(inputwords.equals("STOP"))
			System.exit(0);
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
			if(inputwords.equals(arr[i][j]))
				isin = true;
			}
		}
		return isin;

	}
	
}

