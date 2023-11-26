
public class Pattern34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3; 
		
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print("19 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

	}

}
