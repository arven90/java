package ovningar;

public class Ovning29 {
	public static void main (String[] args) {
		int[][] v = new int[4][5];
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[i].length; j++) {
				v[i][j] = i + j + 1;
			}
		}
		int[][] u = v;
		u[0][0] = 9;
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[i].length; j++) {
				System.out.print(v[i][j] + " ");
			}
			System.out.println();
		}

	}
}

