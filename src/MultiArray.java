import java.util.Arrays;

public class MultiArray {


	public static void main(String[] args) {
		int[][] myArray = new int [3][3];
		myArray [0][0] = 1;
		myArray [0][1] = 2;
		myArray [0][2] = 3;
		myArray [1][0] = 4;
		myArray [1][1] = 5;
		myArray [1][2] = 6;
		
		for(int i=0;i<2;i++) {
			for(int j=0; j<3; j++) {
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println();
		}

		
		//fill
		int myArray2[] = new int[5];
		
		int fillValue = 15;
		
		Arrays.fill(myArray2, fillValue);
		System.out.println(Arrays.toString(myArray2));
		
	
	}


}
