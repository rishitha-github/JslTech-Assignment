
public class Pattern37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
        int cols = 15;

        printPattern(rows, cols);
    }

    static void printPattern(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
	}


