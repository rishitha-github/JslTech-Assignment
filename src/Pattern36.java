
public class Pattern36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int col = 4;
		int x = n / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= col; j++) {
				if (i == 1 || i == x || j == 1 || j == col) {
					System.out.print("@ ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
