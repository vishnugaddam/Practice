package flow_Controls;

public class Switch14 {

	public static void main(String[] args) {
		// we can pass String as argument in switch from 1.7 version
		String str = "aaa";
		switch (str)
		{ 
		case "aaa" : System.out.println("Hai"); break;
		case "bbb" : System.out.println("Hello"); break;
		case "ccc" : System.out.println("how"); break;
		default : System.out.println("what"); break;
		}

	}

}
