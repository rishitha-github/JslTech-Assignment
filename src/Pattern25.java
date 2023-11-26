
public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
        int count = 1;

        for (int i = 1; count <= n; i++) {
        	if(i==3)
        	{
        		i=i+1;
        	}
            for (int j = 1; j <= i && count <= n; j++) {
            	
                System.out.print(count + " ");
                count++;
               
            }
            System.out.println();
        }

	}

}
