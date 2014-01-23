package ovningar;

public class ovning21 {

	/**
	 * @param args
	 */

	public static void main (String[] args) {
		java.util.Random rand = new java.util.Random();
		int num = rand.nextInt(4);
		while (num != 0) {
			System.out.println(num);
			num = rand.nextInt(4);
			//loopen genererar tal mellan 0-4. den fortsätter med det tills talet blir 0. 
		}
		System.out.println("Got 0, now " +
				"we stop this sillyness.");
	}

}


