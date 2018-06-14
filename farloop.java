
public class forllop {

	   static void foreachOps() {
	        int ar[] = { 1, 2, 3, 4, 5, 6, 7 };

	        for (int i : ar)
	            System.out.print(i + " ")
	    }

	    static void foreachMultOps() { // 
	        int ar[][] = {{13,22},{36,43},{56,68},{71,83}};

	        System.out.println( "\n\niterating over a mult. dim. array:");
	        for(int i[] : ar)
	            for (int j : i)
	              System.out.print(j + " ");
	        }

	    public static void main(String args[]) {
	        foreachOps();
	        foreachMultOps();
	    }
	}
