
public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; 

        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= i * 2 - 1; j++) {
                int num = (j <= i) ? j : i * 2 - j;
                System.out.print(num + " ");
            }

            System.out.println();
        }

	}

}
