package Labb2;

public class Uppgift4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] v = new int[3][3];
		int sum = 0;
		int rows ,cols;
		rows = 3;
		cols = 3;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				v[i][j] = i*3 + j + 1;
			// for loopen genererar matrisen.
			
			}
		}



		System.out.println ("matrix:");
		for(int i =0; i<rows; i++){
			for (int j =0; j<cols; j++){
				sum = sum + v[i][j];
				System.out.print(v[i][j] +" ");
							// loopen lägger ihop de tal som finns i arrayen
			}
			
			System.out.println();	
		}
		System.out.println("sum of all elements is: " + sum);

	}

}



