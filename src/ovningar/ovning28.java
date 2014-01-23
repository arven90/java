package ovningar;

public class ovning28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] u = null;
		int[] v = null;
		u = new int[5];
		for (int i = 0; i < u.length; i++) {
		u[i] = i + 1;
		}
		for (int i = 0; i < u.length; i++) {
		System.out.print (u[i] + " ");
		}
		System.out.println();
		v = new int[4];
		for (int i = 0; i < v.length; i++) {
		v[i] = i + 1;
		}
		for (int i = 0; i < v.length; i++) {
		System.out.print (v[i] + " ");
		}
		System.out.println();
		u = v;
		for (int i = 0; i < u.length; i++) {
		System.out.print (u[i] + " ");
		}
		System.out.println();
	}

}
