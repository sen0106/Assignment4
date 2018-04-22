
public class writeSequence {

	public static void main(String[] args) {
		for(int i = 1; i < 15; i++) {
			writeSequence(i);
			System.out.println();
		}	
	}
	
	public static void writeSequence(int n) {
		
		// throw an IllegalArgumentException if it passed a value less than 1
	    if (n < 1) {
	        throw new IllegalArgumentException();
	    } else if (n == 1) {
	        System.out.print("1 ");
	    } else {
	    		// the first number
	        System.out.print((n + 1) / 2 + " ");
	       
	        if (n != 2) {
	            writeSequence(n - 2);
	        }
	        
	        // the last number
	        System.out.print((n + 1) / 2 + " ");
	    }
	}

}
