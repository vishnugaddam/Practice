package flow_Controls;

public class Switch4 {

	public static void main(String[] args) {
		/*inside the switch case labels must be constant values, if we declaring variables
		as case labels the compiler will show error.*/
		/*it is possible to declare final variables as a case labels bcz final variables are replaced with constants during compilation.*/
		
		//int a=10;
	final int b=20;
		switch(b){
		//case a:System.out.println("1st case");
		case b: System.out.println("2nd case");
		
					
		}

	}

}
