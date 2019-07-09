package flow_Controls;

public class Switch10 {

	public static void main(String[] args) {
		//Inside the switch statement beak is optional.
		//If we are not providing break statement then from the matched case onwards up to break statement will be executed, if there is no break statement then end of the switch will be executed. This situation is called as fall though inside the switch case.
		 int a=10;
		switch (a)
		{ 
		case 10:System.out.println("10");
		case 20:System.out.println("20");
		case 40:System.out.println("40"); break;
		default: System.out.println("default"); break;
		}
		}


}
