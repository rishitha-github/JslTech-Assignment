
public class Pattern35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6; 
        int col = 10; 
        int x=col/2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == n || j == x) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

	}

}
