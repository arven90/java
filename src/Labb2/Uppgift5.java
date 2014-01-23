package Labb2;
import java.util.Arrays;
public class Uppgift5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		java.util.Random rand = new java.util.Random();


		int number= 0;

		int[] numGen = new int [10];
		System.out.print("unsorted: ");
		for(int i=0;i<numGen.length; i++){
			number= rand.nextInt();
			numGen[i]= number;
// for loopen genererar 10 slumpmässiga tal och lägger in dem i arrayen. 
			

		}
		for(int j :numGen){// for each-loopen skriver ut talen i osorterad ordning.
			System.out.print(j + ", ");
		}
		System.out.println();
		Arrays.sort(numGen);//sorterar talen
		System.out.print("Sorted: ");
		for(int j :numGen){// for each-loopen skriver ut talen som nu är sorterade.
			System.out.print(j + ", ");

		}
	}

}




