package Labb2;
import java.util.ArrayList;
import java.util.Collections;
public class Uppgift6 {


	public static void main(String[] args) {
		ArrayList<Integer> Numbers = new ArrayList<Integer>();
		java.util.Random rand = new java.util.Random();

		for(int i=0;i<=9; i++){//for loopen genererar 10 slummässiga tal
			int randomnumber= rand.nextInt();
			Numbers.add(randomnumber);
		}
		
		System.out.println("Unsorted: " + Numbers);
		System.out.println();
		Collections.sort(Numbers);//sorterar de 10 talen
		System.out.print("Sorted: ");
		
		for(int j :Numbers){ // for each-loopen skriver nu ut de 10 talen i storleksordning.  
			System.out.print(j + ", ");
		}
	}

}


