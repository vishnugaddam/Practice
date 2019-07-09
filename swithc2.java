package flow_Controls;

public class swithc2 {

	public static void main(String[] args) {
		// inside the switch case labels must be unique,if we are declaring 
		//duplicate case labels the compiler will raise compilation error “duplicate case label”.
		int a=10;
		switch(a){
		case 10: System.out.println("1st statement");
					break;
					
		case 10: System.err.println();
					
		}

	}

}
