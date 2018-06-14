
public class StringBuilderDemo {
	       public static void main(String[] args) {
	        StringBuilder str = new StringBuilder("Using");
	        str.append(" Java");

	        System.out.println("Append():" + str);
	        str.append(" - powerful");

	        str.insert(5," Cool");
	        System.out.println("Insert():" + str);

	        str.delete(2,5); // index starts from 0.
	        System.out.println("Delete(): " + str);
	    }

	}

