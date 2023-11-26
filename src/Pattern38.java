
public class Pattern38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numMatrix = {
	            {5, 6, 7},
	            {4, 5, 6},
	            {5, 6, 7}
	        };

	        int rows = numMatrix.length;
	        int columns = numMatrix[0].length;

	        int largest = numMatrix[0][0];
	        int smallest = numMatrix[0][0];
	        int sum = 0;

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                int currentElement = numMatrix[i][j];

	                if (currentElement > largest) {
	                    largest = currentElement;
	                }

	                if (currentElement < smallest) {
	                    smallest = currentElement;
	                }

	                sum += currentElement;
	            }
	        }

	        System.out.println("Largest Element: " + largest);
	        System.out.println("Smallest Element: " + smallest);
	        System.out.println("Sum1 of Elements: " + sum);

	}

}
