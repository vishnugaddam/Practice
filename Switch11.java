package flow_Controls;

public class Switch11 {

	public static void main(String[] args) {
		//inside the switch the case label must match with provided argument data type otherwise compiler will raise compilation error “incompatible types”.
		 char ch='a';
		switch (ch)
		{ 
		//case "aaa" :System.out.println("String"); break;
		case 65 :System.out.println("int value"); break;
		case 'a' :System.out.println("char value"); break;
		default :System.out.println("default"); break;

	}

	}
}